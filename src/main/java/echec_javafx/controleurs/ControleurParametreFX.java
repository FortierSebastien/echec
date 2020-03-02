package echec_javafx.controleurs;

import commun.debogage.J;
import echec_client.afficheurs.AfficheurParametre;
import echec_client.controleurs.ControleurParametre;
import echec_client.vues.VueParametreFX;
import echec_javafx.afficheurs.AfficheurParametreFX;


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
