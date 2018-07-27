package view;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class BoardPanel extends JPanel{

    private JPanel[][] squares;

    /**
     * Constructor method. Panel is 8x8 with alternating colored JPanels.
     */
    BoardPanel() {
        this.setLayout(new GridLayout(8,8));
        squares = new JPanel[8][8];
        paintBoard();
        //drawCheckers();
        setSize(50,50);
    }

    private void drawCheckers() {

    }

    private void paintBoard() {
        for (int row = 0; row < 8; row++) {
            // Even numbered rows (w,b,w,b,w,b,w,b)
            for (int col = 0; col < 8; col+=2) {
                if (row % 2 == 0) {
                    squares[row][col] = new JPanel();
                    squares[row][col+1] = new JPanel();
                    squares[row][col].setBackground(Color.WHITE);
                    squares[row][col + 1].setBackground(Color.GRAY);
                    add(squares[row][col]);
                    add(squares[row][col+1]);
                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
                    squares[row][col] = new JPanel();
                    squares[row][col+1] = new JPanel();
                    squares[row][col].setBackground(Color.GRAY);
                    squares[row][col + 1].setBackground(Color.WHITE);
                    add(squares[row][col]);
                    add(squares[row][col+1]);
                }
            }
        }
    }

    /**
     * getSquare - gets the desired square
     * @param row - the row
     * @param col - the column
     * @return squares[row][col] - The JPanel located in the requested row/column
     */
    public JPanel getSquare(int row, int col) {
        return squares[row][col];
    }
}
