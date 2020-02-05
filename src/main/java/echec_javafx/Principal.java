package echec_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
	
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

}