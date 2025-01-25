package ex01GUI;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Circulo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int x = width / 2 - 5;
        int y = height / 2 - 5;
        int raio = 10;

        for (int i = 0; i < 20; i++) {
            g.drawOval(x, y, raio, raio);
            raio += 10;
            x -= 5;
            y -= 5;
        
        }
    }
    public static void main(String[] args) {
        Circulo panel = new Circulo();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
    
}
