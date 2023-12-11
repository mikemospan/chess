package pieces;

public class Knight extends Piece {
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) == 1 && Math.abs(getRow() - row) == 2;
    }
}
