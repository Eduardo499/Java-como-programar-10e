package ex06;

import javax.swing.*;
import java.awt.*;

public class CirculosConcentricos extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        int raio = 10;
        
        for (int i = 0; i < 8; i++) {
            int diametro = raio * 2;
            g.drawArc(centroX - raio, centroY - raio, diametro, diametro, 0, 360);
            raio += 10;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Círculos Concêntricos");
        CirculosConcentricos panel = new CirculosConcentricos();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
