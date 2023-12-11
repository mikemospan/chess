package pieces;

public class Queen extends Piece {
    @Override
    public boolean canMove(int col, int row) {
        return new Bishop().canMove(col, row) || new Rook().canMove(col, row);
    }

    public String getURL() {
        return "/pieces/images/white_king.png";
    }
}
