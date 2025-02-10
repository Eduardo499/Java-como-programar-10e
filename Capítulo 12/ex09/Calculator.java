package ex09;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(210, 268);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField xField = new JTextField(5);
        xField.setBounds(2, 0, 206, 30);
        frame.add(xField);

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(2, 32, 50, 50);
        frame.add(sevenButton);

        JButton eighButton = new JButton("8");
        eighButton.setBounds(54, 32, 50, 50);
        frame.add(eighButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(106, 32, 50, 50);
        frame.add(nineButton);

        JButton slashButton = new JButton("/");
        slashButton.setBounds(158, 32, 50, 50);
        frame.add(slashButton);

        JButton fourButton = new JButton("4");
        fourButton.setBounds(2, 84, 50, 50);
        frame.add(fourButton);

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(54, 84, 50, 50);
        frame.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(106, 84, 50, 50);
        frame.add(sixButton);

        JButton asteriskButton = new JButton("*");
        asteriskButton.setBounds(158, 84, 50, 50);
        frame.add(asteriskButton);

        JButton oneButton = new JButton("1");
        oneButton.setBounds(2, 134, 50, 50);
        frame.add(oneButton);

        JButton twoButton = new JButton("2");
        twoButton.setBounds(54, 134, 50, 50);
        frame.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBounds(106, 134, 50, 50);
        frame.add(threeButton);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(158, 134, 50, 50);
        frame.add(minusButton);

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(2, 184, 50, 50);
        frame.add(zeroButton);

        JButton dotButton = new JButton(".");
        dotButton.setBounds(54, 184, 50, 50);
        frame.add(dotButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(106, 184, 50, 50);
        frame.add(equalButton);

        JButton plusButton = new JButton("+");
        plusButton.setBounds(158, 184, 50, 50);
        frame.add(plusButton);

        frame.setVisible(true);
    }
}