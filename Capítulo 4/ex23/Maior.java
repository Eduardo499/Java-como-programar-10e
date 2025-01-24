import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest1 = 0;
        int largest2 = 0;

        while (counter <= 10) {
            System.out.print("Digite um número: ");
            number = input.nextInt();

            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } else if (number > largest2) {
                largest2 = number;
            }

            
            counter++;
        }

        System.out.printf("Os maiores números digitados foram: %d e %d%n", largest1, largest2);
        
        input.close();
    }
}
