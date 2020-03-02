package echec_client.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import javafx.fxml.Initializable;

public class VueParametreFX implements VueParametre,Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
	}

}
