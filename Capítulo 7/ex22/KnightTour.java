package ex22;

import java.util.Arrays;

public class KnightTour {
    private static final int SIZE = 8;
    private static final int[][] board = new int[SIZE][SIZE];
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }

        int startX = 0, startY = 0;
        board[startX][startY] = 1;

        if (solveKnightTour(startX, startY, 2)) {
            printBoard();
        } else {
            System.out.println("Sem solução encontrada.");
        }
    }

    private static boolean solveKnightTour(int x, int y, int moveCount) {
        if (moveCount > SIZE * SIZE) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int newX = x + horizontal[i];
            int newY = y + vertical[i];

            if (isValidMove(newX, newY)) {
                board[newX][newY] = moveCount;
                if (solveKnightTour(newX, newY, moveCount + 1)) {
                    return true;
                }
                board[newX][newY] = 0; // Retrocede se não funcionar
            }
        }
        return false;
    }

    private static boolean isValidMove(int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[x][y] == 0;
    }

    private static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }
}