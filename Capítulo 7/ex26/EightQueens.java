package ex26;

import java.util.Arrays;
import java.util.Random;

public class EightQueens {
    private static final int SIZE = 8;
    private static final int[][] board = new int[SIZE][SIZE];
    private static final Random random = new Random();
    
    public static void main(String[] args) {
        System.out.println("Heurística:");
        resetBoard();
        if (solve(0)) {
            printBoard();
        } else {
            System.out.println("Nenhuma solução encontrada.");
        }
        
        System.out.println("\nForça Bruta Aleatória:");
        solveRandomly();
        printBoard();
        
        System.out.println("\nForça Bruta Exaustiva:");
        resetBoard();
        if (solveExhaustive(0)) {
            printBoard();
        } else {
            System.out.println("Nenhuma solução encontrada.");
        }
    }
    
    private static void resetBoard() {
        for (int[] row : board) Arrays.fill(row, 0);
    }
    
    // Heurística
    private static boolean solve(int col) {
        if (col >= SIZE) return true;
        
        int[] rowPriority = calculateHeuristic();
        for (int row : rowPriority) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solve(col + 1)) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }
    
    // Força Bruta Aleatória
    private static void solveRandomly() {
        resetBoard();
        int attempts = 0;
        while (true) {
            resetBoard();
            int placedQueens = 0;
            while (placedQueens < SIZE) {
                int row = random.nextInt(SIZE);
                int col = random.nextInt(SIZE);
                if (board[row][col] == 0 && isSafe(row, col)) {
                    board[row][col] = 1;
                    placedQueens++;
                }
            }
            if (checkSolution()) break;
            attempts++;
            if (attempts > 10000) { // Limite de tentativas para evitar loops infinitos
                System.out.println("Falha na busca aleatória.");
                return;
            }
        }
    }
    
    // Força Bruta Exaustiva
    private static boolean solveExhaustive(int col) {
        if (col >= SIZE) return true;
        
        for (int row = 0; row < SIZE; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solveExhaustive(col + 1)) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }
    
    private static boolean checkSolution() {
        int count = 0;
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 1) count++;
            }
        }
        return count == SIZE;
    }
    
    private static int[] calculateHeuristic() {
        int[] priority = new int[SIZE];
        int[] elimination = new int[SIZE];
        
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 1) {
                    elimination[row] += 1;
                    for (int i = 1; i < SIZE; i++) {
                        if (row + i < SIZE) elimination[row + i]++;
                        if (row - i >= 0) elimination[row - i]++;
                    }
                }
            }
        }
        
        for (int i = 0; i < SIZE; i++) priority[i] = i;
        Integer[] priorityObj = Arrays.stream(priority).boxed().toArray(Integer[]::new);
        Arrays.sort(priorityObj, (a, b) -> Integer.compare(elimination[a], elimination[b]));
        for (int i = 0; i < SIZE; i++) priority[i] = priorityObj[i];
        
        return priority;
    }
    
    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
            for (int j = 1; row - j >= 0 && i - j >= 0; j++) {
                if (board[row - j][i - j] == 1) return false;
            }
            for (int j = 1; row + j < SIZE && i - j >= 0; j++) {
                if (board[row + j][i - j] == 1) return false;
            }
        }
        return true;
    }
    
    private static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}