package piece;

import main.GamePanel;

public class Rook extends Piece {

	public Rook(int color, int column, int row) {
		super(color, column, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/white-rook");
		} else {
			image = getImage("/pieces/black-rook");
		}
	}

}
