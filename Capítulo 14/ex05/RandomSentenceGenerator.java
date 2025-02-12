package ex05;

import java.util.Random;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        // Arrays de palavras
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        // Geração e exibição de 20 frases
        for (int i = 0; i < 20; i++) {
            System.out.println(generateSentence(article, noun, verb, preposition));
        }
    }

    // Função para gerar uma frase aleatória
    public static String generateSentence(String[] article, String[] noun, String[] verb, String[] preposition) {
        Random rand = new Random();

        // Seleciona uma palavra aleatória de cada array
        String selectedArticle = article[rand.nextInt(article.length)];
        String selectedNoun = noun[rand.nextInt(noun.length)];
        String selectedVerb = verb[rand.nextInt(verb.length)];
        String selectedPreposition = preposition[rand.nextInt(preposition.length)];
        String secondArticle = article[rand.nextInt(article.length)];
        String secondNoun = noun[rand.nextInt(noun.length)];

        // Constrói a frase
        String sentence = selectedArticle.substring(0, 1).toUpperCase() + selectedArticle.substring(1) + " "
                + selectedNoun + " " + selectedVerb + " " + selectedPreposition + " " + secondArticle + " " + secondNoun + ".";

        return sentence;
    }
}
