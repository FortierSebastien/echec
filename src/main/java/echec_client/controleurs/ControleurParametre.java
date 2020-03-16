package echec_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import echec.modeles.Parametre;
import echec.modeles.ParametreLectureSeule;
import echec_client.afficheurs.AfficheurParametre;
import echec_client.vues.VueParametre;

public abstract class ControleurParametre<V extends VueParametre, A extends AfficheurParametre<V>>

		extends ControleurModeleVue<ParametreLectureSeule, Parametre, V, A> {

	@Override
	protected void demarrer() {
		J.appel(this);
	}

}
