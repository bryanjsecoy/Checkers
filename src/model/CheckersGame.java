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
    public static final int BLACK = 0;
    public static final int RED = 1;

    /**
     * CheckersGame - Default constructor
     */
    public CheckersGame() {
        board = Board.getBoard();
        redPlayer = new Player(0);
        blackPlayer = new Player(1);
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
        Player choice = redPlayer;

        if (which == 0)
            choice = blackPlayer;

        return choice;
    }
}
