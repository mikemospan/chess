package board;

import pieces.*;

import java.util.ArrayList;

public class Player {
    private final ArrayList<Piece> pieces = new ArrayList<>();

    public Player(boolean isWhite) {
        int pawnRow = isWhite ? 6 : 1;
        int pieceRow = isWhite ? 7 : 0;

        pieces.add(new King(4, pieceRow, isWhite));
        pieces.add(new Queen(3, pieceRow, isWhite));

        pieces.add(new Bishop(2, pieceRow, isWhite));
        pieces.add(new Bishop(5, pieceRow, isWhite));

        pieces.add(new Knight(1, pieceRow, isWhite));
        pieces.add(new Knight(6, pieceRow, isWhite));

        pieces.add(new Rook(0, pieceRow, isWhite));
        pieces.add(new Rook(7, pieceRow, isWhite));

        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(i, pawnRow, isWhite));
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
