import java.util.Scanner;

public class CalculadoraEconomia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o total de quilômetros dirigidos por dia: ");
        double quilometrosPorDia = input.nextDouble();

        System.out.print("Digite o preço por litro de gasolina (em R$): ");
        double precoPorLitro = input.nextDouble();

        System.out.print("Digite a média de quilômetros por litro: ");
        double kmPorLitro = input.nextDouble();

        System.out.print("Digite as taxas de estacionamento por dia (em R$): ");
        double taxasEstacionamento = input.nextDouble();

        System.out.print("Digite o pedágio por dia (em R$): ");
        double pedagioPorDia = input.nextDouble();

        double litrosNecessarios = quilometrosPorDia / kmPorLitro;
        double custoCombustivel = litrosNecessarios * precoPorLitro;
        double custoTotalDiario = custoCombustivel + taxasEstacionamento + pedagioPorDia;

        System.out.printf("O custo diário de dirigir para o trabalho é: R$%.2f%n", custoTotalDiario);

        input.close();
    }
}