package ex10;

import javax.swing.*;

public class ColorSelect {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ColorSelect");
        frame.setSize(400, 108);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String colors[] = {"RED", "GREEN", "BLUE"};
        JComboBox<String> comboBox = new JComboBox<>(colors);
        comboBox.setBounds(0, 0, 400, 20);
        frame.add(comboBox);

        JCheckBox background = new JCheckBox("Background");
        background.setBounds(60, 22, 140, 30);
        frame.add(background);

        JCheckBox foreground = new JCheckBox("Foreground");
        foreground.setBounds(200, 22, 150, 30);
        frame.add(foreground);

        JButton ok = new JButton("Ok");
        ok.setBounds(100, 54, 60, 20);
        frame.add(ok);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(162, 54, 90, 20);
        frame.add(cancel);

        frame.setVisible(true);
    }
}
