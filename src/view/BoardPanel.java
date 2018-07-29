package view;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * BoardPanel - JPanel that contains an 8x8 grid, made up of alternating colored panels (The playing board)
 */
class BoardPanel extends JPanel{

    private Square[][] squares;         // Array of JPanels that represent squares on the board
    EtchedBorder border;

    /**
     * Constructor method. Panel is 8x8 with alternating colored JPanels.
     */
    BoardPanel() {

         border = new EtchedBorder();
         this.setLayout(new GridLayout(8,8,1 , 1));
         squares = new Square[8][8];
         setUpBoard();
         drawCheckers();
         setSize(50,50);
    }

    /**
     *  drawCheckers - draws the checkers on the board (initial setup)
     */
    private void drawCheckers() {
        // Set up black checkers for player one
        for (int i = 0; i < 3; i++) {
            if (i == 0 || i == 2) {
                for (int j = 1; j < 8; j += 2) {
                    squares[i][j].drawChecker(0,0);
                }
            }

            if (i == 1) {
                for (int j = 0; j < 8; j+=2)
                    squares[i][j].drawChecker(0,0);
            }
        }

        //set up red checkers for player two
        for (int i = 5; i < 8; i++) {
            if (i == 5 || i == 7) {
                for (int j = 0; j < 8; j += 2)
                    squares[i][j].drawChecker(1,0);
            }

            if (i == 6) {
                for (int j = 1; j < 8; j+=2)
                    squares[i][j].drawChecker(1,0);
            }
        }
    }

    /**
     * setUpBoard - colors the tiles on the board.
     */
    private void setUpBoard() {
        for (int row = 0; row < 8; row++) {
            // Even numbered rows (w,b,w,b,w,b,w,b)
            for (int col = 0; col < 8; col++) {
                if (row % 2 == 0) {
                    if (col % 2 == 0) {                                   // Even or odd column
                        squares[row][col] = new Square(-1, -1, 1);
                    } else {
                        squares[row][col] = new Square(-1, -1, 0);
                    }

                    add(squares[row][col]);
                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
                    if (col % 2 == 0) {                                  // Even or odd column
                        squares[row][col] = new Square(-1, -1, 0);
                    } else {
                        squares[row][col] = new Square(-1, -1, 1);
                    }

                    add(squares[row][col]);
                }
            }
        }
    }

    /**
     * Remove a checker and draw it in a new location
     * @param row - row to remove from
     * @param col - column to remove from
     * @param newRow - row to add to
     * @param newCol - column to add to
     */
    public void moveChecker(int row, int col, int newRow, int newCol) {
        int p = squares[row][col].getPlayer();      // Which player
        int t = squares[row][col].getType();        // Which type of checker
        squares[row][col].removerChecker();         
        squares[newRow][newCol].drawChecker(p,t);
    }
}

