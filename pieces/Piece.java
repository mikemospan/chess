package pieces;

import javax.swing.*;
import java.awt.*;

public abstract class Piece extends JComponent {
    private int col;
    private int row;

    public void movePiece(int col, int row) {
        if (canMove(col, row)) {
            setCol(col);
            setRow(row);
        }
    }

    public abstract boolean canMove(int col, int row);

    @Override
    public void paintComponent(Graphics g) {
        final int SQUARE_SIZE = 91;
        final int STARTING_POS = 40;
        final int PIECE_SIZE = 80;

        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        try {
            ImageIcon image = new ImageIcon(Piece.class.getResource(getURL()));
            image = new ImageIcon(image.getImage().getScaledInstance(PIECE_SIZE,
                    PIECE_SIZE, Image.SCALE_SMOOTH));
            g2D.drawImage(image.getImage(), STARTING_POS + 4 * SQUARE_SIZE,
                    STARTING_POS + 7 * SQUARE_SIZE, null);
        } catch (NullPointerException e) {
            System.out.println("No image under that path!");
        }
    }

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

    public abstract String getURL();
}
