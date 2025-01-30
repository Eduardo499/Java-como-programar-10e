package ex37;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    private static int correctAnswers = 0;
    private static int incorrectAnswers = 0;

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 10; i++) {
                askQuestion();
            }
            evaluatePerformance();
            resetCounters();
        }
    }

    private static void askQuestion() {
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int correctAnswer = number1 * number2;

        System.out.printf("Quanto é %d vezes %d? ", number1, number2);
        int userAnswer = scanner.nextInt();

        while (userAnswer != correctAnswer) {
            printIncorrectResponse();
            incorrectAnswers++;
            userAnswer = scanner.nextInt();
        }

        printCorrectResponse();
        correctAnswers++;
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