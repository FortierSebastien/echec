package echec_javafx;



import javafx.scene.*;
import javafx.scene.image.Image;

import java.io.InputStream;
import java.nio.file.Files;

import java.nio.file.Paths;

import javafx.scene.image.*;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;

import commun.debogage.J;
import echec_javafx.Principal;
import javafx.scene.shape.ArcType;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;




public class Principal extends Application {
	
	//jeuMenu gameMenu;
	
	final int WIDTH = 600;
    final int HEIGHT = 400;
    
    double ballRadius = 40;
    double ballX = 100;
    double ballY = 200;  
    double xSpeed = 4;
	
	static {
		J.appel(Principal.class);
		
		Initialisateur.initialiser();
		
	}
	
	public static void main(String[] args) {
		J.appel(Principal.class);
		
		launch(args);
	}
	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		Scene scene = creerScenePrincipale();
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.show();
		
	//}
		/*
		Pane root = new Pane();
		root.setPrefSize(900, 700);

		
		
		InputStream js = Files.newInputStream(Paths.get("images/background.gif"));
		
		
		Image img = new Image(js) ;
		
		js.close();
		
		ImageView imgV = new ImageView(img);
		
		imgV.setFitHeight(700);
		imgV.setFitWidth(900);
		
		gameMenu = new jeuMenu();
		
		root.getChildren().addAll(imgV,gameMenu);
		
		Scene scene = new Scene(root);
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.show();
		*/
		
		
		
		 	

	     /*   Group root = new Group();
	        Scene scene = new Scene(root);

	        Circle circle = new Circle();
	        circle.setCenterX(ballX);
	        circle.setCenterY(ballY);
	        circle.setRadius(ballRadius);
	        circle.setFill(Color.BLUE);
	        root.getChildren().add(circle);

	        fenetrePrincipale.setScene(scene);
	        fenetrePrincipale.show();

	        AnimationTimer animator = new AnimationTimer(){

	            @Override
	            public void handle(long arg0) {

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
	    
		*/
		
	}
	private Scene creerScenePrincipale() {
		J.appel(this);
		
		ChargeurDeVue chargeur = new ChargeurDeVue("/fxml/principal.xml","traductions.chaines","/css/partieLocale.css");
		
		Scene scene = chargeur.nouvelleScene(400, 260);
		//scene.getStylesheets().add();
		DoitEtre.nonNul(scene);
		
		return scene;
	}
	
	@Override
	public void stop() {
		J.appel(this);
	}
	
	/*public class jeuMenu extends Parent{
		public jeuMenu() {
			VBox root = new VBox(10);
		}
	}*/
	
    }