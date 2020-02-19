package jeu_echec.vues.composants;

import commun.debogage.J;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class MonAnimation extends Pane {
/*	final int WIDTH = (int) this.getWidth();
    final int HEIGHT = (int) this.getHeight();*/
	
	final int WIDTH = 400;
    final int HEIGHT = 120;
    
    double ballRadius = 20;
    double ballX = 50;
    double ballY = 100;  
    double xSpeed = 4;
    
    public MonAnimation(){      
    	super();

        Circle circle = new Circle();
        circle.setCenterX(ballX);
        circle.setCenterY(ballY);
        circle.setRadius(ballRadius);
        circle.setFill(Color.WHEAT);
        this.getChildren().add(circle);

        AnimationTimer animator = new AnimationTimer(){

            @Override
            public void handle(long arg0) {
            	J.appel(this);

                // UPDATE
                ballX += xSpeed;

                if (ballX + ballRadius >= WIDTH)
                {
                    ballX = WIDTH - ballRadius;
                    xSpeed *= -1;
                } 
                else if (ballX - ballRadius < 0) 
                {
                    ballX = 0 + ballRadius;
                    xSpeed *= -1;
                }

                // RENDER
                circle.setCenterX(ballX);
            }      
        };

        animator.start();     
    }


}
