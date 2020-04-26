package echec_javafx;

public enum PieceType {
	
	
noir(1), blanc(-1); 
	
final int moveDire;


PieceType(int moveDire){
	this.moveDire = moveDire;
}
}
