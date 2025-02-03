package ex28;

import java.util.Random;

public class CorridaTartarugaELebre {

    public static void main(String[] args) {
        int tartarugaPosicao = 1; // Posição inicial da tartaruga
        int lebrePosicao = 1; // Posição inicial da lebre
        Random random = new Random(); // Objeto para gerar números aleatórios

        // Loop da corrida, onde o relógio "emite tique-taques" até alguém ganhar
        while (tartarugaPosicao < 70 && lebrePosicao < 70) {
            // Movimento da tartaruga
            int movimentoTartaruga = random.nextInt(100) + 1; // Gera um número entre 1 e 100
            if (movimentoTartaruga <= 50) {
                tartarugaPosicao += 3; // Avança 3 quadrados
            } else if (movimentoTartaruga <= 80) {
                tartarugaPosicao += 1; // Avança 1 quadrado
            } else {
                tartarugaPosicao -= 6; // Retrocede 6 quadrados
            }

            // Se a tartaruga ultrapassar a posição 1 (por conta de retroceder demais), volta para a posição 1
            if (tartarugaPosicao < 1) {
                tartarugaPosicao = 1;
            }

            // Movimento da lebre
            int movimentoLebre = random.nextInt(100) + 1; // Gera um número entre 1 e 100
            if (movimentoLebre <= 20) {
                lebrePosicao += 9; // Avança 9 quadrados
            } else if (movimentoLebre <= 50) {
                lebrePosicao += 1; // Avança 1 quadrado
            } else if (movimentoLebre <= 90) {
                // Não se move
            } else {
                lebrePosicao -= 12; // Retrocede 12 quadrados
            }

            // Se a lebre ultrapassar a posição 1 (por conta de retroceder demais), volta para a posição 1
            if (lebrePosicao < 1) {
                lebrePosicao = 1;
            }

            // Exibindo o status da corrida após cada tique
            System.out.println("Tartaruga está no quadrado " + tartarugaPosicao);
            System.out.println("Lebre está no quadrado " + lebrePosicao);
            System.out.println();

            // Pausa para simular o "tic-tac" do relógio
            try {
                Thread.sleep(500); // 500 milissegundos de pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determina o vencedor
        if (tartarugaPosicao >= 70) {
            System.out.println("A tartaruga venceu!");
        } else {
            System.out.println("A lebre venceu!");
        }
    }
}