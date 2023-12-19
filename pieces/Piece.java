package pieces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class Piece extends JComponent implements MouseListener {
    private int col;
    private int row;
    private final boolean isWhite;

    public Piece(int col, int row, boolean isWhite) {
        this.col = col;
        this.row = row;
        this.isWhite = isWhite;
    }

    public void movePiece(int col, int row) {
        if (canMove(col, row)) {
            setCol(col);
            setRow(row);
        }
    }

    public abstract boolean canMove(int col, int row);

    @Override
    public void paintComponent(Graphics g) {
        final int PIECE_SIZE = 90;
        final int SQUARE_SIZE = 91;
        final int STARTING_POS_X = 35;
        final int STARTING_POS_Y = 40;

        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        try {
            ImageIcon image = new ImageIcon(Piece.class.getResource(getURL()));
            image = new ImageIcon(image.getImage().getScaledInstance(PIECE_SIZE,
                    PIECE_SIZE, Image.SCALE_SMOOTH));
            g2D.drawImage(image.getImage(), STARTING_POS_X + getCol() * SQUARE_SIZE,
                    STARTING_POS_Y + getRow() * SQUARE_SIZE, null);
        } catch (NullPointerException e) {
            System.out.println("No image under that path!");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited!");
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public abstract String getURL();
}
