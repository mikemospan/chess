package pieces;

public class Queen extends Piece {
    public Queen (int col, int row) {
        super(col, row);
    }
    @Override
    public boolean canMove(int col, int row) {
        return new Bishop(col, row).canMove(col, row) || new Rook(col, row).canMove(col, row);
    }

    public String getURL() {
        return "/pieces/images/white_queen.png";
    }
}
