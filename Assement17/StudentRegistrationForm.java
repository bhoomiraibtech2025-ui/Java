package Assement17;

import javax.swing.*;

public class StudentRegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");

        JLabel name = new JLabel("Name:");
        name.setBounds(30, 30, 80, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 30, 200, 30);

        JLabel roll = new JLabel("Roll No:");
        roll.setBounds(30, 80, 80, 30);

        JTextField rollField = new JTextField();
        rollField.setBounds(120, 80, 200, 30);

        JLabel course = new JLabel("Course:");
        course.setBounds(30, 130, 80, 30);

        JTextField courseField = new JTextField();
        courseField.setBounds(120, 130, 200, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 190, 100, 35);

        frame.add(name);
        frame.add(nameField);

        frame.add(roll);
        frame.add(rollField);

        frame.add(course);
        frame.add(courseField);

        frame.add(submit);

        submit.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                frame,
                "Student Registration Successful!"
            );
        });

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}