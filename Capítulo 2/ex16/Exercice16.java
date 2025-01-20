import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number1 = input.nextInt();

        System.out.print("Enter another number: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.printf("%d is larger than %d%n", number1, number2);
        }
        else if (number2 > number1) {
            System.out.printf("%d is larger than %d%n", number2, number1);
        }
        else {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}