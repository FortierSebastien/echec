package commun_client.commandes.fermer_Music;

import commun.debogage.J;
import commun_client.commandes.Commande;
import javafx.scene.media.MediaPlayer;


public class FermerMusic extends Commande<FermerMusicPourEnvoi, 
FermerMusicRecue>

implements FermerMusicPourEnvoi,
FermerMusicRecue  {
	private MediaPlayer player;
	
	

}
