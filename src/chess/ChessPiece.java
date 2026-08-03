package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
<<<<<<< HEAD

public abstract class ChessPiece extends Piece {
	
=======

public abstract class ChessPiece extends Piece {

>>>>>>> d11f6db (Implementando movimentos para a torre)
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
<<<<<<< HEAD
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
=======
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
>>>>>>> d11f6db (Implementando movimentos para a torre)
