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
        if (getIsWhite()) {
            return "/pieces/images/white_rook.png";
        } else {
            return "/pieces/images/black_rook.png";
        }
    }
}
