package pieces;

public class Rook extends Piece {
    public Rook(int col, int row, boolean isWhite) {
        super(col, row, isWhite);
    }
    @Override
    public boolean canMove(int col, int row) {
        return (getCol() == col && getRow() != row) || (getRow() == row && getCol() != col);
    }

    public String getURL() {
        return getIsWhite() ? "/pieces/images/white_rook.png" : "/pieces/images/black_rook.png";
    }
}
