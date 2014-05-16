package ChessBoards;

import Pieces.*;

/**
 * Created by ErikMuro on 2/19/14.
 */
public class MoveHolder {
    private Piece movedP;
    private Piece eatenP;
    private Pair prevPos;
    private Pair newPos;
    private String color;

    MoveHolder()
    {
        prevPos = new Pair(-1, -1);
        newPos = new Pair(-1, -1);
    }

    public void update(Piece p, Piece e, String c, Pair old, Pair newP)
    {
        eatenP = e;
        movedP = p;
        prevPos.setCoords(old.getX(), old.getY());
        newPos.setCoords(newP.getX(), newP.getY());
        color = c;
    }

    public void movePrev(Grid [][] g)
    {
        movedP.positions.setCoords(prevPos.getX(), prevPos.getY());
        movedP.specialMove(color);

        g[newPos.getX()][newPos.getY()].occupied = false;
        g[prevPos.getX()][prevPos.getY()].occupied = true;
        g[prevPos.getX()][prevPos.getY()].color = color;

        if(eatenP != null)
        {
            String opponent = color.equals("white") ? "black" : "white";
            eatenP.isEaten = false;
            g[newPos.getX()][newPos.getY()].occupied = true;
            g[newPos.getX()][newPos.getY()].color = opponent;
        }

    }

}
