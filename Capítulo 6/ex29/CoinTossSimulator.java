package ex29;

import java.util.Scanner;
import java.security.SecureRandom;

enum Coin {
    HEADS("Cara"),
    TAILS("Coroa");

    private final String side;

    Coin(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return side;
    }
}

public class CoinTossSimulator {
    private static SecureRandom random = new SecureRandom();

    public static Coin flip() {
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Lançar moeda (Toss Coin)");
            System.out.println("2. Ver resultados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Coin result = flip();
                    System.out.println("Resultado: " + result);

                    if (result == Coin.HEADS) {
                        headsCount++;
                    } else {
                        tailsCount++;
                    }
                    break;

                case "2":
                    System.out.println("\nResultados até agora:");
                    System.out.println("Cara: " + headsCount + " vezes");
                    System.out.println("Coroa: " + tailsCount + " vezes");
                    break;

                case "3":
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}