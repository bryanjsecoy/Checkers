package model;


/**
 * Check class creates individual checkers with attributes for color and type.
 * @author Bryan Secoy
 * @version 1.0
 */
public class Checker {
    private int color;
    private boolean king;

    /**
     * Constructor - Assigns a color and type to a checker.
     * @param color - The color of the checker (Red = 1 or Black = 0)
     */
    public  Checker(int color) {
        this.color = color;
        king = false;          // Not a king by default
    }

    /**
     * kingMe - Upgrades a normal checker to a king when it reaches the opposing players far side of the board.
     */
    public void kingMe() {
        king = true;
    }

    /**
     * getColor - getter method for checker color
     * @return color - the color of the checker (as an int)
     */
    public int getColor() {
        return color;
    }

    /**
     * isKing - checks is a checker is a king or not
     * @return king. True is a king, false if not.
     */
    public boolean isKing() {
        return king;
    }
}
