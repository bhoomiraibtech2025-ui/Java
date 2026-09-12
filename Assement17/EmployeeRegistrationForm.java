package Assement17;

import javax.swing.*;

public class EmployeeRegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Employee Registration");

        JLabel id = new JLabel("Employee ID:");
        id.setBounds(30, 30, 100, 30);

        JTextField idField = new JTextField();
        idField.setBounds(140, 30, 180, 30);

        JLabel name = new JLabel("Name:");
        name.setBounds(30, 70, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(140, 70, 180, 30);

        JLabel dept = new JLabel("Department:");
        dept.setBounds(30, 110, 100, 30);

        JTextField deptField = new JTextField();
        deptField.setBounds(140, 110, 180, 30);

        JLabel salary = new JLabel("Salary:");
        salary.setBounds(30, 150, 100, 30);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(140, 150, 180, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(140, 200, 100, 35);

        frame.add(id);
        frame.add(idField);
        frame.add(name);
        frame.add(nameField);
        frame.add(dept);
        frame.add(deptField);
        frame.add(salary);
        frame.add(salaryField);
        frame.add(submit);

        submit.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                "Employee ID: " + idField.getText() +
                "\nName: " + nameField.getText() +
                "\nDepartment: " + deptField.getText() +
                "\nSalary: " + salaryField.getText());
        });

        frame.setSize(380, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}