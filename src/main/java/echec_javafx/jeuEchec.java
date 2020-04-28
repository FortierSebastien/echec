package echec_javafx;

import java.awt.HeadlessException;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;

import commun.debogage.J;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.PickResult;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class jeuEchec extends Application {

	public static final int TILE_SIZE = 100;
	public static final int LARGEUR = 8;
	public static final int HAUTEUR = 8;

	public  Tile[][] board = new Tile[LARGEUR][HAUTEUR];
	public ArrayList<Pieces> piecesList = new ArrayList<>();

	private static Group tileGroup = new Group();
	private static Group pieceGroup = new Group();
	
	private MediaPlayer player;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		URL urlMusic = jeuEchec.class.getResource("/Son/Electro-blues-groovy-lounge-track.mp3");
		
		Media music = new Media(urlMusic.toURI().toString());
		player = new MediaPlayer(music);
		player.setCycleCount(MediaPlayer.INDEFINITE);
		player.play();

		Scene scene = new Scene(createContent());
		primaryStage.setTitle("Chess");
		primaryStage.setScene(scene);
		primaryStage.show();
		
			
	}

	public Parent createContent() {
		
		for (int i = 0; i < piecesList.size(); i++) {
			
			
			int x0 = pixelBoard(piecesList.get(i).getAncienX());
			int y0 = pixelBoard(piecesList.get(i).getAncienY());
			
			board[pixelBoard(x0)][pixelBoard(y0)].setPiece(null);
			
			pieceGroup.getChildren().remove(piecesList.get(i));
			
			

		}
		piecesList.clear();

		Pane root = new Pane();
		root.setPrefSize(LARGEUR * TILE_SIZE, HAUTEUR * TILE_SIZE);
		root.getChildren().addAll(tileGroup, pieceGroup);
		for (int y = 0; y < HAUTEUR; y++) {
			for (int x = 0; x < LARGEUR; x++) {
				Tile tile = new Tile((x + y) % 2 == 0, x, y);

				board[x][y] = tile;

				tileGroup.getChildren().add(tile);

				Pieces piece = null;

				if (y <= 2 && (x + y) % 2 != 0) {
					piece = fairePieces(PieceType.noir, x, y);
				}

				if (y >= 5 && (x + y) % 2 != 0) {
					piece = fairePieces(PieceType.blanc, x, y);
				}

				if (piece != null) {
					tile.setPiece(piece);
					pieceGroup.getChildren().add(piece);
					piecesList.add(piece);
				}
			}
		}

		return root;

	}

	public  MoveResult essaiMouvement(Pieces piece, int nouveauX, int nouveauY) {
		// peut pas bouger tuile blanche
		if (board[nouveauX][nouveauY].hasPiece() || (nouveauX + nouveauY) % 2 == 0) {
			return new MoveResult(MoveType.AUCUN);
		}
		int x0 = pixelBoard(piece.getAncienX());
		int y0 = pixelBoard(piece.getAncienY());

		if (Math.abs(nouveauX - x0) == 1 && nouveauY - y0 == piece.getType().moveDire) {

			return new MoveResult(MoveType.REGULIER);

		} else if (Math.abs(nouveauX - x0) == 2 && nouveauY - y0 == piece.getType().moveDire * 2) {

			int x1 = x0 + (nouveauX - x0) / 2;
			int y1 = y0 + (nouveauY - y0) / 2;

			if (board[x1][y1].hasPiece() && board[x1][y1].getPiece().getType() != piece.getType()) {
				return new MoveResult(MoveType.ATTAQUE, board[x1][y1].getPiece());
			}
		}

		return new MoveResult(MoveType.AUCUN);
	}

	public static int pixelBoard(double pixel) {
		return (int) (pixel + TILE_SIZE / 2) / TILE_SIZE;
	}

	public  Pieces fairePieces(PieceType type, int x, int y) {
		Pieces piece = new Pieces(type, x, y);

		piece.setOnMousePressed(e -> {

			piece.setSourisX(e.getSceneX());
			piece.setSourisY(e.getSceneY());

		});

		piece.setOnMouseDragged(e -> {
			piece.relocate(e.getSceneX() - piece.getSourisX() + piece.getAncienX(),
					e.getSceneY() - piece.getSourisY() + piece.getAncienY());
		});

		piece.setOnMouseReleased(e -> {
			int nouveauX = pixelBoard(piece.getLayoutX());
			int nouveauY = pixelBoard(piece.getLayoutY());

			MoveResult resultat = essaiMouvement(piece, nouveauX, nouveauY);

			int x0 = pixelBoard(piece.getAncienX());
			int y0 = pixelBoard(piece.getAncienY());

			switch (resultat.getType()) {
			case ATTAQUE:
				piece.move(nouveauX, nouveauY);
				board[x0][y0].setPiece(null);
				board[nouveauX][nouveauY].setPiece(piece);
				Pieces autrePiece = resultat.getPiece();
				board[pixelBoard((autrePiece.getAncienX()))][pixelBoard((autrePiece.getAncienY()))].setPiece(null);
				pieceGroup.getChildren().remove(autrePiece);
				break;
			case AUCUN:
				piece.cancellerMouvement();
				break;
			case REGULIER:
				piece.move(nouveauX, nouveauY);
				board[x0][y0].setPiece(null);
				board[nouveauX][nouveauY].setPiece(piece);

				break;

			}

		});

		return piece;

	}

	public static void main(String[] args) {
		launch(args);
	}

}
