import java.util.Scanner;

public class Populacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a população mundial atual (em bilhões): ");
        double populacao = input.nextDouble();

        System.out.print("Digite o percentual de crescimento populacional atual: ");
        double percentual = input.nextDouble();

        double taxa = percentual / 100 + 1;

        System.out.printf("População estimada para 1 ano: %.2f%n bilhões", (populacao * taxa));
        System.out.printf("População estimada para 2 anos: %.2f%n bilhões", (populacao * taxa * taxa));
        System.out.printf("População estimada para 3 anos: %.2f%n bilhões", (populacao * taxa * taxa * taxa));
        System.out.printf("População estimada para 4 anos: %.2f%n bilhões", (populacao * taxa * taxa * taxa * taxa));

        input.close();
    }
}
