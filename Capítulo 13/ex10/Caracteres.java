package ex10;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Caracteres extends JPanel {
    private final Random random = new Random();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        for (int i = 0; i < 15; i++) {
            g2d.setFont(new Font("Serif", Font.BOLD, random.nextInt(20) + 10));
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            char randomChar = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
            int x = random.nextInt(getWidth());
            int y = random.nextInt(getHeight());
            g2d.drawString(String.valueOf(randomChar), x, y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Caracteres Aleatórios");
        Caracteres panel = new Caracteres();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}