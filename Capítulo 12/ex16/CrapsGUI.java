package ex16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CrapsGUI extends JFrame {
    private final JTextField dice1Field, dice2Field, sumField, pointField;
    private final JButton rollButton;
    private final JLabel statusLabel;
    
    private final Random random = new Random();
    private int point = 0; // Ponto do jogador
    private boolean gameOver = false;

    public CrapsGUI() {
        super("Jogo de Craps");
        setLayout(new GridLayout(5, 2));

        // Rótulos e campos de texto
        add(new JLabel("Dado 1:"));
        dice1Field = new JTextField(5);
        dice1Field.setEditable(false);
        add(dice1Field);

        add(new JLabel("Dado 2:"));
        dice2Field = new JTextField(5);
        dice2Field.setEditable(false);
        add(dice2Field);

        add(new JLabel("Soma:"));
        sumField = new JTextField(5);
        sumField.setEditable(false);
        add(sumField);

        add(new JLabel("Ponto:"));
        pointField = new JTextField(5);
        pointField.setEditable(false);
        add(pointField);

        // Botão de lançamento
        rollButton = new JButton("Lançar Dados");
        rollButton.addActionListener(new RollButtonListener());
        add(rollButton);

        // Rótulo para status
        statusLabel = new JLabel("Clique para jogar!", SwingConstants.CENTER);
        add(statusLabel);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class RollButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (gameOver) { // Reinicia o jogo se já acabou
                point = 0;
                gameOver = false;
                statusLabel.setText("Clique para jogar!");
            }

            int dice1 = rollDie();
            int dice2 = rollDie();
            int sum = dice1 + dice2;

            // Atualiza os campos da GUI
            dice1Field.setText(String.valueOf(dice1));
            dice2Field.setText(String.valueOf(dice2));
            sumField.setText(String.valueOf(sum));

            if (point == 0) { // Primeiro lançamento
                if (sum == 7 || sum == 11) {
                    statusLabel.setText("Você ganhou!");
                    gameOver = true;
                } else if (sum == 2 || sum == 3 || sum == 12) {
                    statusLabel.setText("Craps! Você perdeu!");
                    gameOver = true;
                } else {
                    point = sum;
                    pointField.setText(String.valueOf(point));
                    statusLabel.setText("Seu ponto é " + point + ". Continue jogando.");
                }
            } else { // Após o primeiro lançamento
                if (sum == point) {
                    statusLabel.setText("Você ganhou!");
                    gameOver = true;
                } else if (sum == 7) {
                    statusLabel.setText("Você perdeu!");
                    gameOver = true;
                }
            }
        }

        private int rollDie() {
            return 1 + random.nextInt(6);
        }
    }

    public static void main(String[] args) {
        new CrapsGUI();
    }
}