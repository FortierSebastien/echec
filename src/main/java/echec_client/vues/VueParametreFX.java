package echec_client.vues;


import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import echec.modeles.Parametre;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class VueParametreFX implements VueParametre,Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		
		
	}
	public void handle(ActionEvent event) {
		J.appel(this);
		
	//	ouvrirParametresPourEnvoie.envoyerCommande();
	}

	
	//menuParametre.setOnAction(new EventHandler<ActionEvent>()){
	
		
	//}
	
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
	}

}
