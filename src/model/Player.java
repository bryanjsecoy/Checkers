package model;

/**
 * Player class represents a checkers player.
 * @author Bryan Secoy
 * @version 1.0
 */
public class Player {

    private int color;                  // Color of the player (0 = black, 1 = red);
    private int numCheckers;            // How many checkers a player has
    private static final int startingNumCheckers = 12;

    /**
     * Constructor method
     * @param color - The color of the player (0 = black, 1 = red);
     */
    public Player(int color) {
        if (color > -1 && color < 2) {
            this.color = color;
        } else {
            System.out.println("Must use player 1 or 2 only");
            this.color = -1;
        }
        this.numCheckers = startingNumCheckers;
    }

    /**
     * getColor - getter for color
     * @return color - The color of the player
     */
    public int getColor() {
        return color;
    }

    /**
     * getNumCheckers - getter for numCheckers
     * @return numCheckers - the number of checkers a player has
     */
    public int getNumCheckers() {
        return numCheckers;
    }

    /**
     * loseChecker - Reduces the number of checkers a player has by num.
     * @param num - The number of checkers lost. (Single, Double, Tripple jumps...)
     */
    public void loseChecker(int num) {
        if (numCheckers > num && num > 0) {
            numCheckers -= num;
        } else {
            numCheckers = 0;
        }
    }

    /**
     * setNumCheckers - setter for numCheckers (Used for resetting a game)
     * @param numCheckers - The number of checkers being set
     */
    public void setNumCheckers(int numCheckers) {
        this.numCheckers = numCheckers;
    }
}
