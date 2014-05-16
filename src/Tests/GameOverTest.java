///**
// *
// */
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
// * @author ErikMuro
// *
// */
//public class GameOverTest {
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
//	public void test() {
//		newBoard.board.player1.king.isEaten = true;
//		assertTrue("King not eaten", newBoard.board.player1.king.isEaten);
//
//		//orr
//		newBoard.board.player2.king.isEaten = true;
//		assertTrue("King not eaten", newBoard.board.player2.king.isEaten);
//	}
//
//}
