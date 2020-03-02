package echec_javafx;



import javafx.scene.*;
import javafx.scene.image.Image;

import java.io.InputStream;
import java.nio.file.Files;

import java.nio.file.Paths;

import javafx.scene.image.*;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import echec_client.controleurs.ControleurParametre;
import echec_client.vues.VueParametreFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;

import commun.debogage.J;
import echec_javafx.Principal;
import echec_javafx.controleurs.ControleurParametreFX;
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
		/*
		
		DialogueModal.enregistreFenetrePrincipale(fenetrePrincipale);
		
		ChargeurDeVue<VueParametreFX> chargeur;
		
		chargeur = new ChargeurDeVue<>("/fxml/parametre.xml","traductions.chaines","/css/partieLocale.css");
		
		VueParametreFX vue = chargeur.getVue();
		
		DoitEtre.nonNul(vue);
		
		FabriqueControleur.creerControleur(ControleurParametreFX.class, vue);
		
		Scene scene = chargeur.nouvelleScene(400, 260);
		//scene.getStylesheets().add();
		DoitEtre.nonNul(scene);
		
		
		*/
		
		Scene scene = creerScenePrincipale();
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.show();
		

		
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