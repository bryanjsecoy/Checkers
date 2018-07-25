package Test;

import model.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private static final int BLACK = 0;
    private static final int RED = 1;
    private Player pOne;
    private Player pTwo;

    @Test
    public void constructorTest() {
        pOne = new Player(BLACK);
        pTwo = new Player(RED);
        assertNotNull("pOne should not be null", pOne);
        assertNotNull("pTwo should not be null", pTwo);
    }

    @Test
    public void getColorTest() {
        pOne = new Player(BLACK);
        assertEquals(BLACK, pOne.getColor());
        pTwo = new Player(3);
        assertEquals(-1, pTwo.getColor());
    }

    @Test
    public void getNumCheckersTest() {
        pOne = new Player(BLACK);
        assertEquals(12, pOne.getNumCheckers());
    }

    @Test
    public void loseChecker() {
        pOne = new Player(BLACK);
        assertEquals(12, pOne.getNumCheckers());
        pOne.loseChecker(1);
        assertEquals(11, pOne.getNumCheckers());
    }

    @Test
    public void setNumCheckersTest() {
        pOne = new Player(BLACK);
        assertEquals(12, pOne.getNumCheckers());
        pOne.setNumCheckers(5);
        assertEquals(5, pOne.getNumCheckers());
        pOne.setNumCheckers(40);
        assertEquals(0, pOne.getNumCheckers());
    }
}