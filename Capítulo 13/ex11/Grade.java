package ex11;

import javax.swing.*;
import java.awt.*;

public class Grade extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int gridSize = 8;
        int cellWidth = getWidth() / gridSize;
        int cellHeight = getHeight() / gridSize;
        g2d.setColor(Color.BLACK);
        
        for (int i = 0; i <= gridSize; i++) {
            g2d.drawLine(i * cellWidth, 0, i * cellWidth, getHeight());
            g2d.drawLine(0, i * cellHeight, getWidth(), i * cellHeight);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grade");
        Grade panel = new Grade();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
