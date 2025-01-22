package A;
import javax.swing.JFrame;

public class DrawTestA {
    public static void main(String[] args) {
        DrawPanelA panel = new DrawPanelA();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
