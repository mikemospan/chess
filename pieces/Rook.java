package pieces;

public class Rook extends Piece {
    public Rook(int col, int row) {
        super(col, row);
    }
    @Override
    public boolean canMove(int col, int row) {
        return (getCol() == col && getRow() != row) || (getRow() == row && getCol() != col);
    }

    public String getURL() {
        return "/pieces/images/white_rook.png";
    }
}
