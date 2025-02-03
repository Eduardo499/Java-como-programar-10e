package ex21;

public class TurtleGraphics {
    private static final int SIZE = 20;
    private static final int[][] floor = new int[SIZE][SIZE];
    private static int x = 0, y = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0 - Direita, 1 - Baixo, 2 - Esquerda, 3 - Cima

    public static void main(String[] args) {
        int[] commands = {2, 5, 5, 3, 5, 5, 1, 5, 5, 6, 9};
        processCommands(commands);
        printFloor();
    }

    private static void processCommands(int[] commands) {
        for (int command : commands) {
            switch (command) {
                case 1 -> penDown = false;
                case 2 -> penDown = true;
                case 3 -> direction = (direction + 1) % 4;
                case 4 -> direction = (direction + 3) % 4;
                case 5 -> {
                    if (x + 1 < commands.length) {
                        moveTurtle(commands[++x]);
                    } else {
                        System.out.println("Erro: Comando '5' sem argumento válido.");
                    }
                }                
                case 6 -> printFloor();
                case 9 -> {
                    System.out.println("Encerrando programa.");
                    return;
                }
            }
        }
    }

    private static void moveTurtle(int steps) {
        for (int i = 0; i < steps; i++) {
            switch (direction) {
                case 0 -> y = Math.min(y + 1, SIZE - 1);
                case 1 -> x = Math.min(x + 1, SIZE - 1);
                case 2 -> y = Math.max(y - 1, 0);
                case 3 -> x = Math.max(x - 1, 0);
            }
            if (penDown) {
                floor[x][y] = 1;
            }
        }
    }

    private static void printFloor() {
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
