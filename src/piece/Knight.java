package piece;

import main.GamePanel;

public class Knight extends Piece {

	public Knight(int color, int column, int row) {
		super(color, column, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/white-knight");
		} else {
			image = getImage("/pieces/black-knight");
		}
	}
	
	

}
