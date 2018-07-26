package view;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class BoardPanel {

    private static JPanel boardPanel;

    BoardPanel() {
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(8,8));
        paintBoard();
        boardPanel.setSize(50,50);
    }

    private void paintBoard() {
        for (int row = 0; row < 8; row++) {
            // Even numbered rows (w,b,w,b,w,b,w,b)

            for (int col = 0; col < 8; col+=2) {
                if (row % 2 == 0) {
                    JPanel panel = new JPanel();
                    JPanel panelTwo = new JPanel();
                    panel.setBackground(Color.WHITE);
                    panelTwo.setBackground(Color.BLACK);
                    boardPanel.add(panel);
                    boardPanel.add(panelTwo);

                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
                    JPanel panel = new JPanel();
                    JPanel panelTwo = new JPanel();
                    panel.setBackground(Color.BLACK);
                    panelTwo.setBackground(Color.WHITE);
                    boardPanel.add(panel);
                    boardPanel.add(panelTwo);
                }
            }
        }
    }

    Component getBoardPanel() {
        return boardPanel;
    }
}
