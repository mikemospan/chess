package pieces;

public class Pawn extends Piece {
    private boolean firstMove = true;

    // TODO: Implement En Passant and potentially improve inheritance here
    @Override
    public void move(int x, int y) {
        if (canMove(x, y)) {
            setX(x);
            setY(y);
            firstMove = false;
        }
    }

    @Override
    public boolean canMove(int x, int y) {
        return (firstMove && getX() == x && Math.abs(getY() - y) <= 2)
                || (getX() == x && Math.abs(getY() - y) == 1);
    }
}
