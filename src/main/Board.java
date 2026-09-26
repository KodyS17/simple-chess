package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Board {

	final int MAX_COLUMN = 8;
	final int MAX_ROWS = 8;
	
	public static final int SQUARE_SIZE = 100;
	public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;
	
	public void draw(Graphics2D g2) {
		
		int c = 0;
		
		for(int row = 0; row < MAX_ROWS; row++) {
			for(int column = 0; column < MAX_COLUMN; column++) {
				
				if(c == 0) {
					g2.setColor(new Color(210, 165, 125));
					c = 1;
				} else {
					g2.setColor(new Color(175, 115, 70));
					c = 0;
				}
				
				int x = column * SQUARE_SIZE;
				int y = row * SQUARE_SIZE;
				
				g2.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
			}
			
			if(c == 0) {
				c = 1;
			} else {
				c = 0;
			}
		}
		
	}
	
}
