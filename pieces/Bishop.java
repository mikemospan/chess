package pieces;

public class Bishop extends Piece {
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) == Math.abs(getRow() - row);
    }

    public String getURL() {
        return "/pieces/images/white_king.png";
    }
}
