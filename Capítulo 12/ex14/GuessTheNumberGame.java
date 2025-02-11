package ex14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumberGame {
    private int targetNumber;
    private int lastGuessDifference = 1000;
    private JFrame frame;
    private JTextField guessField;
    private JLabel messageLabel;
    private JButton playAgainButton;

    public GuessTheNumberGame() {
        // Criando a janela principal
        frame = new JFrame("Guess the Number");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Rótulo inicial
        JLabel instructionLabel = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        frame.add(instructionLabel);

        // Campo de entrada
        guessField = new JTextField(10);
        frame.add(guessField);

        // Rótulo para exibir mensagens ("Too High", "Too Low", "Correct!")
        messageLabel = new JLabel("");
        frame.add(messageLabel);

        // Botão de reiniciar
        playAgainButton = new JButton("Play Again");
        playAgainButton.setEnabled(false); // Inicialmente desativado
        frame.add(playAgainButton);

        // Gerar o número aleatório
        generateNewNumber();

        // Adicionar evento de entrada
        guessField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        // Adicionar evento ao botão "Play Again"
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateNewNumber();
            }
        });

        frame.setVisible(true);
    }

    // Método para gerar um novo número aleatório
    private void generateNewNumber() {
        Random rand = new Random();
        targetNumber = rand.nextInt(1000) + 1; // Número entre 1 e 1000
        lastGuessDifference = 1000; // Resetar diferença
        guessField.setEditable(true);
        guessField.setBackground(Color.WHITE);
        guessField.setText("");
        messageLabel.setText("");
        playAgainButton.setEnabled(false);
    }

    // Método para verificar o palpite
    private void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            int difference = Math.abs(targetNumber - guess);

            // Atualizar a cor de fundo
            if (difference < lastGuessDifference) {
                guessField.setBackground(Color.RED); // Está mais perto
            } else {
                guessField.setBackground(Color.BLUE); // Está mais longe
            }
            lastGuessDifference = difference;

            // Exibir dicas
            if (guess > targetNumber) {
                messageLabel.setText("Too High!");
            } else if (guess < targetNumber) {
                messageLabel.setText("Too Low!");
            } else {
                messageLabel.setText("Correct!");
                guessField.setEditable(false); // Desativar entrada
                playAgainButton.setEnabled(true); // Ativar botão de reiniciar
            }
        } catch (NumberFormatException ex) {
            messageLabel.setText("Enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new GuessTheNumberGame();
    }
}
