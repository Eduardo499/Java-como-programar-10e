package ex07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PigLatinTranslator {

    public static void main(String[] args) {
        // Criar a janela principal
        JFrame frame = new JFrame("Pig Latin Translator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Criar um painel para a entrada de texto
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Caixa de texto para a frase em inglês
        JTextField inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(300, 30));
        panel.add(new JLabel("Enter English sentence:"));
        panel.add(inputField);

        // Área de texto para exibir a frase convertida
        JTextArea outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        panel.add(new JLabel("Pig Latin Translation:"));
        panel.add(scrollPane);

        // Botão para converter a frase
        JButton translateButton = new JButton("Translate");
        panel.add(translateButton);

        // Adicionar o painel à janela principal
        frame.add(panel, BorderLayout.CENTER);

        // Ação do botão para traduzir a frase
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                String translatedText = translateToPigLatin(inputText);
                outputArea.setText(translatedText);
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }

    // Função para traduzir uma frase para Pig Latin
    public static String translateToPigLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            translatedSentence.append(printLatinWord(word)).append(" ");
        }

        return translatedSentence.toString().trim();
    }

    // Função para traduzir uma palavra para Pig Latin
    public static String printLatinWord(String word) {
        // Coloca a primeira letra no final e adiciona "ay"
        String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";
        return pigLatinWord;
    }
}
