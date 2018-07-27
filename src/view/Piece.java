package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Piece - Draws a checker
 * @Author Bryan Secoy
 * @version 1.0
 */
public final class Piece extends JPanel {

    private int type, x, y;
    private final static int DIMENSION = 50;

    Piece(int type) {
        this.type = type;
    }


    /**
     * draw is automatically called when an instance of this class is created.
     * @param g -
     */

    public void paint(Graphics g)
    {
        System.out.println("Drawing a checker");

        // Set checker color
        g.setColor(Color.RED);

        // Paint checker
        g.fillOval(x - DIMENSION / 2, y - DIMENSION / 2, DIMENSION, DIMENSION);
        g.setColor(Color.WHITE);
        g.drawOval(x - DIMENSION / 2, y - DIMENSION / 2, DIMENSION, DIMENSION);

    }
}