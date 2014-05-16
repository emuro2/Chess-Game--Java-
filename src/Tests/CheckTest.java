///**
//*
//*/
//package Tests;
//
//import static org.junit.Assert.*;
//
//import ChessGame.GameViewer;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import Controller.Controller;
//
///**
//* @author ErikMuro
//*
//*/
//public class CheckTest {
//	GameViewer newBoard;
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@Before
//	public void setUp() throws Exception
//	{
//		newBoard = new GameViewer("Traditional");
//	}
//
//
//	@Test
//	public void test()
//	{
//		newBoard.board.player1.queen.isEaten = true;
//		assertTrue("Queen was not eaten", newBoard.board.player1.queen.isEaten);
//
//		newBoard.board.player2.horses[0].positions.setCoords(4, 5);
//		assertTrue("Horse can eat king if king is moved to 3, 7",newBoard.board.player2.horses[0].positions.getX()==4 );
//
//		newBoard.mouseX = 4;
//		newBoard.mouseY = 7;
//		newBoard.moveSelectedPiece(3, 7);
//		assertFalse("King cannot move there, or else will be eaten!",
//				(newBoard.board.player1.pawns[1].positions.getY() == 7 && newBoard.board.player1.pawns[1].positions.getX() == 3 ));
//
//	}
//
//}
