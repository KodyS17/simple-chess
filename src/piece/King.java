package piece;

import main.GamePanel;

public class King extends Piece {

	public King(int color, int column, int row) {
		super(color, column, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/white-king");
		} else {
			image = getImage("/pieces/black-king");
		}
	}

}
