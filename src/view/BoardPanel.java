package view;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class BoardPanel extends JPanel{

    private JPanel[][] squares;         // Array of JPanels that represent squares on the board

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

    /**
     * drawCheckers - toggles on/off checkers based on the provided status
     * @param row - the row of the checker
     * @param col - the column of the checker
     * @param status - true = on, false = off
     */
    private void drawCheckers(int row, int col, boolean status) {

    }

    private void paintBoard() {
        for (int row = 0; row < 8; row++) {
            // Even numbered rows (w,b,w,b,w,b,w,b)
            for (int col = 0; col < 8; col++) {
                if (row % 2 == 0) {
                    squares[row][col] = new JPanel();
                    squares[row][col].setLayout(new FlowLayout());
                    if (col % 2 == 0) {                                     // Even or odd column
                        squares[row][col].setBackground(Color.WHITE);
                        squares[row][col].add(new Piece(0));
                    } else {
                        squares[row][col].setBackground(Color.GRAY);
                        squares[row][col].add(new Piece(0));
                    }

                    add(squares[row][col]);
                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
                    squares[row][col] = new JPanel();
                    squares[row][col].setLayout(new FlowLayout());
                    if (col % 2 == 0)                                     // Even or odd column
                        squares[row][col].setBackground(Color.GRAY);

                    else
                        squares[row][col].setBackground(Color.WHITE);

                    add(squares[row][col]);
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
