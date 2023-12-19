import board.Board;

import javax.swing.*;

public class Chess {
    public Chess() {
        JFrame jFrame = new JFrame();
        Board board = new Board();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(board);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Chess board = new Chess();
    }
}
