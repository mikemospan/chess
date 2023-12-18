package board;

import pieces.*;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    final int BOARD_WIDTH = 800;
    final int BOARD_HEIGHT = 800;

    public Board() {
        this.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
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

        King king = new King(4, 7);
        king.paintComponent(g);
        Queen queen = new Queen(3, 7);
        queen.paintComponent(g);

        Bishop bishop1 = new Bishop(2, 7);
        Bishop bishop2 = new Bishop(5, 7);
        bishop1.paintComponent(g);
        bishop2.paintComponent(g);

        Knight knight1 = new Knight(1, 7);
        Knight knight2 = new Knight(6, 7);
        knight1.paintComponent(g);
        knight2.paintComponent(g);

        Rook rook1 = new Rook(0, 7);
        Rook rook2 = new Rook(7, 7);
        rook1.paintComponent(g);
        rook2.paintComponent(g);

        for (int i = 0; i < 8; i++) {
            new Pawn(i, 6).paintComponent(g);
        }
    }
}
