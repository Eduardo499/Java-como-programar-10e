package ex31;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            // Gera um número aleatório entre 1 e 1000
            int numberToGuess = random.nextInt(1000) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("Guess a number between 1 and 1000.");

            // Loop até o usuário adivinhar o número
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            }
            if (attempts <= 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else {
                System.out.println("You should be able to do better!");
            }
            
            // Pergunta se o usuário quer jogar novamente
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }
}