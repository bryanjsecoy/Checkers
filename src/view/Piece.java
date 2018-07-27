package view;

import javax.swing.*;
import java.awt.*;

/**
 * Piece - Draws a checker
 * @Author Bryan Secoy
 * @version 1.0
 */
public final class Piece extends JPanel {

    private int type;

    Piece(int type) {
        this.type = type;
        setSize( 80,80);
    }


    /**
     * draw is automatically called when an instance of this class is created.
     * @param g -
     */

    public void paintComponent(Graphics g)
    {
        System.out.println("Drawing a checker");
        g.setColor(Color.RED);
        g.fillOval(3,3,20,20);
        g.drawOval(3,3,20,20);
    }
}