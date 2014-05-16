package ChessGame;
import ChessBoards.Grid;
import Pieces.*;


/**
 * @author Erik Muro
 *
 */

public class Player {
	
	public Pawn pawns []= new Pawn[4];
	public Castle castles [] = new Castle[2];
	public Wazir wazirs [] = new Wazir[2];
	public Berolina berolinas[] = new Berolina[2];
	public Horse horses [] = new Horse[2];
	public Bishop bishops [] = new Bishop[2];
	public King king;
	public Queen queen;
	public String color;
	

	
	public Player(String type, Grid [][] grid) 
	{
		color = type;
		if(type.equals("white"))
		{
			setupWhitePieces( grid);
		}
		else
		{
			setupBlackPieces(grid);
		}
	}

	
	
	private void setupWhitePieces(Grid [][] g) 
	{	
		int i;
		//set up pawns
		for(i = 0; i < pawns.length; i++)
		{
			pawns[i]= new Pawn();
			pawns[i].positions.setCoords(i+2, 6);
			g[i+2][6].color="white";
			g[i+2][6].occupied = true;
		}
	
		//berolina
		for(i = 0; i < berolinas.length; i++)
		{
			berolinas[i] = new Berolina();
			if(i == 0)
			{
				berolinas[i].positions.setCoords(6, 6);
				g[6][6].color="white";
				g[6][6].occupied = true;
			}
			else
			{
				berolinas[i].positions.setCoords(1, 6);
				g[1][6].color="white";
				g[1][6].occupied = true;
			}
		}		

		//castles
		for(i = 0; i < 2; i++)
		{
			castles[i] = new Castle();
			if(i == 0)
			{
				castles[i].positions.setCoords(0, 7);
				g[0][7].color="white";
				g[0][7].occupied = true;
			}
			else
			{
				castles[i].positions.setCoords(7, 7);
				g[7][7].color="white";
				g[7][7].occupied = true;
			}
		}
		
		//horses
		for(i = 0; i < 2; i++)
		{
			horses[i] = new Horse();
			if(i == 0)
			{
				horses[i].positions.setCoords(1, 7);
				g[1][7].color="white";
				g[1][7].occupied = true;
			}
			else
			{
				horses[i].positions.setCoords(6, 7);
				g[6][7].color="white";
				g[6][7].occupied = true;
			}
		}
		
		//bishops
		for(i = 0; i < 2; i++)
		{
			bishops[i] = new Bishop();
			if(i == 0)
			{
				bishops[i].positions.setCoords(2, 7);
				g[2][7].color="white";
				g[2][7].occupied = true;
			}
			else
			{
				bishops[i].positions.setCoords(5, 7);
				g[5][7].color="white";
				g[5][7].occupied = true;
			}
		}
		
		//king
		king = new King();
		king.positions.setCoords(4, 7);
		g[4][7].color="white";
		g[4][7].occupied = true;
		
		//queen
		queen = new Queen();
		queen.positions.setCoords(3, 7);
		g[3][7].color="white";
		g[3][7].occupied = true;
		
		wazirs[0] = new Wazir();
		wazirs[0].positions.setCoords(0, 6);
		g[0][6].color="white";
		g[0][6].occupied = true;
		wazirs[1] = new Wazir();
		wazirs[1].positions.setCoords(7, 6);
		g[7][6].color="white";
		g[7][6].occupied = true;

	}

	
	private void setupBlackPieces( Grid [][] g) 
	{
		int i;
		for(i = 0; i < pawns.length; i++)
		{
			pawns[i]= new Pawn();
			pawns[i].positions.setCoords(i+2, 1);
			g[i+2][1].color="black";
			g[i+2][1].occupied = true;
		}
		
		//berolina
		for(i = 0; i < berolinas.length; i++)
		{
			berolinas[i] = new Berolina();
			if(i == 0)
			{
				berolinas[i].positions.setCoords(6, 1);
				g[6][1].color="black";
				g[6][1].occupied = true;
			}
			else
			{
				berolinas[i].positions.setCoords(1, 1);
				g[1][1].color="black";
				g[1][1].occupied = true;
			}
		}
		
		for(i = 0; i < 2; i++)
		{
			castles[i] = new Castle();
			if(i == 0)
			{
				castles[i].positions.setCoords(0, 0);
				g[0][0].color="black";
				g[0][0].occupied = true;
			}
			else
			{
				castles[i].positions.setCoords(7, 0);
				g[7][0].color="black";
				g[7][0].occupied = true;
			}
		}
		
		//horses
		for(i = 0; i < 2; i++)
		{
			horses[i] = new Horse();
			if(i == 0)
			{
				horses[i].positions.setCoords(1, 0);
				g[1][0].color="black";
				g[1][0].occupied = true;
			}
			else
			{
				horses[i].positions.setCoords(6, 0);
				g[6][0].color="black";
				g[6][0].occupied = true;
			}
		}
		
		//bishops
		for(i = 0; i < 2; i++)
		{
			bishops[i] = new Bishop();
			if(i == 0)
			{
				bishops[i].positions.setCoords(2, 0);
				g[2][0].color="black";
				g[2][0].occupied = true;
			}
			else
			{
				bishops[i].positions.setCoords(5, 0);
				g[5][0].color="black";
				g[5][0].occupied = true;
			}
		}
		
		//king
		king = new King();
		king.positions.setCoords(4, 0);
		g[4][0].color="black";
		g[4][0].occupied = true;
		
		//queen
		queen = new Queen();
		queen.positions.setCoords(3, 0);
		g[3][0].color="black";
		g[3][0].occupied = true;
		
		wazirs[0] = new Wazir();
		wazirs[0].positions.setCoords(0, 1);
		g[0][1].color="black";
		g[0][1].occupied = true;
		wazirs[1] = new Wazir();
		wazirs[1].positions.setCoords(7, 1);
		g[7][1].color="black";
		g[7][1].occupied = true;
		
	}



