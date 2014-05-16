package Pieces;

import java.util.Vector;
import ChessGame.Player;
import ChessBoards.Grid;

/**
 * @author Erik Muro
 *
 */
public abstract class Piece {

	
	public Pair positions;
	public boolean isEaten;
	public boolean selected;

	

	public Piece() 
	{
		
		isEaten = false;
		selected = false;
		positions = new Pair(0,0);
	}
	
	public abstract void move(int x, int y);

	
	public abstract boolean canMove(int x, int y, int player, Grid [][] g);

    public abstract void specialMove(String c);

    public abstract Vector<Pair> addMoves(int player, Grid[][] g);



}
