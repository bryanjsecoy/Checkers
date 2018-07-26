package view;

import javax.swing.*;
import controller.CheckersListener;

/**
 * CheckersGUI class is the graphical piece of the game.
 * @author Bryan Secoy
 * @version 1.0
 */
public class CheckersGUI extends JFrame {
    private BoardPanel boardPanel;          // Displays the checker board
    private CheckersListener listener;      // Listener for interacting
    private JPanel mainPanel;               // Holds the boardPanel

    /**
     * Constructor
     */
    public CheckersGUI() {
        this.setTitle("Checkers");
        createComponents();

        boardPanel = new BoardPanel();
        setPanels();
        addListeners();
        this.addWindowListener(listener);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }

    private void addListeners() {
    }

    private void createComponents() {
        mainPanel = new JPanel();
        listener = new CheckersListener(this);
    }

    /**
     * getBoardPanel - getter method for BoardPanel
     * @return boardPanel
     */
    public BoardPanel getBoardPanel() {
        return this.boardPanel;
    }

    private void setPanels() {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.add(boardPanel.getBoardPanel());
    }
}
