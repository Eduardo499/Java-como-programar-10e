package ex02GUI;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int widht = getWidth();
        int height = getHeight();

        int borderX, borderY;
        int countX = 1;
        int countY = 1;
        int loop = 1;

        borderX = widht / 15;
        borderY = height / 15;

        while (loop < 15) {
            g.drawLine(0, borderY * countY, borderX * countX, height);
            g.drawLine(0, height - borderY * countY, borderX * countX, 0);
            g.drawLine(widht, borderY * countY, widht - borderX * countX, height);
            g.drawLine(widht, height - borderY * countY, widht - borderX * countX, 0);

            ++loop;
            ++countX;
            ++countY;
        }
    }
}
