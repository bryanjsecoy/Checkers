package model;

public class Player {

    int color;
    int numCheckers;
    int startingNumCheckers = 12;

    public Player(int color) {
        this.color = color;
        numCheckers = startingNumCheckers;
    }

    /**
     * loseChecker - Reduces the number of checkers a player has by num.
     * @param num - The number of checkers lost. (Single, Double, Tripple jumps...)
     */
    public void loseChecker(int num) {
        numCheckers-=num;
    }

}
