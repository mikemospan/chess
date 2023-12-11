package pieces;

public class Rook extends Piece {
    @Override
    public boolean canMove(int col, int row) {
        return (getCol() == col && getRow() != row) || (getRow() == row && getCol() != col);
    }
}
