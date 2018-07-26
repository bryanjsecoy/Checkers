package Test;

import model.BoardData;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardDataTest {

    private BoardData boardData;

    @Before
    public void setup() {
        boardData = BoardData.getBoard();
    }

    @Test
    public void boardTest() {
        assertNotNull(boardData);
    }

    @Test
    public void getSquareTest() {
        int square = boardData.getSquare(0,0);
        assertNotNull(square);
    }

}