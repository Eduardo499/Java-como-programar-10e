package ex21;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = 0;

        while (counter <= 10) {
            System.out.print("Digite um número: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("O maior número digitado foi: %d\n", largest);
        
        input.close();
    }
}
