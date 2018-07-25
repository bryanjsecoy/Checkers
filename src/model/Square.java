package model;

/**
 * Square - An individual square on the board.
 */
public class Square {

    //Declarations
    private boolean occupied;               // Is there a checker in the square
    private Checker checker;                // The checker occupying the square
    private int color;                    // The color of the square

    /**
     * Constructor
     * @param newColor - The color of the new square
     */
    public Square(int newColor) {
        this.occupied = false;
        this.color = newColor;
        this.checker = null;
    }

    /**
     * addChecker - Places a checker in the square
     * @param checker - The checker being added to the square
     * @return added - True is added, false if failed to add
     */
    public boolean addChecker(Checker checker) {
        boolean added;
        occupied = true;

        /* add checker to the square and set added to true */
        if (checker == null) {
            added = false;
        } else {
            added = true;
            this.checker = checker;
        }

        return added;
    }

    /**
     * getChecker - getter method for checker
     * @return - The checker occupying the square
     */
    public Checker getChecker() {

        return checker;
    }

    /**
     * getColor - getter method for color
     * @return - the color of the square
     */
    public int getColor() {
        return this.color;
    }

    /**
     * isOccupied - Is the square occupied by a checker?
     * @return occupied- true if occupied by a checker, false if not.
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * removeChecker - removes the checker from the square and sets occupied to false
     */
    public void removeChecker() {
        checker = null;
        occupied = false;
    }
}
