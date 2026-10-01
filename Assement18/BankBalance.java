package Assement18;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankBalance extends JFrame implements ActionListener {

    JTextField initialBalance, transactionAmount, balance;
    JButton deposit, withdraw;

    BankBalance() {

        setTitle("Bank Balance Calculator");
        setSize(450, 300);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initial Balance
        add(new JLabel("Initial Balance:"));
        initialBalance = new JTextField();
        add(initialBalance);

        // Transaction Amount
        add(new JLabel("Transaction Amount:"));
        transactionAmount = new JTextField();
        add(transactionAmount);

        // Updated Balance
        add(new JLabel("Updated Balance:"));
        balance = new JTextField();
        balance.setEditable(false);
        add(balance);

        // Buttons
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        add(deposit);
        add(withdraw);

        // Button actions
        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double initial = Double.parseDouble(initialBalance.getText());
        double transaction = Double.parseDouble(transactionAmount.getText());

        if (e.getSource() == deposit) {

            double updatedBalance = initial + transaction;
            balance.setText(String.valueOf(updatedBalance));
        }

        if (e.getSource() == withdraw) {

            double updatedBalance = initial - transaction;
            balance.setText(String.valueOf(updatedBalance));
        }
    }

    public static void main(String[] args) {
        new BankBalance();
    }
}