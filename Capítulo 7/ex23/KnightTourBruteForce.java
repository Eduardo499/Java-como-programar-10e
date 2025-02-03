package ex23;

import java.util.Random;
import java.util.Arrays;

public class KnightTourBruteForce {
    private static final int SIZE = 8;
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final Random rand = new Random();

    public static void main(String[] args) {
        int[] tourLengths = new int[SIZE * SIZE + 1];
        int maxAttempts = 1000;
        int bestTour = 0;

        for (int i = 0; i < maxAttempts; i++) {
            int tourLength = randomKnightTour();
            tourLengths[tourLength]++;
            if (tourLength > bestTour) {
                bestTour = tourLength;
            }
        }

        printResults(tourLengths, bestTour);
    }

    private static int randomKnightTour() {
        int[][] board = new int[SIZE][SIZE];
        for (int[] row : board) Arrays.fill(row, 0);

        int x = rand.nextInt(SIZE);
        int y = rand.nextInt(SIZE);
        board[x][y] = 1;

        int moveCount = 1;
        while (true) {
            int[] validMoves = new int[8];
            int validMoveCount = 0;

            for (int i = 0; i < 8; i++) {
                int newX = x + horizontal[i];
                int newY = y + vertical[i];
                if (isValidMove(newX, newY, board)) {
                    validMoves[validMoveCount++] = i;
                }
            }

            if (validMoveCount == 0) {
                return moveCount;
            }

            int nextMove = validMoves[rand.nextInt(validMoveCount)];
            x += horizontal[nextMove];
            y += vertical[nextMove];
            board[x][y] = ++moveCount;
        }
    }

    private static boolean isValidMove(int x, int y, int[][] board) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[x][y] == 0;
    }

    private static void printResults(int[] tourLengths, int bestTour) {
        System.out.println("Comprimento do passeio | Quantidade");
        for (int i = 1; i <= bestTour; i++) {
            System.out.printf("%21d | %9d%n", i, tourLengths[i]);
        }
        System.out.println("Melhor passeio encontrado: " + bestTour);
    }
}