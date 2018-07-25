package controller;

import model.Player;
import model.CheckersGame;
import view.CheckersGUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * CheckersListener - handles events generated from CheckersGUI
 * @author Bryan Secoy
 * @version 1
 */
public class CheckersListener extends WindowAdapter implements WindowListener {
    private CheckersGame game;
    private CheckersGUI frame;
    private Player human;
    private Player computer;

    /**
     * Explicit value constructor
     * @param frame - The frame
     */
    public CheckersListener(CheckersGUI frame) {
        this.frame = frame;
        game = new CheckersGame();
        human = game.getPlayer(1);
        computer = game.getPlayer(0);
    }
    
    public void WindowClosing(WindowEvent event) {
        endGame();
        System.exit(0);
    }

    public void windowOpened(WindowEvent event) {
        startGame();
    }

    private void startGame() {
    }

    private void endGame() {
    }
}
