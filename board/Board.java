package board;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private final int BOARD_WIDTH = 800;
    private final int BOARD_HEIGHT = 800;
    private final Player white = new Player(true);
    private final Player black = new Player(false);

    public Board() {
        this.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        this.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        try {
            ImageIcon chessBoard = new ImageIcon(Board.class.getResource("/board/chess_board.jpg"));
            chessBoard = new ImageIcon(chessBoard.getImage().getScaledInstance(BOARD_WIDTH,
                    BOARD_HEIGHT, Image.SCALE_SMOOTH));
            g2D.drawImage(chessBoard.getImage(), 0, 0, null);
        } catch (NullPointerException e) {
            System.out.println("No image under that path!");
        }

        white.getPieces().forEach(piece -> piece.paintComponent(g));
        black.getPieces().forEach(piece -> piece.paintComponent(g));
    }

    public Player getWhite() {
        return white;
    }

    public Player getBlack() {
        return black;
    }
}
