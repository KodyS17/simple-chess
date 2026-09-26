package piece;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Board;

public class Piece {
	
	public BufferedImage image;
	public int x, y;
	public int column, row, preColumn, preRow;
	public int color;
	
	public Piece(int color, int column, int row) {
		this.color = color;
		this.column = column;
		this.row = row;
		
		x = getX(column);
		y = getY(row);
		
		preColumn = column;
		preRow = row;
	}
	
	public BufferedImage getImage(String imagePath) {
		BufferedImage image = null;
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return image;
	}
	
	public int getX(int column) {
		return column * Board.SQUARE_SIZE;
	}
	
	public int getY(int row) {
		return row * Board.SQUARE_SIZE;
	}
	
	public int getColumn(int x) {
		return (x + Board.HALF_SQUARE_SIZE) / Board.SQUARE_SIZE;
	}
	
	public int getRow(int y) {
		return (y + Board.HALF_SQUARE_SIZE) / Board.SQUARE_SIZE;
	}
	
	public void updatePosition() {
		x = getX(column);
		y = getY(row);
		
		preColumn = getColumn(x);
		preRow = getRow(y);
	}
	
	public void draw(Graphics2D g) {
		g.drawImage(image, x, y, Board.SQUARE_SIZE, Board.SQUARE_SIZE, null);
	}

}
