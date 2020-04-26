package echec_javafx.controleurs;

import commun.debogage.J;
import commun_javafx.DialogueModal;
import echec_client.controleurs.ControleurMenu;
import echec_javafx.vues.VueMenuFX;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControleurMenuFX extends ControleurMenu<VueMenuFX>{


	private Scene sceneParametres;
	private Stage dialogueParametres;
	
	
	
	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}


	
	private void ouvrirParametres() {
		J.appel(this);

		dialogueParametres = DialogueModal.ouvrirDialogueModal(sceneParametres);
	}

	private void fermerParametres() {
		J.appel(this);
		
		if(dialogueParametres != null) {
			
			dialogueParametres.close();
		}
	}
	@Override
	protected void demarrer() {
		J.appel(this);
		
	}


}
