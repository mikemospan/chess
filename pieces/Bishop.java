package pieces;

public class Bishop extends Piece {
    public Bishop(int col, int row) {
        super(col, row);
    }
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) == Math.abs(getRow() - row);
    }

    public String getURL() {
        return "/pieces/images/white_bishop.png";
    }
}
