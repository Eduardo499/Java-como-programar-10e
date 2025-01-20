import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        // int c, thisIsAVariable, q76354, number;
        int number;
        System.out.print("Enter a integer: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("This is a Java program");
        System.out.printf("%s%n%s%n", "This is a Java", "Program");
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }
        input.close();
    }
}