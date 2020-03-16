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
import echec_javafx.vues.VuePageFx;
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

		ChargeurDeVue<VuePageFx> chargeur = creerChargeurPages();

		installerSceneAccueil(fenetrePrincipale, chargeur);

		instancierMVCAccueil(chargeur);

		fenetrePrincipale.show();

	}

	private void instancierMVCAccueil(ChargeurDeVue<VuePageFx> chargeur) {
		J.appel(this);

		VuePageFx vue = chargeur.getVue();

		DoitEtre.nonNul(vue);

		FabriqueControleur.creerControleur(ControleurMenuFX.class, vue);
	}

	private void installerSceneAccueil(Stage fenetrePrincipale, ChargeurDeVue<VuePageFx> chargeur) {
		J.appel(this);

		Scene scene = chargeur.nouvelleScene(50, 50, 2);

		fenetrePrincipale.setScene(scene);

//fenetrePrincipale.setWidth(Constantes.LARGEUR);
//fenetrePrincipale.setHeight(Constantes.HAUTEUR);
		fenetrePrincipale.setFullScreen(true);
	}

	private ChargeurDeVue<VuePageFx> creerChargeurPages() {
		J.appel(this);

		ChargeurDeVue<VuePageFx> chargeur = new ChargeurDeVue<VuePageFx>(CHEMIN_PAGES_FXML, CHEMIN_CHAINES,
				CHEMIN_PAGES_CSS);

		return chargeur;
	}
}