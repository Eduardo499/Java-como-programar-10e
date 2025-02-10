package ex08;

import javax.swing.*;

public class AlignWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Align");
        frame.setSize(420, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox snapToGrid = new JCheckBox("Snap to Grid");
        snapToGrid.setBounds(10, 10, 120, 20);
        frame.add(snapToGrid);

        JCheckBox showGrid = new JCheckBox("Show Grid");
        showGrid.setBounds(10, 35, 120, 20);
        frame.add(showGrid);

        JLabel xLabel = new JLabel("X:");
        xLabel.setBounds(130, 10, 20, 20);
        frame.add(xLabel);

        JTextField xField = new JTextField(null, 5);
        xField.setBounds(150, 10, 50, 20);
        frame.add(xField);

        JLabel yLabel = new JLabel("Y:");
        yLabel.setBounds(130, 35, 20, 20);
        frame.add(yLabel);
        
        JTextField yField = new JTextField(null, 5);
        yField.setBounds(150, 35, 50, 20);
        frame.add(yField);

        JButton okButton = new JButton("Ok");
        okButton.setBounds(160, 65, 70, 25);
        frame.add(okButton);
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(160, 95, 70, 25);
        frame.add(cancelButton);
        
        JButton helpButton = new JButton("Help");
        helpButton.setBounds(85, 95, 70, 25);
        frame.add(helpButton);

        frame.setVisible(true);
    }
}