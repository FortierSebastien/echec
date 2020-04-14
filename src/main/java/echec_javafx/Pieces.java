package echec_javafx;

import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import echec_javafx.jeuEchec;

public class Pieces extends StackPane{
	String chemin = "../resources/images/"; 
	
	Image pb = new  Image(chemin+"pb.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image cb = new  Image(chemin+"cb.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image fb = new  Image(chemin+"fb.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image rb = new  Image(chemin+"rb.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image reineb = new  Image(chemin+"reineBlanche.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image tb = new  Image(chemin+"tb.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image cn = new  Image(chemin+"cn.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image fn = new  Image(chemin+"fn.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image rn = new  Image(chemin+"rn.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image reinen = new  Image(chemin+"reineNoir.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image tn = new  Image(chemin+"tn.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);
	Image pn = new  Image(chemin+"pn.PNG",jeuEchec.TILE_SIZE*0.3125,jeuEchec.TILE_SIZE*0.26,true,true);

	public Pieces (Image piece,int x, int y) {
		relocate(x*jeuEchec.TILE_SIZE, y*jeuEchec.TILE_SIZE);
		
		
		
	}




}
