package ex17;
import java.util.Scanner;

public class Produto {
    private int numero;
    private double preco;
    private String descricao;

    public Produto(int numero, double preco, String descricao) {
        this.numero = numero;
        this.preco = preco;
        this.descricao = descricao;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto[] produtos = new Produto[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número do produto: ");
            int numero = input.nextInt();

            System.out.println("Digite o preço do produto: ");
            double preco = input.nextDouble();
            input.nextLine(); // consume the newline

            System.out.println("Digite a descrição do produto: ");
            String descricao = input.nextLine();

            produtos[i] = new Produto(numero, preco, descricao);
        }

        System.out.print("Digite o número do produto que deseja buscar: ");
        int value = input.nextInt();

        System.out.println("Número\tPreço\tDescrição");
        for (Produto produto : produtos) {
            if (value == produto.getNumero()) {
                System.out.printf("%d\t%.2f\t%s%n", produto.getNumero(), produto.getPreco(), produto.getDescricao());
            }
        }

        input.close();
    }

}
