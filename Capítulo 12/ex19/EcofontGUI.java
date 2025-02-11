package ex19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class EcofontGUI extends JFrame {
    private JTextField textField;
    private JLabel displayLabel;
    private JButton increaseButton, decreaseButton;
    private int fontSize = 9; // Tamanho inicial da fonte

    private static final String FONT_PATH = "spranq_eco_sans_regular.ttf"; // Caminho do arquivo da fonte

    public EcofontGUI() {
        super("Ecofont Viewer");

        setLayout(new BorderLayout());

        // Campo de entrada de texto
        textField = new JTextField("Digite seu texto aqui...");
        add(textField, BorderLayout.NORTH);

        // Rótulo para exibir o texto com a fonte
        displayLabel = new JLabel("Ecofont Texto", SwingConstants.CENTER);
        displayLabel.setFont(loadEcofont(fontSize));
        add(displayLabel, BorderLayout.CENTER);

        // Painel de botões
        JPanel buttonPanel = new JPanel();
        increaseButton = new JButton("Increase Font Size");
        decreaseButton = new JButton("Decrease Font Size");

        buttonPanel.add(decreaseButton);
        buttonPanel.add(increaseButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Listeners para os botões
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontSize++;
                displayLabel.setFont(loadEcofont(fontSize));
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fontSize > 1) {
                    fontSize--;
                    displayLabel.setFont(loadEcofont(fontSize));
                }
            }
        });

        // Listener para atualizar o texto conforme o usuário digita
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(textField.getText());
            }
        });

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private Font loadEcofont(int size) {
        try {
            File fontFile = new File(FONT_PATH);
            Font ecofont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont((float) size);
            return ecofont;
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return new Font("Verdana", Font.PLAIN, size); // Usa Verdana se a Ecofont não estiver disponível
        }
    }

    public static void main(String[] args) {
        new EcofontGUI();
    }
}
