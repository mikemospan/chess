package pieces;

public class King extends Piece {
    public King(int col, int row) {
        super(col, row);
    }
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) <= 1 && Math.abs(getRow() - row) <= 1;
    }

    public String getURL() {
        return "/pieces/images/white_king.png";
    }
}
