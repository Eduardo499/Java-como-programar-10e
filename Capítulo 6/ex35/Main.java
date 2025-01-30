package ex35;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            askQuestion();
        }
    }

    private static void askQuestion() {
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int correctAnswer = number1 * number2;

        System.out.printf("Quanto é %d vezes %d? ", number1, number2);
        int userAnswer = scanner.nextInt();

        while (userAnswer != correctAnswer) {
            System.out.println("Não. Por favor, tente de novo.");
            userAnswer = scanner.nextInt();
        }

        System.out.println("Muito bem!");
    }
}