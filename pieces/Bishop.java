package pieces;

public class Bishop extends Piece {
    public Bishop(int col, int row, boolean isWhite) {
        super(col, row, isWhite);
    }
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) == Math.abs(getRow() - row);
    }

    public String getURL() {
        if (getIsWhite()) {
            return "/pieces/images/white_bishop.png";
        } else {
            return "/pieces/images/black_bishop.png";
        }
    }
}
