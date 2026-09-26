package piece;

import main.GamePanel;

public class Queen extends Piece {

	public Queen(int color, int column, int row) {
		super(color, column, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/white-queen");
		} else {
			image = getImage("/pieces/black-queen");
		}
	}

}
