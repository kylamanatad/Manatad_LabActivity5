package SimpleCalc;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI ch = new SimpleCalcGUI();
        ch.setContentPane(ch.panel1);
        ch.setSize(600, 300);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Simple Calculator");
    }
}