package echec_javafx.vues;


import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import echec_client.vues.VueParametre;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class VueParametreFX implements VueParametre,Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		
		
	}
	public void handle(ActionEvent event) {
		J.appel(this);
		
	    
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
	@Override
	public void verifierCommandesPossibles() {
		// TODO Auto-generated method stub
		
	}

}
