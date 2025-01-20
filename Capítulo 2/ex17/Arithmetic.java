import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int number1, number2, number3, add, mul;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        number1 = input.nextInt();

        System.out.print("Enter another integer: ");
        number2 = input.nextInt();

        System.out.print("Enter the last integer: ");
        number3 = input.nextInt();

        add = number1 + number2 + number3;
        mul = number1 * number2 * number3;

        System.out.printf("%d + %d + %d = %d%n", number1, number2, number3, add);
        System.out.printf("%d X %d X %d = %d%n", number1, number2, number3, mul);
        System.out.printf("The average is %d%n", ((number1 + number2 + number3) / 3));

        input.close();
    }
}
