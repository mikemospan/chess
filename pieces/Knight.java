package pieces;

public class Knight extends Piece {
    public Knight(int col, int row, boolean isWhite) {
        super(col, row, isWhite);
    }
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) == 1 && Math.abs(getRow() - row) == 2;
    }

    public String getURL() {
        if (getIsWhite()) {
            return "/pieces/images/white_horse.png";
        } else {
            return "/pieces/images/black_horse.png";
        }
    }
}
