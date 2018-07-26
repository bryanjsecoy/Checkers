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
                    boardPanel.setBackground(Color.WHITE);
                    boardPanel.setBackground(Color.BLACK);
                }
                // Odd numbered rows (b,w,b,w,b,w,b,w)
                else {
                    boardPanel.setBackground(Color.BLACK);
                    boardPanel.setBackground(Color.WHITE);
                }
            }
        }
    }

    Component getBoardPanel() {
        return boardPanel;
    }
}
