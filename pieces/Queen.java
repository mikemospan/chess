package pieces;

public class Queen extends Piece {
    @Override
    public boolean canMove(int x, int y) {
        return new Bishop().canMove(x, y) || new Rook().canMove(x, y);
    }
}
