import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int SIMULACOES = 1_000_000;

    private enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int[] jogosGanho = new int[21]; 
        int[] jogosPerdido = new int[21]; 
        int totalVitorias = 0;
        int totalDuracao = 0;

        for (int i = 0; i < SIMULACOES; i++) {
            int myPoint = 0;
            Status gameStatus;
            int rolagem = 1; 
            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    if (rolagem <= 20) jogosGanho[rolagem - 1]++;
                    totalVitorias++;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    if (rolagem <= 20) jogosPerdido[rolagem - 1]++;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                rolagem++;
                sumOfDice = rollDice();

                if (rolagem <= 20) {
                    if (sumOfDice == myPoint) {
                        gameStatus = Status.WON;
                        jogosGanho[rolagem - 1]++;
                        totalVitorias++;
                    } else if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                        jogosPerdido[rolagem - 1]++;
                    }
                } else { 
                    if (sumOfDice == myPoint) {
                        gameStatus = Status.WON;
                        jogosGanho[20]++; 
                        totalVitorias++;
                    } else if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                        jogosPerdido[20]++; 
                    }
                }
            }

            totalDuracao += rolagem; 
        }

        System.out.println("a) Jogos ganhos nas primeiras 20 rolagens:");
        for (int i = 0; i < 20; i++) {
            System.out.printf("Rolagem %d: %d vitórias%n", i + 1, jogosGanho[i]);
        }
        System.out.printf("Rolagem após a 20ª: %d vitórias%n", jogosGanho[20]);

        System.out.println("\nb) Jogos perdidos nas primeiras 20 rolagens:");
        for (int i = 0; i < 20; i++) {
            System.out.printf("Rolagem %d: %d perdas%n", i + 1, jogosPerdido[i]);
        }
        System.out.printf("Rolagem após a 20ª: %d perdas%n", jogosPerdido[20]);

        double chanceGanho = (double) totalVitorias / SIMULACOES * 100;
        System.out.printf("\nc) As chances de ganhar no jogo são: %.2f%%%n", chanceGanho);

        double duracaoMedia = (double) totalDuracao / SIMULACOES;
        System.out.printf("\nd) A duração média de um jogo é: %.2f rolagens%n", duracaoMedia);

        System.out.println("\ne) A chance de ganhar tende a ser maior nas primeiras rolagens.");
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        return sum;
    }
}