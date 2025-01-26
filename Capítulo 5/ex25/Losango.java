package ex25;

import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do losango: ");
        int tamanho = scanner.nextInt();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= tamanho - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i == tamanho) {
                for (int k = 1; k <= tamanho; k++) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print(" ");
                    }
                    for (int l = 1; l <= tamanho - k; l++) {
                        System.out.print("*");
                    }
                    for (int l = 1; l <= tamanho - k; l++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}
