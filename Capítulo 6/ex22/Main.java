package ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha uma opção (1 - Celsius, 2 - Fahrenheit): ");
        int escolha = input.nextInt();

        System.out.print("Digite a temperatura na unidade escolhida: ");
        double temperatura = input.nextDouble();

        switch (escolha) {
            case 1:
                System.out.printf("%.2f °C = %.2f °F%n", temperatura, fahrenheit(temperatura));
                break;
            case 2:
                System.out.printf("%.2f °F = %.2f °C%n", temperatura, celsius(temperatura));
                break;
        }

        input.close();
    }
    public static double celsius(double temperature) {
        return 5.0 / 9.0 * (temperature - 32);
    }
    public static double fahrenheit(double temperature) {
        return 9.0 / 5.0 * temperature + 32;
    }
}