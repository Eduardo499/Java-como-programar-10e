package ex37;
import java.util.Scanner;

public class Fatorial {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();

        System.out.println("O fatorial de " + n + " é " + fatorial(n));


        input.close();
    }
}
