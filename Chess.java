import board.Board;

import javax.swing.*;

public class Chess extends JFrame {
    public Chess() {
        Board myPanel = new Board();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(myPanel);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Chess board = new Chess();
    }
}
