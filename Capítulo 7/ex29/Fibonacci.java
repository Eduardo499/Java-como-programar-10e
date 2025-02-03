package ex29;

import java.util.Scanner;

public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        long resultado = fibonacci(n);
        System.out.println("O " + n + "º número de Fibonacci é: " + resultado);

        scanner.close();
    }
}
