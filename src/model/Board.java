package model;

/**
 * Board class represents an 8x8 2-d array of square objects.
 * @author Bryan Secoy
 * @version 1.0
 */
public class Board {

    private Square[][] board;
    private static Board brd;
    private static final int WIDTH = 8;
    private static final int HEIGHT = 8;
    private static final int WHITE = 1;
    private static final int BLACK = 2;

    /**
     * Default constructor
     */
    private Board() {
        board = new Square[HEIGHT][WIDTH];  // Create an 8x8 board of squares
        setUp();                            // Setup the board
    }

    private void setUp() {

        // Set up board with alternating black/white squares (pattern alternates each row also)
        for (int row = 0; row < HEIGHT; row++) {
            // Even numbered rows (w,b,w,b,w,b,w,b)

            for (int col = 0; col < 8; col+=2) {
                if (row % 2 == 0) {
                    board[row][col] = new Square(WHITE);
                    board[row][col + 1] = new Square(BLACK);
                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
                    board[row][col] = new Square(BLACK);
                    board[row][col + 1] = new Square(WHITE);
                }
            }
        }
    }

    /**
     * getBoard - returns the board (Singleton pattern)
     * @return - the checkerboard object
     */
    public static Board getBoard() {
        if (brd == null)
            brd = new Board();
        return brd;
    }

    /**
     * getSquare - returns the requested square
     * @param row - the row to be checked
     * @param col - the column to be checked
     * @return - the checker located in the given row/col
     */
    public Square getSquare(int row, int col) {
        Square squareToGet = null;

        if (row >=0 && row <=7) {
            if (col >=0 && col <=7) {
                squareToGet = board[row][col];
            }
        }
        return squareToGet;
    }
}
