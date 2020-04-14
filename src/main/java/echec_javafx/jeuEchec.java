package echec_javafx;

import java.awt.HeadlessException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class jeuEchec extends Application {

	public static final int TILE_SIZE = 100;
	public static final int LARGEUR = 8;
	public static final int HAUTEUR = 8;
	
	private Group tileGroup = new Group();
	private Group pieceGroup = new Group();
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(createContent());
		primaryStage.setTitle("Chess");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(LARGEUR*TILE_SIZE, HAUTEUR*TILE_SIZE);
		root.getChildren().addAll(tileGroup,pieceGroup);
		
		for (int y = 0; y< HAUTEUR; y++) {
			for (int x = 0; x < LARGEUR; x++) {
				Tile tile = new Tile((x+y)%2==0, x, y);
				tileGroup.getChildren().add(tile);
			}
		}
		
		
		return root;
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