	public Piece validPieceSelected(int mouseX, int mouseY) 
	{
		int index;
		for(index = 0; index < pawns.length; index++)
		{	
			if( (mouseX == pawns[index].positions.getX()) && (mouseY == pawns[index].positions.getY()) )
			{
				pawns[index].selected = true;
				return pawns[index];
			}
		}
		
		for(index = 0; index < berolinas.length; index++)
		{	
			if( (mouseX == berolinas[index].positions.getX()) && (mouseY == berolinas[index].positions.getY()) )
			{
				berolinas[index].selected = true;
				return berolinas[index];
			}
		}
		
		for(index = 0; index < castles.length; index++)
		{	
			if( (mouseX == castles[index].positions.getX()) && (mouseY == castles[index].positions.getY()) )
			{
				castles[index].selected = true;
				return castles[index];
			}
		}
		
		for(index = 0; index < horses.length; index++)
		{	
			if( (mouseX == horses[index].positions.getX()) && (mouseY == horses[index].positions.getY()) )
			{
				horses[index].selected = true;
				return horses[index];
			}
		}
		
		for(index = 0; index < bishops.length; index++)
		{	
			if( (mouseX == bishops[index].positions.getX()) && (mouseY == bishops[index].positions.getY()) )
			{
				bishops[index].selected = true;
				return bishops[index];
			}
		}
		for(index = 0; index < wazirs.length; index++)
		{	
			if( (mouseX == wazirs[index].positions.getX()) && (mouseY == wazirs[index].positions.getY()) )
			{
				wazirs[index].selected = true;
				return wazirs[index];
			}
		}
		
		if( (mouseX == queen.positions.getX()) && (mouseY == queen.positions.getY()) )
		{
			queen.selected = true;
			return queen;
		}
		if( (mouseX == king.positions.getX()) && (mouseY == king.positions.getY()) )
		{
			king.selected = true;
			return king;
		}
		
		
		
		return null;
	}



	public boolean movePiece(Piece p, int newX, int newY, int player, Grid[][] g) 
	{
		
		if(p.canMove(newX, newY, player, g))
		{
			p.move(newX, newY);
			return true;
		}
		
		return false;
	}



	public Piece checkEaten(int newX, int newY)
	{
		int i;
		for(i = 0; i < pawns.length; i++)
		{	
			if((newX == pawns[i].positions.getX()) && (newY == pawns[i].positions.getY()))
			{
				pawns[i].isEaten = true;
				return pawns[i];
			}
		}
		
		//berolina
		for(i = 0; i < berolinas.length; i++)
		{
			if((newX == berolinas[i].positions.getX()) && (newY == berolinas[i].positions.getY()))
			{
				berolinas[i].isEaten = true;
				return berolinas[i];
			}
		}		

		//wazirs
		for(i = 0; i < wazirs.length; i++)
		{
			if((newX == wazirs[i].positions.getX()) && (newY == wazirs[i].positions.getY()))
			{
				wazirs[i].isEaten = true;
				return wazirs[i];
			}
		}		
		
		//castles
		for(i = 0; i < castles.length; i++)
		{
			if((newX == castles[i].positions.getX()) && (newY == castles[i].positions.getY()))
			{
				castles[i].isEaten = true;
				return castles[i];
			}
		}
		
		//horses
		for(i = 0; i < horses.length; i++)
		{
			if((newX == horses[i].positions.getX()) && (newY == horses[i].positions.getY()))
			{
				horses[i].isEaten = true;
				return horses[i];
			}
		}
		
		//bishops
		for(i = 0; i < bishops.length; i++)
		{
			if((newX == bishops[i].positions.getX()) && (newY == bishops[i].positions.getY()))
			{
				bishops[i].isEaten = true;
				return bishops[i];
			}

		}
		
		//king
		if((newX == king.positions.getX()) && (newY == king.positions.getY()))
		{
			king.isEaten = true;
			return king;
		}

		if((newX == queen.positions.getX()) && (newY == queen.positions.getY()))
		{
			queen.isEaten = true;
			return queen;
		}

        return null;

	}

}
