package ChessBoards;

public class Grid {
	public String color;
	public boolean occupied;
	
	public Grid()
	{
		color = null;
		occupied = false;
	}
	
	public Grid(String c) {
		color = c;
		if(c != null)
			occupied= true;
		else
			occupied = false;
	}

}
