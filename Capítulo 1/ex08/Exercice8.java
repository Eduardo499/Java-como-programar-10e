// Este programa executa um cálculo de exemplo de folha de pagamento

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        b = input.nextInt();

        System.out.print("Digite outro número: ");
        c = input.nextInt();

        a = b * c;

        System.out.printf("O produto de b e c é %d%n", a);
    }
}
