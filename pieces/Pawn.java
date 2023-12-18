package pieces;

public class Pawn extends Piece {
    private boolean firstMove = true;
    public Pawn(int col, int row, boolean isWhite) {
        super(col, row, isWhite);
    }

    // TODO: Implement En Passant and potentially improve inheritance here
    @Override
    public void movePiece(int col, int row) {
        if (canMove(col, row)) {
            setCol(col);
            setRow(row);
            firstMove = false;
        }
    }

    @Override
    public boolean canMove(int col, int row) {
        return (firstMove && getCol() == col && Math.abs(getRow() - row) <= 2)
                || (getCol() == col && Math.abs(getRow() - row) == 1);
    }

    public String getURL() {
        if (getIsWhite()) {
            return "/pieces/images/white_pawn.png";
        } else {
            return "/pieces/images/black_pawn.png";
        }
    }
}
