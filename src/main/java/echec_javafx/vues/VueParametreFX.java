package echec_javafx.vues;


import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_client.commandes.ChangerLocale.ChangerLocale;
import commun_client.commandes.ChangerLocale.ChangerLocalePourEnvoi;
import commun_client.commandes.retour_accueil.RetourAccueil;
import commun_client.commandes.retour_accueil.RetourAccueilPourEnvoi;
import commun_javafx.Constantes;
import echec_client.vues.VueParametre;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;

public class VueParametreFX implements VueParametre,Initializable{

	@FXML
	private Text titreParametres;
	
	
	
	@FXML
	private Button boutonChangerLangue, boutonRetour, boutonMusic;
	private RetourAccueilPourEnvoi retourAccueil;
	private ChangerLocalePourEnvoi changerLocale;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		//DoitEtre.nonNul(titreParametres);
		DoitEtre.nonNul(boutonChangerLangue);
		//DoitEtre.nonNul(boutonMusic);
	
		DoitEtre.nonNul(boutonRetour);

		
	}
	public void handle(ActionEvent event) {
		J.appel(this);
		
	    
	}

	
	//menuParametre.setOnAction(new EventHandler<ActionEvent>()){
	
		
	//}
	
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		changerLocale = FabriqueCommande.obtenirCommandePourEnvoi(ChangerLocale.class);
		
		retourAccueil = FabriqueCommande.obtenirCommandePourEnvoi(RetourAccueil.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		boutonRetour.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				retourAccueil.envoyerCommande();
				
			}
		});
		
		
		boutonChangerLangue.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				changerLocale.setLocale(choisirProchaineLangue());
				changerLocale.envoyerCommande();
			}
		});
	
		
	}
	
	private Locale choisirProchaineLangue() {
		J.appel(this);
		
		Locale prochaineLangue = Locale.CANADA_FRENCH;

		if(Locale.getDefault() == Locale.CANADA_FRENCH) {
			
			prochaineLangue = Locale.CANADA;
		}
		
		return prochaineLangue;
	}

	
	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}

}
