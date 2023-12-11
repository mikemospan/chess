package pieces;

public class Rook extends Piece {
    @Override
    public boolean canMove(int x, int y) {
        return (getX() == x && getY() != y) || (getY() == y && getX() != x);
    }
}
