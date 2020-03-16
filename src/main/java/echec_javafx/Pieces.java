package echec_javafx;

import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import echec_javafx.jeuEchec;

public class Pieces extends StackPane{
	String chemin = "../resources/images/"; 
	
	Image pb = new  Image(chemin+"pb.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);

}
