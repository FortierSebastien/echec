package echec_javafx.afficheurs;

import commun.debogage.J;
import echec.modeles.PartieLocaleLectureSeule;
import echec_client.afficheurs.AfficheurPartieLocale;
import echec_javafx.vues.VuePartieLocaleFX;

public class AfficheurPartieLocaleFX  extends AfficheurPartieLocale<VuePartieLocaleFX>{

	@Override
	public void initialiserAffichage(PartieLocaleLectureSeule modeleLectureSeule, VuePartieLocaleFX vue) {
		J.appel(this);
		
	}

	@Override
	public void rafraichirAffichage(PartieLocaleLectureSeule modeleLectureSeule, VuePartieLocaleFX vue) {
		J.appel(this);
		
	}



}
