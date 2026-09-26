package piece;

import main.GamePanel;

public class Bishop extends Piece {

	public Bishop(int color, int column, int row) {
		super(color, column, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/white-bishop");
		} else {
			image = getImage("/pieces/black-bishop");
		}
	}

}
