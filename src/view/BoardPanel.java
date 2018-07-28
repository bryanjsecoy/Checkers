package view;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

/**
 * BoardPanel - JPanel that contains an 8x8 grid, made up of alternating colored panels (The playing board)
 */
class BoardPanel extends JPanel{

    private JPanel[][] squares;         // Array of JPanels that represent squares on the board

    /**
     * Constructor method. Panel is 8x8 with alternating colored JPanels.
     */
    BoardPanel() {
        this.setLayout(new GridLayout(8,8));
        squares = new JPanel[8][8];
        paintBoard();
        drawCheckers();
        setSize(50,50);
    }

    private void drawCheckers() {
        // Set up black checkers for player one
        for (int i = 0; i < 3; i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < 8; j += 2)
                    squares[i][j].add(new Piece(0, 0));
            }

            if (i == 1) {
                for (int j = 1; j < 8; j+=2)
                    squares[i][j].add(new Piece(0, 0));
            }
        }

        //set up red checkers for player two
        for (int i = 5; i < 8; i++) {
            if (i == 5 || i == 7) {
                for (int j = 1; j < 8; j += 2)
                    squares[i][j].add(new Piece(0, 1));
            }

            if (i == 6) {
                for (int j = 0; j < 8; j+=2)
                    squares[i][j].add(new Piece(0, 1));
            }
        }
    }

    private void paintBoard() {
        for (int row = 0; row < 8; row++) {
            // Even numbered rows (w,b,w,b,w,b,w,b)
            for (int col = 0; col < 8; col++) {
                squares[row][col] = new JPanel();
                squares[row][col].setLayout(null);
                if (row % 2 == 0) {
                    if (col % 2 == 0)                                     // Even or odd column
                        squares[row][col].setBackground(Color.WHITE);
                    else
                        squares[row][col].setBackground(Color.GRAY);

                    add(squares[row][col]);
                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
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
