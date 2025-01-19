import java.util.Scanner;

public class Exercice24 {
    public static void main(String[] args) {
        int number1, number2, number3, number4, number5;
        int maior, menor;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        number1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        number2 = input.nextInt();

        System.out.print("Insira o terceiro número: ");
        number3 = input.nextInt();

        System.out.print("Insira o quarto número: ");
        number4 = input.nextInt();

        System.out.print("Insira o quinto número: ");
        number5 = input.nextInt();

        maior = number1;
        menor = number1;

        if (number2 > maior) {
            maior = number2;
        }
        if (number2 < menor) {
            menor = number2;
        }
        
        // Compara o terceiro número
        if (number3 > maior) {
            maior = number3;
        }
        if (number3 < menor) {
            menor = number3;
        }
        
        // Compara o quarto número
        if (number4 > maior) {
            maior = number4;
        }
        if (number4 < menor) {
            menor = number4;
        }
        
        // Compara o quinto número
        if (number5 > maior) {
            maior = number5;
        }
        if (number5 < menor) {
            menor = number5;
        }

        System.out.printf("O maior número é o %d%n", maior);
        System.out.printf("O menor número é o %d%n", menor);

        input.close();
    }
}
