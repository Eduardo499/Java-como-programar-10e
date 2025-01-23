package ex18;
import javax.swing.JOptionPane;

public class LimiteCredito {
    public static void main(String[] args) {
        int conta, saldoInicial, totalItens, totalCreditos, limiteCredito, novoSaldo;
        String sConta, sSaldoInicial, sTotalItens, sTotalCreditos, sLimiteCredito;

        sConta = JOptionPane.showInputDialog("Digite o número da conta: ");
        conta = Integer.parseInt(sConta);

        while (conta != -1) {
            sSaldoInicial = JOptionPane.showInputDialog("Digite o saldo inicial: ");
            saldoInicial = Integer.parseInt(sSaldoInicial);

            sTotalItens = JOptionPane.showInputDialog("Digite o total de itens: ");
            totalItens = Integer.parseInt(sTotalItens);

            sTotalCreditos = JOptionPane.showInputDialog("Digite o total de créditos: ");
            totalCreditos = Integer.parseInt(sTotalCreditos);

            sLimiteCredito = JOptionPane.showInputDialog("Digite o limite de crédito: ");
            limiteCredito = Integer.parseInt(sLimiteCredito);

            novoSaldo = saldoInicial + totalItens - totalCreditos;

            if (novoSaldo > limiteCredito) {
                JOptionPane.showMessageDialog(null, "Conta: " + conta + "\nLimite de crédito: " + limiteCredito + "\nSaldo: " + novoSaldo + "\nLimite de crédito excedido!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Conta: " + conta + "\nLimite de crédito: " + limiteCredito + "\nSaldo: " + novoSaldo);
            }

            sConta = JOptionPane.showInputDialog("Digite o número da conta: ");
            conta = Integer.parseInt(sConta);
        }
    }
}
