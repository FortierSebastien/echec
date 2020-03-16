package echec_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import echec.modeles.PartieLocale;
import echec.modeles.PartieLocaleLectureSeule;
import echec_client.afficheurs.AfficheurPartieLocale;
import echec_client.vues.VuePartieLocale;

public abstract class  ControleurPartieLocale <V extends VuePartieLocale,
   A extends AfficheurPartieLocale<V>> 

extends ControleurModeleVue<PartieLocaleLectureSeule, 
   PartieLocale, 
   V, 
   A> {
	
	@Override
	protected void demarrer() {
		J.appel(this);
	}

}
