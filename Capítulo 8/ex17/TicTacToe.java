package ex17;

import java.util.Scanner;

public class TicTacToe {
    
    // Definindo o tipo enum para as células do tabuleiro
    public enum Cell {
        EMPTY, X, O
    }

    private Cell[][] board;
    private int movesCount;

    public TicTacToe() {
        // Inicializa o tabuleiro com células EMPTY
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
        movesCount = 0;
    }

    // Exibe o tabuleiro
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verifica se houve vencedor
    public boolean checkWin() {
        // Verificando linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != Cell.EMPTY)
                return true;
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != Cell.EMPTY)
                return true;
        }
        // Verificando diagonais
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != Cell.EMPTY)
            return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != Cell.EMPTY)
            return true;

        return false;
    }

    // Verifica se o tabuleiro está cheio (empate)
    public boolean checkDraw() {
        return movesCount == 9;
    }

    // Realiza a jogada
    public boolean makeMove(int row, int col, Cell player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == Cell.EMPTY) {
            board[row][col] = player;
            movesCount++;
            return true;
        }
        return false;
    }

    // Método principal para rodar o jogo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        
        // Determina o jogador 1 e 2
        System.out.println("Escolha o jogador (X ou O):");
        String playerChoice = scanner.nextLine().toUpperCase();
        Cell player1 = playerChoice.equals("X") ? Cell.X : Cell.O;
        Cell player2 = player1 == Cell.X ? Cell.O : Cell.X;

        Cell currentPlayer = player1;
        
        while (true) {
            game.displayBoard();
            System.out.println("Jogador " + (currentPlayer == Cell.X ? "X" : "O") + ", faça sua jogada!");
            System.out.print("Digite a linha (0, 1, 2): ");
            int row = scanner.nextInt();
            System.out.print("Digite a coluna (0, 1, 2): ");
            int col = scanner.nextInt();
            
            // Verifica se a jogada é válida
            if (game.makeMove(row, col, currentPlayer)) {
                if (game.checkWin()) {
                    game.displayBoard();
                    System.out.println("Jogador " + (currentPlayer == Cell.X ? "X" : "O") + " venceu!");
                    break;
                }
                if (game.checkDraw()) {
                    game.displayBoard();
                    System.out.println("Empate!");
                    break;
                }
                
                // Alterna o jogador
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
