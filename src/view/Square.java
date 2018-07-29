package view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Square - Draws a square on the board, to include a checker "If present"
 * @Author Bryan Secoy
 * @version 1.0
 */
public final class Square extends JPanel {

    private int type;
    private int player;
    private int backGround;

    /**
     * Constructor method
     * @param type - 0 = normal piece, 1 = king, -1 empty square
     * @param player - Black = 0, Red = 1, -1 if no player
     * @param background - Gray = 0; white = 1
     */
    Square(int type, int player, int background) {
        this.type = type;
        this.player = player;
        this.backGround = background;
        this.setLayout(null);
        this.setBorder(new EtchedBorder());
        setSize( 100,100);
    }

    /**
     * draw is automatically called when an instance of this class is created.
     * @param g - graphic component
     */

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (backGround == 0)                        // Set desired background color
            setBackground(Color.GRAY);
        else
            setBackground(Color.WHITE);

        if (type == 0 && player == 1)               // Normal piece for player one
            g.setColor(Color.RED);
        if (type == 0 && player == 0)
            g.setColor(Color.BLACK);                // Normal piece for player two

        if (type == 1 && player == 1) {             // King for player two
            g.setColor(Color.RED);
            g.drawString("K", 0,0);
        }
        if (type == 1 && player == 0) {             // King for player one
            g.setColor(Color.BLACK);
            g.drawString("K", 0,0);
        }

        // Draw a checker if the space is occupied.
        if (type == 0 || type == 1) {
            g.fillOval(4, 4, 50, 50);
            g.drawOval(4, 4, 50, 50);
        }
    }

    /**
     * Draw a checker on the board
     * @param player - the color of the checker to draw
     * @param type - normal checker or king
     */
    public void drawChecker(int player, int type) {
        this.player = player;
        this.type = type;
        repaint();
    }

    public void removerChecker() {
        this.player = -1;
        this.type = -1;
        repaint();
    }

    public int getPlayer() {
        return this.player;
    }

    public int getType() {
        return this.type;
    }
}