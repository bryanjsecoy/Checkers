package view;

import javax.swing.*;

import Checkers.Checkers;
import controller.CheckersListener;

import java.awt.*;

public class CheckersGUI extends JPanel {

    public CheckersGUI() {
        setPanels();
    } // End Default Constructor

    private void setPanels() {
        JFrame window = new JFrame("Checkers");
        Checkers content = new Checkers();
        //window.setContentPane(content);
        window.pack();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation( (screensize.width - window.getWidth())/2,
                (screensize.height - window.getHeight())/2 );
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setResizable(false);
        window.setVisible(true);
    }
}
