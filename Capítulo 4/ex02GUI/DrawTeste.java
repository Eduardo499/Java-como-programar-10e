package ex02GUI;
import javax.swing.JFrame;

public class DrawTeste {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.add(panel);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
