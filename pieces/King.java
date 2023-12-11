package pieces;

import board.Board;

import javax.swing.*;
import java.awt.*;

public class King extends Piece {
    @Override
    public boolean canMove(int col, int row) {
        return Math.abs(getCol() - col) <= 1 && Math.abs(getRow() - row) <= 1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        try {
            ImageIcon image = new ImageIcon(Board.class.getResource("/pieces/images/white_king.png"));
            g2D.drawImage(image.getImage(), 0, 0, null);
        } catch (NullPointerException e) {
            System.out.println("No image under that path!");
        }
    }
}
