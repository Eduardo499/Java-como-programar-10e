package ex09;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Triangulos extends JPanel {
    private final Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        for (int i = 0; i < 10; i++) {
            g2d.setStroke(new BasicStroke(1 + random.nextFloat() * 3));
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            int x1 = random.nextInt(getWidth());
            int y1 = random.nextInt(getHeight());
            int x2 = random.nextInt(getWidth());
            int y2 = random.nextInt(getHeight());
            g2d.draw(new Line2D.Double(x1, y1, x2, y2));
        }
        
        for (int i = 0; i < 5; i++) {
            int x1 = random.nextInt(getWidth());
            int y1 = random.nextInt(getHeight());
            int x2 = random.nextInt(getWidth());
            int y2 = random.nextInt(getHeight());
            int x3 = random.nextInt(getWidth());
            int y3 = random.nextInt(getHeight());
            
            GeneralPath triangulo = new GeneralPath();
            triangulo.moveTo(x1, y1);
            triangulo.lineTo(x2, y2);
            triangulo.lineTo(x3, y3);
            triangulo.closePath();
            
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g2d.fill(triangulo);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Círculos, Linhas e Triângulos Aleatórios");
        Triangulos panel = new Triangulos();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
