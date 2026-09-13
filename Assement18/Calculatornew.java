import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculatornew extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton addButton, subtractButton;

    Calculatornew() {

        setTitle("Simple Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter First Number:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Enter Second Number:"));
        num2 = new JTextField();
        add(num2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        addButton = new JButton("Addition");
        subtractButton = new JButton("Subtraction");

        add(addButton);
        add(subtractButton);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());

        if (e.getSource() == addButton) {
            result.setText(String.valueOf(a + b));
        }

        if (e.getSource() == subtractButton) {
            result.setText(String.valueOf(a - b));
        }
    }

    public static void main(String[] args) {
        new Calculatornew();
    }
}