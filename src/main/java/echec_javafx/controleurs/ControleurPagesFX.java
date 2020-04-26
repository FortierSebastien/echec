package echec_javafx.controleurs;

import java.util.Locale;

import Commande.NouvellePartie;
import Commande.NouvellePartieRecue;
import Commande.OuvrirParametres;
import Commande.OuvrirParametresRecue;
import commun.debogage.J;
import commun_client.commandes.ChangerLocale.ChangerLocale;
import commun_client.commandes.ChangerLocale.ChangerLocaleRecue;
import commun_client.commandes.retour_accueil.RetourAccueil;
import commun_client.commandes.retour_accueil.RetourAccueilRecue;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import echec.modeles.Parametre;
import echec.modeles.ParametreLectureSeule;
import echec.modeles.PartieLocale;
import echec_client.controleurs.ControleurPages;
import echec_javafx.afficheurs.AfficheurParametreFX;
import echec_javafx.afficheurs.AfficheurPartieLocaleFX;
import echec_javafx.vues.VueMenuFX;
import echec_javafx.vues.VuePageFX;
import echec_javafx.vues.VueParametreFX;
import echec_javafx.vues.VuePartieLocaleFX;

public class ControleurPagesFX extends ControleurPages<VuePageFX> {

	private static final Parametre parametres = new Parametre();

	public static ParametreLectureSeule getParametres() {
		J.appel(ControleurMenuFX.class);

		return (ParametreLectureSeule) parametres;
	}

	private PartieLocale partie = new PartieLocale();

	@Override
	protected void installerReceptionCommandes() {

		J.appel(this);

		installerRecepteurCommande(OuvrirParametres.class, new RecepteurCommandeMVC<OuvrirParametresRecue>() {
			@Override
			public void executerCommandeMVC(OuvrirParametresRecue commande) {
				J.appel(this);

				vue.afficherPageParametres();
			}
		});

		installerRecepteurCommande(RetourAccueil.class, new RecepteurCommandeMVC<RetourAccueilRecue>() {

			@Override
			public void executerCommandeMVC(RetourAccueilRecue commande) {
				J.appel(this);

				vue.afficherPageAccueil();

			}

		});

		installerRecepteurCommande(NouvellePartie.class, new RecepteurCommandeMVC<NouvellePartieRecue>() {
			@Override
			public void executerCommandeMVC(NouvellePartieRecue commande) {
				J.appel(this);

				nouvellePartieLocale();
				vue.afficherPagePartieLocale();
			}
		});
		
		installerRecepteurCommande(ChangerLocale.class, new RecepteurCommandeMVC<ChangerLocaleRecue>() {
			@Override
			public void executerCommandeMVC(ChangerLocaleRecue commande) {
				J.appel(this);
				
				Locale.setDefault(commande.getLocale());
				
				instancierMVCParametres();
				instancierMVCAccueil();
			}
		});

	}

	@Override
	protected void demarrer() {

		J.appel(this);

		instancierMVCParametres();
		instancierMVCAccueil();

	}

	private void instancierMVCParametres() {
		J.appel(this);

		VueParametreFX vueParametresFX = vue.creerVueParametres();

		AfficheurParametreFX afficheurParametresFX = new AfficheurParametreFX();

		FabriqueControleur.creerControleur(ControleurParametreFX.class, parametres, vueParametresFX,
				afficheurParametresFX);
	}

	private void instancierMVCAccueil() {
		J.appel(this);

		VueMenuFX vueAcceuil = vue.creerVueMenu();

		FabriqueControleur.creerControleur(ControleurMenuFX.class, vueAcceuil);
	}

	private void nouvellePartieLocale() {
		J.appel(this);

		partie = new PartieLocale();
		instancierMVCPartieLocale();
	}

	private void instancierMVCPartieLocale() {
		J.appel(this);

		VuePartieLocaleFX vuePartie = vue.creerVuePartieLocale();

		AfficheurPartieLocaleFX afficheur = new AfficheurPartieLocaleFX();

		FabriqueControleur.creerControleur(ControleurPartieLocaleFX.class, partie, vuePartie, afficheur);
	}

}
