import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GraficoBarras extends JPanel {
    private int[] valores = new int[5];

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < valores.length; i++) {
            int altura = valores[i] * 10;
            g.drawRect(10 + i * 50, 100 - altura, 40, altura);
        }
    }

    public static void main(String[] args) {
        GraficoBarras panel = new GraficoBarras();
        for (int i = 0; i < 5; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            panel.valores[i] = valor;
        }
        
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}