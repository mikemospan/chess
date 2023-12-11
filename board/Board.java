package board;

import javax.swing.*;

public class Board extends JFrame {
    public Board() {
        MyPanel myPanel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(myPanel);
        this.pack();
        this.setVisible(true);
    }
}
