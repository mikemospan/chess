package board;

import javax.swing.*;
import java.awt.*;

public class Board {
    private final JFrame ui = new JFrame("Chess Game");

    public Board() {
        this.setupUI();
    }

    public void setupUI() {
        final int BOARD_WIDTH = 800, BOARD_HEIGHT = 800;
        final int WIDTH_PADDING = 16, HEIGHT_PADDING = 39;
        ui.setSize(BOARD_WIDTH + WIDTH_PADDING,BOARD_HEIGHT + HEIGHT_PADDING);
        JLabel label = new JLabel();
        try {
            ImageIcon chessBoard = new ImageIcon(Board.class.getResource("/board/chess_board.jpg"));
            chessBoard = new ImageIcon(chessBoard.getImage().getScaledInstance(BOARD_WIDTH,
                    BOARD_HEIGHT, Image.SCALE_SMOOTH));
            JLabel displayBoard = new JLabel(chessBoard);
            ui.add(displayBoard);
        } catch (NullPointerException e) {
            System.out.println("No image under that path!");
        }
        ui.pack();
        ui.setVisible(true);
    }
}
