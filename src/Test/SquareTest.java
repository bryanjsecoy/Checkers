package Test;

import model.Checker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private Square square;
    private Checker checker;

    @Before
    public void setup() {
        square = new Square(1);
        checker = new Checker(0);
    }

    @Test
    public void constructorTest() {
        Square s = new Square(1);
        assertNotNull(s);
    }

    @Test
    public void addCheckerTest() {
        assertNull(square.getChecker());                // Should be null by default

        assertTrue(square.addChecker(checker));         // add checker to square, should be true
        assertTrue(square.isOccupied());                // Should be true
    }

    @Test
    public void getChecker() {
        square.addChecker(checker);                     // Add checker to the square
        Checker newChecker = square.getChecker();       // Get checker from square

        assertNotNull(newChecker);                      // The new checker should not be null
        assertEquals(checker, newChecker);              // Checkers should be the same
    }

    @Test
    public void getColor() {
        assertEquals(1,square.getColor());      // Color should equal 1.
    }

    @Test
    public void isOccupied() {
        square.addChecker(checker);
        assertTrue(square.isOccupied());
    }

    @Test
    public void removeChecker() {
        square.addChecker(checker);
        assertTrue(square.isOccupied());
        square.removeChecker();
        assertNull(square.getChecker());
    }
}