package pieces;

import javax.swing.*;
import java.awt.*;

public abstract class Piece extends JComponent {
    private int col;
    private int row;
    final int SIZE = 80;

    public Piece() {
        this.setPreferredSize(new Dimension(SIZE, SIZE));
    }

    public void movePiece(int col, int row) {
        if (canMove(col, row)) {
            setCol(col);
            setRow(row);
        }
    }

    public abstract boolean canMove(int col, int row);

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
