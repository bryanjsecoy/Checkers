package model;

/**
 * CheckersGame - Manages the game information
 * @author Bryan Secoy
 * @version 1
 */
public class CheckersGame {

    //Declarations
    private BoardData boardData;
    private Player playerOne;
    private Player playerTwo;
    private static final int BLACK = 0;
    private static final int RED = 1;

    /**
     * CheckersGame - Default constructor
     */
    public CheckersGame() {
        boardData = BoardData.getBoard();
        playerOne = new Player(RED);
        playerTwo = new Player(BLACK);
    }

    /**
     * getBoardData - returns the BoardData object
     * @return boards - the checkerboard
     */
    public BoardData getBoardData() {
        return boardData;
    }

    /**
     * Return the Player identified by the parameter which
     *
     * @param which - 0 = computer player, 1 = human player
     * @return the Player
     */
    public Player getPlayer(int which) {
        Player choice;

        if (which == BLACK)
            choice = playerTwo;
        else if (which == RED) {
            choice = playerOne;
        }
        else {
            choice = null;
        }

        return choice;
    }
}
