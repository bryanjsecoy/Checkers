package view;

import javax.swing.*;
import java.awt.*;

/**
 * Checker class creates a circle which will be added to the board.
 * @Author Bryan Secoy
 * @version 1.0
 */
public class Checker extends JFrame {

    Color color;

    /**
     * Constructor method
     */
    public Checker(Color color) {
        setSize(50,50);
        setVisible(true);
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(10,10,50,50);
    }

    public static void main(String argv[]) {
        Checker c = new Checker(Color.BLACK);
    }
}
