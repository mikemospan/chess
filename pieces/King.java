package pieces;

public class King extends Piece {
    public King(int col, int row, boolean isWhite) {
        super(col, row, isWhite);
    }
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) <= 1 && Math.abs(getRow() - row) <= 1;
    }

    public String getURL() {
        if (getIsWhite()) {
            return "/pieces/images/white_king.png";
        } else {
            return "/pieces/images/black_king.png";
        }
    }
}
