package pieces;

public class Knight extends Piece {
    public Knight(int col, int row) {
        super(col, row);
    }
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) == 1 && Math.abs(getRow() - row) == 2;
    }

    public String getURL() {
        return "/pieces/images/white_horse.png";
    }
}
