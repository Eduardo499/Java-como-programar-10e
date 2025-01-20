import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        char character;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        character = input.nextLine().charAt(0);

        System.out.printf("The character %c has the value %d%n", character, ((int) character));

        input.close();
    }
}
