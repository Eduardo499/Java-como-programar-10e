package ex19;
import javax.swing.JOptionPane;

public class Rendimento {
    public static void main(String[] args) {
        int item;
        double valor = 200;

        String sItem = JOptionPane.showInputDialog("Digite um item ou -1 para sair: ");
        item = Integer.parseInt(sItem);

        while (item != -1) {
            if (item == 1) {
                valor = valor + 0.09  * 239.99;
            }
            else if (item == 2) {
                valor = valor + 0.09 * 129.75;
            }
            else if (item == 3) {
                valor = valor + 0.09 * 99.95;
            }
            else if (item == 4) {
                valor = valor + 0.09 * 350.89;
            }
            else {
                JOptionPane.showMessageDialog(null, "Item inválido!");
            }
            sItem = JOptionPane.showInputDialog("Digite um item ou -1 para sair: ");
            item = Integer.parseInt(sItem);
            }

            JOptionPane.showMessageDialog(null, "O valor total é: " + valor);
            JOptionPane.showMessageDialog(null, "O rendimento semanal é: " + valor * 0.09);

    }
}
