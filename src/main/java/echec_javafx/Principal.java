package echec_javafx;

import static echec_javafx.Constantes.CHEMIN_CHAINES;
import static echec_javafx.Constantes.CHEMIN_PAGES_CSS;
import static echec_javafx.Constantes.CHEMIN_PAGES_FXML;

import java.net.URL;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import echec_javafx.controleurs.ControleurPagesFX;
import echec_javafx.vues.VuePageFX;
import echec_javafx.vues.VueParametreFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
public class Principal extends Application {

	private MediaPlayer player;
	
	static {
		Initialisateur.initialiser();
		J.appel(Principal.class);


	}

	public static void main(String[] args) {
		J.appel(Principal.class);

		launch(args);
	}

	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);

		/*URL urlMusic = jeuEchec.class.getResource("/Son/Electro-blues-groovy-lounge-track.mp3");
		Media music = new Media(urlMusic.toURI().toString());
		player = new MediaPlayer(music);
		//player.autoPlayProperty();
		//player.setCycleCount(M);
		player.setStartTime(Duration.ZERO);
		player.setStopTime(Duration.INDEFINITE);
		player.play();*/
		
		
		
		
		DialogueModal.enregistreFenetrePrincipale(fenetrePrincipale);

		ChargeurDeVue<VuePageFX> chargeur = creerChargeurPages();

		installerSceneAccueil(fenetrePrincipale, chargeur);

		instancierMVCAccueil(chargeur);

		fenetrePrincipale.show();
		

	}

	private void instancierMVCAccueil(ChargeurDeVue<VuePageFX> chargeur) {
		J.appel(this);

		VuePageFX vue = chargeur.getVue();

		DoitEtre.nonNul(vue);

		FabriqueControleur.creerControleur(ControleurPagesFX.class, vue);
	}

	private void installerSceneAccueil(Stage fenetrePrincipale, ChargeurDeVue<VuePageFX> chargeur) {
		J.appel(this);

		Scene scene = chargeur.nouvelleScene(50, 50, 2);

		fenetrePrincipale.setScene(scene);
		
		

//fenetrePrincipale.setWidth(Constantes.LARGEUR);
//fenetrePrincipale.setHeight(Constantes.HAUTEUR);
		fenetrePrincipale.setFullScreen(true);
	}

	private ChargeurDeVue<VuePageFX> creerChargeurPages() {
		J.appel(this);

		ChargeurDeVue<VuePageFX> chargeur = new ChargeurDeVue<VuePageFX>(CHEMIN_PAGES_FXML, CHEMIN_CHAINES,
				CHEMIN_PAGES_CSS);

		return chargeur;
	}
}