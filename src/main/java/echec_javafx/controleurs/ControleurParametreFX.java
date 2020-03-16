package echec_javafx.controleurs;

import commun.debogage.J;
import echec_client.controleurs.ControleurParametre;
import echec_javafx.afficheurs.AfficheurParametreFX;
import echec_javafx.vues.VueParametreFX;


public class ControleurParametreFX extends ControleurParametre<VueParametreFX,AfficheurParametreFX> {

	@Override
	public void demarrer() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}

}
