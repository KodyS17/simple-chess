package piece;

import main.GamePanel;

public class Pawn extends Piece {

	public Pawn(int color, int column, int row) {
		super(color, column, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/white-pawn");
		} else {
			image = getImage("/pieces/black-pawn");
		}
	}

}
