package test;

import model.Checker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerTest {
    private int black;
    private int red;

    @Before
    public void setUp() {
        black = 0;
        red = 1;
    }

    @Test
    public void testConstructor() {
        Checker checker = new Checker(black);
        assertNotNull(checker);
        int color = checker.getColor();
        assertEquals(black, color);
    }

    @Test
    public void kingMe() {
        Checker checker = new Checker(red);
        assertFalse(checker.isKing());
        checker.kingMe();
        assertTrue(checker.isKing());
    }
}