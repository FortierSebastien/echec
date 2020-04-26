package echec_javafx;

public class MoveResult {
	
	public MoveType type;
	
	public Pieces piece;
	
	public MoveType getType() {
		return type;
	}
	public Pieces getPiece() {
		return piece;
	}
	
	public MoveResult(MoveType type) {
		this(type, null);
	};
	
	public MoveResult(MoveType type, Pieces piece) {
		this.type = type;
		this.piece=piece;
	}

}
