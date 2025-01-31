package ex01GUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawCircularSpiral extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;  // Centro do painel no eixo X
        int centerY = getHeight() / 2; // Centro do painel no eixo Y
        int radius = 10;               // Raio inicial
        int steps = 20;                // Número de passos para desenhar a espiral
        int angleStart = 0;            // Ângulo inicial

        for (int i = 0; i < steps; i++) {
            // Desenha um semicírculo (180 graus)
            g.drawArc(centerX - radius, centerY - radius, 2 * radius, 2 * radius, angleStart, 180);

            // Atualiza o ângulo inicial para o próximo semicírculo
            angleStart += 180;

            // Aumenta o raio para o próximo semicírculo
            radius += 10;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circular Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawCircularSpiral());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}