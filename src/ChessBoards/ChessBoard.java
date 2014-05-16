package ChessBoards;

import ChessGame.Player;
import Pieces.Piece;

/**
 * @author Erik Muro
 *
 */
public interface ChessBoard {

    public Piece getPieces(Player player, char name, int index);

    public void moveSelectedPiece(int newX, int newY);

    public void undo();

    public void forfeit();

    public void printGrid();


}
