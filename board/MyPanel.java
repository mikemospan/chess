package board;

import pieces.King;
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    final int BOARD_WIDTH = 800;
    final int BOARD_HEIGHT = 800;

    public MyPanel() {
        this.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        King king = new King();
        this.add(king);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        try {
            ImageIcon chessBoard = new ImageIcon(Board.class.getResource("/board/chess_board.jpg"));
            chessBoard = new ImageIcon(chessBoard.getImage().getScaledInstance(BOARD_WIDTH,
                    BOARD_HEIGHT, Image.SCALE_SMOOTH));
            g2D.drawImage(chessBoard.getImage(), 0, 0, null);
        } catch (NullPointerException e) {
            System.out.println("No image under that path!");
        }
    }
}