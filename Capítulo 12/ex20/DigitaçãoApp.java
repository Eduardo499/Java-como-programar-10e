package ex20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DigitaçãoApp {
    private JFrame frame;
    private JTextArea textArea;
    private String targetText = "Um pequeno jabuti xereta viu dez cegonhas felizes"; // Pangrama
    private int correctCount = 0;
    private int incorrectCount = 0;

    public DigitaçãoApp() {
        frame = new JFrame("Professor de Digitação");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Área de texto para mostrar o que o usuário digita
        textArea = new JTextArea(5, 40);
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.NORTH);

        // Painel para o teclado virtual
        JPanel keyboardPanel = new JPanel(new GridLayout(3, 10));
        String[] keys = "QWERTYUIOPASDFGHJKLÇZXCVBNM".split("");
        
        for (String key : keys) {
            JButton button = new JButton(key);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    handleKeyPress(key);
                }
            });
            keyboardPanel.add(button);
        }
        frame.add(keyboardPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private void handleKeyPress(String key) {
        char expectedChar = targetText.charAt(textArea.getText().length());
        textArea.append(key);
        
        if (key.charAt(0) == expectedChar) {
            correctCount++;
        } else {
            incorrectCount++;
        }

        // Atualiza a precisão
        System.out.println("Correto: " + correctCount + " | Errado: " + incorrectCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DigitaçãoApp());
    }
}
