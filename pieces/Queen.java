package pieces;

public class Queen extends Piece {
    public Queen (int col, int row, boolean isWhite) {
        super(col, row, isWhite);
    }
    @Override
    public boolean canMove(int col, int row) {
        return new Bishop(col, row, getIsWhite()).canMove(col, row) || new Rook(col, row, getIsWhite()).canMove(col, row);
    }

    public String getURL() {
        return getIsWhite() ? "/pieces/images/white_queen.png" : "/pieces/images/black_queen.png";
    }
}
