package A;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanelA extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = height;

        g.drawLine(x1, y1, x2, y2);

       while (x2 != width && y2 != 0) {
        if (y2 > 0 && x2 < width) {
            y2--;
            x2++;
            g.drawLine(x1, y1, x2, y2);
        }
       }
    }
}