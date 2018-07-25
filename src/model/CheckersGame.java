package model;

/**
 * CheckersGame - Manages the game information
 * @author Bryan Secoy
 * @version 1
 */
public class CheckersGame {

    //Declarations
    private Board board;
    private Player redPlayer;
    private Player blackPlayer;
    private static final int BLACK = 0;
    private static final int RED = 1;

    /**
     * CheckersGame - Default constructor
     */
    public CheckersGame() {
        board = Board.getBoard();
        redPlayer = new Player(RED);
        blackPlayer = new Player(BLACK);
    }

    /**
     * getBoard - returns the Board object
     * @return boards - the checkerboard
     */
    public Board getBoard() {
        return board;
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
            choice = blackPlayer;
        else if (which == RED) {
            choice = redPlayer;
        }
        else {
            choice = null;
        }

        return choice;
    }
}
