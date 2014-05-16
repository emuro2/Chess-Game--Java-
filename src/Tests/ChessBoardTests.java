//package Tests;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import ChessBoards.TraditionalBoard;
//
///**
//* @author ErikMuro
//*
//*/
//public class ChessBoardTests {
//	TraditionalBoard newBoard;
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@Before
//	public void setUp() throws Exception
//	{
//		newBoard = new TraditionalBoard();
//	}
//
//
//	@Test
//	public void testChessBoard()
//	{
//		assertTrue("Not a berolina",newBoard.grid[6][6].occupied == true);
//		assertTrue("Not a berolina",newBoard.grid[6][6].color.equals("white"));
//		assertTrue("Not a castle",newBoard.grid[0][0].occupied == true);
//		assertFalse("Not a white piece",newBoard.grid[6][6].color.equals("black"));
//
//	}
//
//	@Test
//	public void testGetWidthBoard() {
//		assertTrue("Not an 8X8 board", (newBoard.getWidth() == 8));
//	}
//
//	@Test
//	public void testGetHeightBoard() {
//		assertTrue("Not an 8X8 board", (newBoard.getHeight() == 8));
//	}
//
//}
