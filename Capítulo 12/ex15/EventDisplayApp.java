package ex15;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class EventDisplayApp extends JFrame implements ActionListener, ItemListener, ListSelectionListener, MouseListener, MouseMotionListener, KeyListener {
    private JTextArea eventLog;
    private JButton button;
    private JComboBox<String> comboBox;
    private JList<String> list;
    private JTextField textField;

    public EventDisplayApp() {
        super("Event Display");
        setLayout(new FlowLayout());

        // Área de texto para exibir eventos
        eventLog = new JTextArea(10, 40);
        eventLog.setEditable(false);
        add(new JScrollPane(eventLog));

        // Botão que dispara eventos ActionListener
        button = new JButton("Click Me");
        button.addActionListener(this);
        add(button);

        // ComboBox com ItemListener
        String[] options = {"Option 1", "Option 2", "Option 3"};
        comboBox = new JComboBox<>(options);
        comboBox.addItemListener(this);
        add(comboBox);

        // Lista com ListSelectionListener
        String[] listItems = {"Item A", "Item B", "Item C"};
        list = new JList<>(listItems);
        list.addListSelectionListener(this);
        add(new JScrollPane(list));

        // Campo de texto com KeyListener
        textField = new JTextField(20);
        textField.addKeyListener(this);
        add(textField);

        // Adicionando MouseListener e MouseMotionListener à janela
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Método auxiliar para registrar eventos no JTextArea
    private void logEvent(String event) {
        eventLog.append(event + "\n");
    }

    // ActionListener (botão pressionado)
    @Override
    public void actionPerformed(ActionEvent e) {
        logEvent("Action Event: " + e.toString());
    }

    // ItemListener (seleção no JComboBox)
    @Override
    public void itemStateChanged(ItemEvent e) {
        logEvent("Item Event: " + e.toString());
    }

    // ListSelectionListener (seleção na JList)
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            logEvent("List Selection Event: " + e.toString());
        }
    }

    // MouseListener (eventos do mouse)
    @Override
    public void mouseClicked(MouseEvent e) {
        logEvent("Mouse Clicked: " + e.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        logEvent("Mouse Pressed: " + e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        logEvent("Mouse Released: " + e.toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        logEvent("Mouse Entered: " + e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        logEvent("Mouse Exited: " + e.toString());
    }

    // MouseMotionListener (movimentos do mouse)
    @Override
    public void mouseDragged(MouseEvent e) {
        logEvent("Mouse Dragged: " + e.toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        logEvent("Mouse Moved: " + e.toString());
    }

    // KeyListener (teclas pressionadas no JTextField)
    @Override
    public void keyTyped(KeyEvent e) {
        logEvent("Key Typed: " + e.toString());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        logEvent("Key Pressed: " + e.toString());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        logEvent("Key Released: " + e.toString());
    }

    public static void main(String[] args) {
        new EventDisplayApp();
    }
}
