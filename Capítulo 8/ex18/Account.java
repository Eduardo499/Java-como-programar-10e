import java.math.BigDecimal;

public class Account {
    private String name; // variável de instância
    private BigDecimal balance; // variável de instância

    // Construtor da conta que recebe dois parâmetros
    public Account(String name, double balance) {
        this.name = name; // atribui nome à variável de instância

        // valida se o balance é maior que 0.0; se não for, a variável balance mantém o valor inicial de 0.0
        if (balance > 0.0) { // se o saldo for válido
            this.balance = new BigDecimal(String.valueOf(balance)); // atribui ao saldo utilizando String para evitar imprecisão
        } else {
            this.balance = new BigDecimal("0.0"); // se não for válido, inicializa com 0.0
        }
    }

    // Método que realiza o depósito (adiciona) apenas um valor válido ao saldo
    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0) { // se o depósito for válido
            balance = balance.add(depositAmount); // adiciona ao saldo (lembre-se que o BigDecimal é imutável)
        }
    }

    // Método que retorna o saldo da conta
    public BigDecimal getBalance() {
        return balance;
    }

    // Método que define o nome
    public void setName(String name) {
        this.name = name;
    }

    // Método que retorna o nome
    public String getName() {
        return name;
    }
}
