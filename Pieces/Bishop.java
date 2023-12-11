package Pieces;

public class Bishop extends Piece {
    @Override
    public boolean canMove(int x, int y) {
        return Math.abs(getX() - x) == Math.abs(getY() - y);
    }
}
