package echec_javafx.controleurs;

import commun.debogage.J;
import echec_client.controleurs.ControleurPartieLocale;
import echec_javafx.afficheurs.AfficheurPartieLocaleFX;
import echec_javafx.vues.VuePartieLocaleFX;

public class ControleurPartieLocaleFX extends ControleurPartieLocale<VuePartieLocaleFX, AfficheurPartieLocaleFX>{

	@Override
	protected void installerReceptionCommandes() {
		
		J.appel(this);
		
	}

}
