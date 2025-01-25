package ex11;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número de elementos: ");
        int n = input.nextInt();

        System.out.println("Digite o primeiro número: ");
        int menor = input.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Digite o próximo número: ");
            int x = input.nextInt();
            if (x < menor) {
                menor = x;
            }
        }
        System.out.printf("O menor número digitado foi %d%n", menor);
        input.close();
    }
    
}
