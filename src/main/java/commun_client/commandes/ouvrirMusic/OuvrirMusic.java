package commun_client.commandes.ouvrirMusic;

import commun_client.commandes.Commande;
import commun_client.commandes.retour_accueil.RetourAccueilPourEnvoi;
import commun_client.commandes.retour_accueil.RetourAccueilRecue;

public class OuvrirMusic extends Commande<OuvrirMusicPourEnvoi, 
OuvrirMusicRecue>

implements OuvrirMusicPourEnvoi,
OuvrirMusicRecue {

}
