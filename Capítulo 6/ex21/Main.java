package ex21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada do usuário
        System.out.print("Insira um número inteiro entre 1 e 99999: ");
        int numero = scanner.nextInt();

        // Chama o método displayDigits passando o número inserido
        NumberUtils.displayDigits(numero);

        scanner.close();
    }
}