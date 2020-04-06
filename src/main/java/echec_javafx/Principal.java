package echec_javafx;

import static echec_javafx.Constantes.CHEMIN_CHAINES;
import static echec_javafx.Constantes.CHEMIN_PAGES_CSS;
import static echec_javafx.Constantes.CHEMIN_PAGES_FXML;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import echec_javafx.controleurs.ControleurMenuFX;
import echec_javafx.vues.VuePageFX;
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

		FabriqueControleur.creerControleur(ControleurMenuFX.class, vue);
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