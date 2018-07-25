package Test;

import model.Board;
import model.Square;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    private Board board;

    @Before
    public void setup() {
        board = Board.getBoard();
    }

    @Test
    public void boardTest() {
        assertNotNull(board);
    }

    @Test
    public void getSquareTest() {
        Square square = board.getSquare(0,0);
        assertNotNull(square);
    }

}