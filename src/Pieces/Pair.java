package Pieces;
/*
 * 
 * author: Erik Muro
 * 
 * My pair class saves the current pair's 
 * x position in xPos
 * y position in yPos
 * 
 */


public class Pair {
	private int xPos, yPos;
	
	public Pair(int x, int y) {
		xPos=x;
		yPos = y;

	}
	
	public void setCoords(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public boolean equal(Pair p)
	{
		if(xPos == p.getX() && yPos == p.getY())
			return true;
		else
			return false;	
	}
	
	public int getX()
	{	return xPos;	}
	
	public int  getY()
	{	return yPos;	}
	
	
}
