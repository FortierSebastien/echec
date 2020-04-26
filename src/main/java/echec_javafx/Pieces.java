package echec_javafx;

import javafx.scene.image.Image;
import echec_javafx.jeuEchec;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Pieces extends StackPane {
	int tile = jeuEchec.TILE_SIZE;
	public PieceType type;
	public  double sourisX, sourisY;
	public  double ancienX, ancienY;
	
	
	public  double getSourisX() {
		return sourisX;
	}

	public  void setSourisX(double sourisX) {
		this.sourisX = sourisX;
	}

	public  double getSourisY() {
		return sourisY;
	}

	public  void setSourisY(double sourisY) {
		this.sourisY = sourisY;
	}

	public  void setAncienX(double ancienX) {
		this.ancienX = ancienX;
	}

	public  void setAncienY(double ancienY) {
		this.ancienY = ancienY;
	}

	public PieceType getType() {
		return type;

	}
	
	public  double getAncienX() {
		return ancienX;
	}
	
	public  double getAncienY() {
		return ancienY;
	}

	public Pieces(PieceType type, int x, int y) {

		this.type = type;

		move(x , y );

		Ellipse ellipse = new Ellipse(tile * 0.3125, tile * 0.26);
		ellipse.setFill(type == PieceType.noir ? Color.BLACK : Color.WHITE);

		ellipse.setStroke(Color.BLACK);
		ellipse.setStrokeWidth(tile * 0.03);

		ellipse.setTranslateX((tile - tile * 0.3125 * 2) / 2);
		ellipse.setTranslateY((tile - tile * 0.26 * 2) / 2);

		getChildren().add(ellipse);
		
//		this.setOnMouseClicked(e->{
			
//			sourisX = e.getSceneX();
//			sourisY = e.getSceneY();
			
//		});
		
//		this.setOnMouseDragged(e->{
//			relocate(e.getSceneX() - sourisX + ancienX, e.getSceneY() - sourisY + ancienY);
//		});

	}
	
	public void move(int x, int y) {
		ancienX = x*tile;
		ancienY = y * tile;
		
		relocate(ancienX, ancienY);
	}
	public void cancellerMouvement() {
		relocate(ancienX, ancienY);
	}

}
