package ex02GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Formas extends JPanel {
    private static final int NUM_SHAPES = 10;
    private static final Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        for (int i = 0; i < NUM_SHAPES; i++) {
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int w = random.nextInt(width / 2);
            int h = random.nextInt(height / 2);

            if (random.nextBoolean()) {
                g.fillRect(x, y, w, h);
            } else {
                g.fillOval(x, y, w, h);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formas Aleatórias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Formas());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}