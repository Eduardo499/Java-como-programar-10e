package ex40;

import java.util.Scanner;

public class Enquete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os cinco tópicos
        String[] topics = {
            "Mudanças Climáticas",
            "Educação de Qualidade",
            "Direitos Humanos",
            "Pobreza e Desigualdade",
            "Saúde Pública"
        };

        // Array bidimensional para armazenar as respostas dos usuários
        int[][] responses = new int[5][10]; // 5 tópicos, 10 respostas

        // Coletando as respostas dos usuários
        for (int i = 0; i < 5; i++) {
            System.out.printf("Avalie o seguinte tema de 1 (menos importante) a 10 (mais importante): %s%n", topics[i]);
            for (int j = 0; j < 10; j++) {
                System.out.printf("Digite a avaliação do participante %d para %s: ", j + 1, topics[i]);
                int rating = scanner.nextInt();
                // Certificando-se de que a avaliação esteja entre 1 e 10
                while (rating < 1 || rating > 10) {
                    System.out.println("Por favor, insira uma nota válida entre 1 e 10.");
                    rating = scanner.nextInt();
                }
                responses[i][j] = rating;
            }
        }

        // Exibindo o resumo das respostas
        System.out.println("\nResumo dos Resultados:");

        // Exibindo o cabeçalho da tabela
        System.out.print("Tópico                  ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d  ", i);
        }
        System.out.println("Média");

        // Exibindo as respostas e as médias
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-22s", topics[i]);
            int totalPoints = 0;
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d  ", responses[i][j]);
                totalPoints += responses[i][j];
            }
            double average = (double) totalPoints / 10;
            System.out.printf(" %.2f%n", average);
        }

        // Encontrando o tópico com o maior total de pontos
        int maxPoints = -1;
        String maxTopic = "";
        for (int i = 0; i < 5; i++) {
            int totalPoints = 0;
            for (int j = 0; j < 10; j++) {
                totalPoints += responses[i][j];
            }
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                maxTopic = topics[i];
            }
        }
        System.out.printf("\nO tópico com o maior número de pontos é: %s com %d pontos.%n", maxTopic, maxPoints);

        // Encontrando o tópico com o menor total de pontos
        int minPoints = Integer.MAX_VALUE;
        String minTopic = "";
        for (int i = 0; i < 5; i++) {
            int totalPoints = 0;
            for (int j = 0; j < 10; j++) {
                totalPoints += responses[i][j];
            }
            if (totalPoints < minPoints) {
                minPoints = totalPoints;
                minTopic = topics[i];
            }
        }
        System.out.printf("O tópico com o menor número de pontos é: %s com %d pontos.%n", minTopic, minPoints);

        scanner.close();
    }
}