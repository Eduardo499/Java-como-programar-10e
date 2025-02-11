package ex13;

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
        JLabel lblCelsius = new JLabel("Celsius:");
        lblCelsius.setBounds(20, 20, 100, 25);
        frame.add(lblCelsius);

        // Campo de entrada de texto
        JTextField txtCelsius = new JTextField();
        txtCelsius.setBounds(120, 20, 100, 25);
        frame.add(txtCelsius);

        // Botão de conversão
        JButton btnConverter = new JButton("Converter");
        btnConverter.setBounds(80, 60, 120, 25);
        frame.add(btnConverter);

        // Rótulo para exibir o resultado
        JLabel lblKelvin = new JLabel("Kelvin: ");
        lblKelvin.setBounds(20, 100, 200, 25);
        frame.add(lblKelvin);

        // Adicionando ação ao botão
        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(txtCelsius.getText());
                    double kelvin = celsius + 273.15;
                    lblKelvin.setText("Kelvin: " + String.format("%.2f", kelvin));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Exibir a janela
        frame.setVisible(true);
    }
}
