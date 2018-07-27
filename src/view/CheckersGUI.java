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
        this.setSize(500,500);
        boardPanel = new BoardPanel();
        setPanels();
        addListeners();
        this.addWindowListener(listener);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        //pack();
        setVisible(true);
    }

    private void addListeners() {
    }

    /**
     * Creates components to display and interact with the game
     */
    private void createComponents() {
        mainPanel = new JPanel();
        listener = new CheckersListener(this);
    }

    /**
     * setPanels - sets up and adds panels to the mainPanel
     */
    private void setPanels() {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.add(boardPanel);
    }
}
