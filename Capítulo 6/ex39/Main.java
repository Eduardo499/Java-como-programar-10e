package ex39;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    private static int correctAnswers = 0;
    private static int incorrectAnswers = 0;
    private static int difficultyLevel = 1;
    private static int problemType = 1;

    public static void main(String[] args) {
        while (true) {
            chooseDifficultyLevel();
            chooseProblemType();
            for (int i = 0; i < 10; i++) {
                askQuestion();
            }
            evaluatePerformance();
            resetCounters();
        }
    }

    private static void chooseDifficultyLevel() {
        System.out.print("Escolha um nível de dificuldade (1, 2, 3, ...): ");
        difficultyLevel = scanner.nextInt();
    }

    private static void chooseProblemType() {
        System.out.print("Escolha um tipo de problema (1: Adição, 2: Subtração, 3: Multiplicação, 4: Divisão, 5: Aleatório): ");
        problemType = scanner.nextInt();
    }

    private static void askQuestion() {
        int number1 = generateRandomNumber();
        int number2 = generateRandomNumber();
        int correctAnswer = 0;
        char operator = ' ';

        if (problemType == 5) {
            problemType = random.nextInt(4) + 1;
        }

        switch (problemType) {
            case 1: // Adição
                correctAnswer = number1 + number2;
                operator = '+';
                break;
            case 2: // Subtração
                correctAnswer = number1 - number2;
                operator = '-';
                break;
            case 3: // Multiplicação
                correctAnswer = number1 * number2;
                operator = '*';
                break;
            case 4: // Divisão
                // Ensure no division by zero and integer division
                while (number2 == 0) {
                    number2 = generateRandomNumber();
                }
                correctAnswer = number1 / number2;
                operator = '/';
                break;
        }

        System.out.printf("Quanto é %d %c %d? ", number1, operator, number2);
        int userAnswer = scanner.nextInt();

        while (userAnswer != correctAnswer) {
            printIncorrectResponse();
            incorrectAnswers++;
            userAnswer = scanner.nextInt();
        }

        printCorrectResponse();
        correctAnswers++;
    }

    private static int generateRandomNumber() {
        int maxNumber = (int) Math.pow(10, difficultyLevel);
        return random.nextInt(maxNumber);
    }

    private static void printCorrectResponse() {
        int response = random.nextInt(4) + 1;
        switch (response) {
            case 1:
                System.out.println("Muito bom!");
                break;
            case 2:
                System.out.println("Excelente!");
                break;
            case 3:
                System.out.println("Bom trabalho!");
                break;
            case 4:
                System.out.println("Mantenha um bom trabalho!");
                break;
        }
    }

    private static void printIncorrectResponse() {
        int response = random.nextInt(4) + 1;
        switch (response) {
            case 1:
                System.out.println("Não. Por favor, tente de novo.");
                break;
            case 2:
                System.out.println("Errado. Tente mais uma vez.");
                break;
            case 3:
                System.out.println("Não desista!");
                break;
            case 4:
                System.out.println("Não. Continue tentando.");
                break;
        }
    }

    private static void evaluatePerformance() {
        int totalAnswers = correctAnswers + incorrectAnswers;
        double percentageCorrect = (double) correctAnswers / totalAnswers * 100;

        System.out.printf("Você acertou %d de %d perguntas. (%.2f%%)\n", correctAnswers, totalAnswers, percentageCorrect);

        if (percentageCorrect >= 75) {
            System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
        } else {
            System.out.println("Peça ajuda extra ao seu professor.");
        }
    }

    private static void resetCounters() {
        correctAnswers = 0;
        incorrectAnswers = 0;
    }
}