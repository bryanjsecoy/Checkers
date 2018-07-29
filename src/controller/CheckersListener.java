package controller;

import model.Player;
import model.CheckersGame;
import view.CheckersGUI;

import java.awt.*;
import java.awt.event.*;

/**
 * CheckersListener - handles events generated from CheckersGUI
 * @author Bryan Secoy
 * @version 1
 */
public class CheckersListener extends WindowAdapter implements WindowListener, MouseListener {

    private static Component piece;

    /**
     * Explicit value constructor
     * @param frame - The frame
     */
    public CheckersListener(CheckersGUI frame) {
        CheckersGUI frame1 = frame;
        CheckersGame game = new CheckersGame();
        Player human = game.getPlayer(1);
        Player computer = game.getPlayer(0);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        piece = (e.getComponent());
        System.out.println(piece.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
