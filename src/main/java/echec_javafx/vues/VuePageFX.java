package echec_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import echec_client.vues.VuePages;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import static echec_javafx.Constantes.*;

public class VuePageFX implements VuePages, Initializable {
	
	@FXML
	VBox conteneurAccueil, conteneurPartie, conteneurParametres;

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle ressources) {
		DoitEtre.nonNul(conteneurAccueil);
		DoitEtre.nonNul(conteneurPartie);
		DoitEtre.nonNul(conteneurParametres);
		
	}
	
	public VueParametreFX creerVueParametres() {
		J.appel(this);

		ChargeurDeVue<VueParametreFX> chargeur;
		chargeur = new ChargeurDeVue<VueParametreFX>(CHEMIN_PARAMETRES_FXML,
						CHEMIN_CHAINES,
						CHEMIN_PARAMETRES_CSS);
		
		VueParametreFX vueParametresFX = chargeur.getVue();
		
		Parent parent = chargeur.getParent();
		
		conteneurParametres.getChildren().clear();
		conteneurParametres.getChildren().add(parent);
		
		return vueParametresFX;
		
	}
	
	public VueMenuFX creerVueMenu() {
		J.appel(this);

		ChargeurDeVue<VueMenuFX> chargeur;
		chargeur = new ChargeurDeVue<VueMenuFX>(CHEMIN_ACCUEIL_FXML,
						CHEMIN_CHAINES,
						CHEMIN_ACCUEIL_CSS);
		
		VueMenuFX vueAcceuil = chargeur.getVue();
		
		Parent parent = chargeur.getParent();
		
		conteneurAccueil.getChildren().clear();
		conteneurAccueil.getChildren().add(parent);
		
		return vueAcceuil;
		
	}
	
	public VuePartieLocaleFX creerVuePartieLocale() {
		J.appel(this);

		ChargeurDeVue<VuePartieLocaleFX> chargeur;
		chargeur = new ChargeurDeVue<VuePartieLocaleFX>(CHEMIN_PARTIE_LOCALE_FXML,
						CHEMIN_CHAINES,
						CHEMIN_PARTIE_LOCALE_CSS);
		
		VuePartieLocaleFX vuePartieLocale = chargeur.getVue();
		
		Parent parent = chargeur.getParent();
		
		conteneurPartie.getChildren().clear();
		conteneurPartie.getChildren().add(parent);
		
		return vuePartieLocale;
	}
	public void afficherPageAccueil() {
		J.appel(this);
		
		conteneurAccueil.setVisible(true);
		conteneurParametres.setVisible(false);
		conteneurPartie.setVisible(false);
	}

	public void afficherPageParametres() {
		J.appel(this);

		conteneurAccueil.setVisible(false);
		conteneurParametres.setVisible(true);
		conteneurPartie.setVisible(false);
	}

	public void afficherPagePartieLocale() {
		J.appel(this);

		conteneurAccueil.setVisible(false);
		conteneurParametres.setVisible(false);
		conteneurPartie.setVisible(true);
	}

}
