package echec_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import Commande.NouvellePartie;
import Commande.NouvellePartiePourEnvoi;
import Commande.OuvrirParametrePourEnvoie;
import Commande.OuvrirParametres;
import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import echec_client.vues.VueMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import echec_javafx.vues.VuePageFX;

public class VueMenuFX implements VueMenu, Initializable {

	@FXML
	Button boutonNouvellePartie, boutonParametres;

	@FXML
	VBox conteneurPartie;
	OuvrirParametrePourEnvoie ouvrirParametresPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);

		DoitEtre.nonNul(boutonNouvellePartie);
		DoitEtre.nonNul(boutonParametres);

	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		ouvrirParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(OuvrirParametres.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);

	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		boutonNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

			}
		});
		boutonParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				ouvrirParametresPourEnvoi.envoyerCommande();

			}
		});

		boutonNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				nouvellePartiePourEnvoi.envoyerCommande();
			}
		});

	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);

	}

}
