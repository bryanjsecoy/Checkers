package model;

/**
 * BoardData class represents an 8x8 2-d array of square objects.
 * @author Bryan Secoy
 * @version 1.0
 */
public class BoardData {

    private int[][] board;
    private static BoardData brd;
    private static final int WIDTH = 8;
    private static final int HEIGHT = 8;
    private static final int RED = 1;
    private static final int BLACK = 2;

    /**
     * Default constructor
     */
    private BoardData() {
        board = new int[HEIGHT][WIDTH];  // Create an 8x8 board of squares
        setUp();                            // Setup the board
    }

    private void setUp() {

        // Place checkers on the board

    }

    /**
     * getBoardData - returns the board (Singleton pattern)
     * @return - the checkerboard object
     */
    public static BoardData getBoard() {
        if (brd == null)
            brd = new BoardData();
        return brd;
    }

    /**
     * getSquare - returns the requested square
     * @param row - the row to be checked
     * @param col - the column to be checked
     * @return - the checker located in the given row/col
     */
    public int getSquare(int row, int col) {
        int squareToGet = 0;

        if (row >=0 && row <=7) {
            if (col >=0 && col <=7) {
                squareToGet = board[row][col];
            }
        }
        return squareToGet;
    }
}
