package echec_javafx;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle{

	private Pieces piece;
	
	public boolean hasPiece() {
		return piece != null;
	}
	
	public Pieces getPiece() {
		return piece;
	}
	
	public void setPiece(Pieces piece) {
		
		this.piece= piece;
		
	}
	
	
	
	public Tile(boolean light, int x, int y)  {
		
		
		setWidth(jeuEchec.TILE_SIZE);
		setHeight(jeuEchec.TILE_SIZE);
		
		
		
		relocate(x* jeuEchec.TILE_SIZE, y* jeuEchec.TILE_SIZE);
		
		setFill(light ? Color.valueOf("#feb"): Color.valueOf("#582"));
		
	}
}
