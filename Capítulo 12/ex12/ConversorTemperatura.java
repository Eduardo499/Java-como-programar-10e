package ex12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Rótulo para entrada
        JLabel lblFahrenheit = new JLabel("Fahrenheit:");
        lblFahrenheit.setBounds(20, 20, 100, 25);
        frame.add(lblFahrenheit);

        // Campo de entrada de texto
        JTextField txtFahrenheit = new JTextField();
        txtFahrenheit.setBounds(120, 20, 100, 25);
        frame.add(txtFahrenheit);

        // Botão de conversão
        JButton btnConverter = new JButton("Converter");
        btnConverter.setBounds(80, 60, 120, 25);
        frame.add(btnConverter);

        // Rótulo para exibir o resultado
        JLabel lblCelsius = new JLabel("Celsius: ");
        lblCelsius.setBounds(20, 100, 200, 25);
        frame.add(lblCelsius);

        // Adicionando ação ao botão
        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
                    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
                    lblCelsius.setText("Celsius: " + String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Exibir a janela
        frame.setVisible(true);
    }
}
