package echec_javafx.afficheurs;

import commun.debogage.J;
import echec.modeles.ParametreLectureSeule;
import echec_client.afficheurs.AfficheurParametre;
import echec_client.vues.VueParametreFX;

public class AfficheurParametreFX extends AfficheurParametre<VueParametreFX>{

	@Override
	public void initialiserAffichage(ParametreLectureSeule modeleLectureSeule, VueParametreFX vue) {
		
		J.appel(this);
	}

	@Override
	public void rafraichirAffichage(ParametreLectureSeule modeleLectureSeule, VueParametreFX vue) {
		J.appel(this);
		
	}

}
