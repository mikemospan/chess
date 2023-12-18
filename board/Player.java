package board;

import pieces.*;

import java.util.ArrayList;

public class Player {
    private final ArrayList<Piece> pieces = new ArrayList<>();

    public Player(boolean isWhite) {
        int pawnRow = isWhite ? 1 : 6;
        int pieceRow = isWhite ? 0 : 7;

        pieces.add(new King(4, pieceRow));
        pieces.add(new Queen(3, pieceRow));

        pieces.add(new Bishop(2, pieceRow));
        pieces.add(new Bishop(5, pieceRow));

        pieces.add(new Knight(1, pieceRow));
        pieces.add(new Knight(6, pieceRow));

        pieces.add(new Rook(0, pieceRow));
        pieces.add(new Rook(7, pieceRow));

        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(i, pawnRow));
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
