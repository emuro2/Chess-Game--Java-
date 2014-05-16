package Images;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 * @author ErikMuro
 *
 */
public class Images {

	public BufferedImage whitePawnImage;
	public BufferedImage whiteCastleImage;
	public BufferedImage whiteHorseImage;
	public BufferedImage whiteBishopImage;
	public BufferedImage whiteQueenImage;
	public BufferedImage whiteKingImage;
	public BufferedImage whiteWazirImage;
	public BufferedImage whiteBerolinaImage;
	public BufferedImage blackPawnImage;
	public BufferedImage blackCastleImage;
	public BufferedImage blackHorseImage;
	public BufferedImage blackBishopImage;
	public BufferedImage blackQueenImage;
	public BufferedImage blackKingImage;
	public BufferedImage blackWazirImage;
	public BufferedImage blackBerolinaImage;
	
	/**
	 * Initialize all the images
	 */
	public Images() {
		
		//white pawn
		try {
			whitePawnImage = ImageIO.read(new File("ChessPieces/White_pawn.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//white castle
		try {
			whiteCastleImage = ImageIO.read(new File("ChessPieces/White_castle.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//white horse
		try {
			whiteHorseImage = ImageIO.read(new File("ChessPieces/White_horse.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//white bishop
		try {
			whiteBishopImage = ImageIO.read(new File("ChessPieces/White_bishop.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//white queen
		try {
			whiteQueenImage = ImageIO.read(new File("ChessPieces/White_queen.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//white king
		try {
			whiteKingImage = ImageIO.read(new File("ChessPieces/White_king.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//white wazir
		try {
			whiteWazirImage = ImageIO.read(new File("ChessPieces/White_wazir.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//white berolina
		try {
			whiteBerolinaImage = ImageIO.read(new File("ChessPieces/White_berolina.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black pawn
		try {
			blackPawnImage = ImageIO.read(new File("ChessPieces/Black_pawn.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black castle
		try {
			blackCastleImage = ImageIO.read(new File("ChessPieces/Black_castle.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black horse
		try {
			blackHorseImage = ImageIO.read(new File("ChessPieces/Black_horse.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black bishop
		try {
			blackBishopImage = ImageIO.read(new File("ChessPieces/Black_bishop.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black queen
		try {
			blackQueenImage = ImageIO.read(new File("ChessPieces/Black_queen.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black king
		try {
			blackKingImage = ImageIO.read(new File("ChessPieces/Black_king.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//black wazir
		try {
			blackWazirImage = ImageIO.read(new File("ChessPieces/Black_wazir.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//black berolina
		try {
			blackBerolinaImage = ImageIO.read(new File("ChessPieces/Black_berolina.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
