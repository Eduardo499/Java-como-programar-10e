import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int number1, number2, add, sub, mul;
        float div;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        number1 = input.nextInt();

        System.out.print("Enter other integer: ");
        number2 = input.nextInt();

        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = (float) number1 / number2;

        System.out.printf("%d + %d = %d%n", number1, number2, add);
        System.out.printf("%d - %d = %d%n", number1, number2, sub);
        System.out.printf("%d X %d = %d%n", number1, number2, mul);
        System.out.printf("%d / %d = %.2f%n", number1, number2, div);

        input.close();
    }
}
