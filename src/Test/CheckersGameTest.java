package Test;

import model.Board;
import model.CheckersGame;
import model.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckersGameTest {
    private CheckersGame game;


    @Test
    public void getBoard() {
        game = new CheckersGame();
        assertNotNull(game);
    }

    @Test
    public void getBoardTest() {
        game = new CheckersGame();
        Board board = game.getBoard();
        assertNotNull(board);
    }

    @Test
    public void getPlayer() {
        game = new CheckersGame();
        Player result = game.getPlayer(0);
        assertNotNull(result);
    }
}