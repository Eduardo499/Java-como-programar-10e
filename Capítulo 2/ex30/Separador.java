import java.util.Scanner;

public class Separador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número qualquer: ");
        int num = input.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Erro. O número deve ter mais que cinco dígitos.");
        }
        else {
            int dig1 = num / 10000;
            int dig2 = (num / 1000) % 10;
            int dig3 = (num / 100) % 10;
            int dig4 = (num / 10) % 10;
            int dig5 = num % 10;

            System.out.printf("%d  %d  %d  %d  %d%n", dig1, dig2, dig3, dig4, dig5);
        }
        input.close(); 
    }
}
