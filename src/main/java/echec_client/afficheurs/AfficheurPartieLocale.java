package echec_client.afficheurs;

import commun_client.mvc.Afficheur;
import echec.modeles.PartieLocaleLectureSeule;
import echec_client.vues.VuePartieLocale;

public abstract class AfficheurPartieLocale <V extends VuePartieLocale> 

extends Afficheur<PartieLocaleLectureSeule, 
                  V>  {

}
