package ex01GUI;

import java.security.SecureRandom;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Alvo extends JPanel {
    private SecureRandom random = new SecureRandom();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int red1 = random.nextInt(256);
        int green1 = random.nextInt(256);
        int blue1 = random.nextInt(256);

        int red2 = random.nextInt(256);
        int green2 = random.nextInt(256);
        int blue2 = random.nextInt(256);

        g.setColor(new Color(red1, green1, blue1));
        g.fillOval(10, 10, 200, 200);

        g.setColor(new Color(red2, green2, blue2));
        g.fillOval(22, 22, 175, 175);

        g.setColor(new Color(red1, green1, blue1));
        g.fillOval(35, 35, 150, 150);

        g.setColor(new Color(red2, green2, blue2));
        g.fillOval(47, 47, 125, 125);

        g.setColor(new Color(red1, green1, blue1));
        g.fillOval(60, 60, 100, 100);

        g.setColor(new Color(red2, green2, blue2));
        g.fillOval(72, 72, 75, 75);

        g.setColor(new Color(red1, green1, blue1));
        g.fillOval(85, 85, 50, 50);

        g.setColor(new Color(red2, green2, blue2));
        g.fillOval(97, 97, 25, 25);
    }

    public static void main(String[] args) {
        Alvo panel = new Alvo();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}
