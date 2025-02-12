package ex08;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class CirculosConcentricos extends JPanel {
    private final Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        int raio = 10;
        
        for (int i = 0; i < 8; i++) {
            int diametro = raio * 2;
            Ellipse2D.Double circulo = new Ellipse2D.Double(centroX - raio, centroY - raio, diametro, diametro);
            g2d.draw(circulo);
            raio += 10;
        }
        
        for (int i = 0; i < 10; i++) {
            g2d.setStroke(new BasicStroke(1 + random.nextFloat() * 3));
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            int x1 = random.nextInt(getWidth());
            int y1 = random.nextInt(getHeight());
            int x2 = random.nextInt(getWidth());
            int y2 = random.nextInt(getHeight());
            g2d.draw(new Line2D.Double(x1, y1, x2, y2));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Círculos e Linhas Aleatórias");
        CirculosConcentricos panel = new CirculosConcentricos();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
