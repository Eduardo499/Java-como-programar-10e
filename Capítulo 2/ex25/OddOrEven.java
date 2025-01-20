import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.printf("%d is Even%n", number);
        }
        else {
            System.out.printf("%d is Odd%n", number);
        }

        input.close();
    }
}