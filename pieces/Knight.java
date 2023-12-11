package pieces;

public class Knight extends Piece {
    @Override
    public boolean canMove(int x, int y) {
        return Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 2;
    }
}
