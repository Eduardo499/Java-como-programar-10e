package B;
import javax.swing.JFrame;

import A.DrawPanelA;

public class DrawTestB {
    public static void main(String[] args) {
        DrawPanelA panel = new DrawPanelA();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
