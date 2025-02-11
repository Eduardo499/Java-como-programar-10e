package ex11;

import javax.swing.*;

public class PrinterGUI {
    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("Printer");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Rótulo "Printer: MyPrinter"
        JLabel labelPrinter = new JLabel("Printer: MyPrinter");
        labelPrinter.setBounds(10, 10, 120, 20);
        frame.add(labelPrinter);

        // Checkboxes para tipos de impressão
        JCheckBox chkImage = new JCheckBox("Image");
        JCheckBox chkText = new JCheckBox("Text");
        JCheckBox chkCode = new JCheckBox("Code");

        chkImage.setBounds(20, 40, 80, 20);
        chkText.setBounds(20, 60, 80, 20);
        chkCode.setBounds(20, 80, 80, 20);

        frame.add(chkImage);
        frame.add(chkText);
        frame.add(chkCode);

        // Radio buttons para seleção
        JRadioButton rbSelection = new JRadioButton("Selection");
        JRadioButton rbAll = new JRadioButton("All", true);
        JRadioButton rbApplet = new JRadioButton("Applet");

        ButtonGroup group = new ButtonGroup();
        group.add(rbSelection);
        group.add(rbAll);
        group.add(rbApplet);

        rbSelection.setBounds(120, 40, 100, 20);
        rbAll.setBounds(120, 60, 100, 20);
        rbApplet.setBounds(120, 80, 100, 20);

        frame.add(rbSelection);
        frame.add(rbAll);
        frame.add(rbApplet);

        // ComboBox para qualidade de impressão
        JLabel labelQuality = new JLabel("Print Quality:");
        labelQuality.setBounds(10, 110, 80, 20);
        frame.add(labelQuality);

        String[] qualities = {"High", "Medium", "Low"};
        JComboBox<String> comboQuality = new JComboBox<>(qualities);
        comboQuality.setBounds(90, 110, 80, 20);
        frame.add(comboQuality);

        // Checkbox "Print to File"
        JCheckBox chkPrintToFile = new JCheckBox("Print to File");
        chkPrintToFile.setBounds(180, 110, 100, 20);
        frame.add(chkPrintToFile);

        // Botões
        JButton btnOK = new JButton("OK");
        JButton btnCancel = new JButton("Cancel");
        JButton btnSetup = new JButton("Setup...");
        JButton btnHelp = new JButton("Help");

        btnOK.setBounds(250, 20, 80, 20);
        btnCancel.setBounds(250, 45, 80, 20);
        btnSetup.setBounds(250, 70, 80, 20);
        btnHelp.setBounds(250, 95, 80, 20);

        frame.add(btnOK);
        frame.add(btnCancel);
        frame.add(btnSetup);
        frame.add(btnHelp);

        // Exibir a janela
        frame.setVisible(true);
    }
}
