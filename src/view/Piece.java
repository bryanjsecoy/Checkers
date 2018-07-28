package view;

import javax.swing.*;
import java.awt.*;

/**
 * Piece - Draws a checker
 * @Author Bryan Secoy
 * @version 1.0
 */
public final class Piece extends JPanel {

    private int type;       // 0 = normal piece, 1 = king
    private int player;     // Black = 0, Red = 1

    Piece(int type, int player) {
        this.type = type;
        this.player = player;
        setSize( 100,100);
    }


    /**
     * draw is automatically called when an instance of this class is created.
     * @param g -
     */

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.GRAY);

        if (type == 0 && player == 1) {
            g.setColor(Color.RED);
        }
        if (type == 0 && player == 0)
            g.setColor(Color.BLACK);

        g.fillOval(4, 4, 50, 50);
        g.drawOval(4, 4, 50, 50);

        // If the piece is a king
        if (type == 1) {
            g.drawString("K", 0,0);
        }
    }
}