package echec_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_client.commandes.retour_accueil.RetourAccueil;
import commun_client.commandes.retour_accueil.RetourAccueilPourEnvoi;
import echec_client.vues.VuePartieLocale;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {

	@FXML
	private Button boutonRetour;
	private RetourAccueilPourEnvoi retourAccueil;
	
	
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		retourAccueil = FabriqueCommande.obtenirCommandePourEnvoi(RetourAccueil.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		boutonRetour.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				retourAccueil.envoyerCommande();
			}
		});
		
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DoitEtre.nonNul(boutonRetour);
		
	}

}
