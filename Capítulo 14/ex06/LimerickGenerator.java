package ex06;

import java.util.Random;

public class LimerickGenerator {

    public static void main(String[] args) {
        // Arrays de palavras para rimas
        String[] rhymeA = {"cat", "dog", "hat", "bat", "rat", "frog"};
        String[] rhymeB = {"green", "queen", "scene", "machine", "marine"};
        String[] places = {"town", "hill", "river", "beach", "street"};
        String[] actions = {"ran", "jumped", "skipped", "danced", "sang"};

        // Gerar e exibir 5 limericks
        for (int i = 0; i < 5; i++) {
            System.out.println(generateLimerick(rhymeA, rhymeB, places, actions));
            System.out.println(); // Linha em branco entre os limericks
        }
    }

    // Função para gerar um limerick aleatório
    public static String generateLimerick(String[] rhymeA, String[] rhymeB, String[] places, String[] actions) {
        // Seleciona palavras aleatórias
        String line1 = "There once was a " + randomElement(rhymeA) + " from a " + randomElement(places);
        String line2 = "Who " + randomElement(actions) + " with a " + randomElement(rhymeA);
        String line3 = "It went " + randomElement(actions) + " around the " + randomElement(places);
        String line4 = "And then it saw a " + randomElement(rhymeB);
        String line5 = "And said, 'I think I'll go back to my " + randomElement(rhymeA) + "'.";

        // Concatena as linhas do limerick
        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5;
    }

    // Função para escolher um elemento aleatório de um array
    public static String randomElement(String[] array) {
        Random rand = new Random();
        return array[rand.nextInt(array.length)];
    }
}
