package ex24;

import java.util.Arrays;

public class EightQueens {
    private static final int SIZE = 8;
    private static final int[][] board = new int[SIZE][SIZE];
    
    public static void main(String[] args) {
        for (int[] row : board) Arrays.fill(row, 0);
        if (solve(0)) {
            printBoard();
        } else {
            System.out.println("Nenhuma solução encontrada.");
        }
    }
    
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
