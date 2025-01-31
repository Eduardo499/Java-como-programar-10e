package ex01GUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawSquareSpiral extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;  // Centro do painel no eixo X
        int centerY = getHeight() / 2; // Centro do painel no eixo Y
        int length = 10;               // Comprimento inicial da linha
        int steps = 20;                // Número de passos para desenhar a espiral

        int x = centerX;
        int y = centerY;

        for (int i = 0; i < steps; i++) {
            // Direita
            drawLine(g, x, y, x + length, y);
            x += length;

            // Baixo
            drawLine(g, x, y, x, y + length);
            y += length;

            // Aumenta o comprimento da linha
            length += 10;

            // Esquerda
            drawLine(g, x, y, x - length, y);
            x -= length;

            // Cima
            drawLine(g, x, y, x, y - length);
            y -= length;

            // Aumenta o comprimento da linha
            length += 10;
        }
    }

    private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawSquareSpiral());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}