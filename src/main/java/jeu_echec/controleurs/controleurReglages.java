package jeu_echec.controleurs;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class controleurReglages implements Initializable{
	@FXML
	private StackPane conteneurPrincipal;
	@FXML
	private VBox anchPane;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		anchPane.setAlignment(Pos.CENTER);
		//conteneurPrincipal.getChildren().clear();
		Canvas c = new Canvas(500,500);
		GraphicsContext gc = c.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillRect(0, 0, 500, 500);
		
		
		conteneurPrincipal.getChildren().add(0,c);
		
		new AnimationTimer() {
            private double x ;
			private double y ;
			private double a=5;
			  private double w ;
				private double z ;
				private double b=-5;
			

			@Override public void handle(long currentNanoTime) {
				
				gc.clearRect(0, 0, 500, 500);
				gc.setFill(Color.INDIANRED);
				gc.fillRect(0, 0, 500, 500);
				gc.setFill(Color.BLUE);
				gc.fillOval(x, y, 55, 55);
				if(x>485)a=-a;
				if(x<0)a=-a;
				x+=a;
				y=(x+5)*(x*0.002);
				
				gc.fillOval(w+485, z, 55, 55);
				gc.setFill(Color.LIGHTBLUE);
				if(x>485)b=-b;
				if(x<0)b=-b;
				w+=b;
				z=(-x-5)*(w*0.002);
				}
        }.start();
	} 
}
