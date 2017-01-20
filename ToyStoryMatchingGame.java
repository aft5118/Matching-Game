package toystorymatchinggame;

import java.awt.Dimension;
import javax.swing.JFrame;


public class ToyStoryMatchingGame {

    
    public static void main(String[] args) {
        Board b = new Board();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.pack();
        b.setVisible(true);
    }
    
}
