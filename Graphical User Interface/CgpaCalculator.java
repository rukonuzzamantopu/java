import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CgpaCalculator {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("CGPA Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(7, 2));

        // Create input fields for subjects and credits
        JLabel subject1Label = new JLabel("Grade for Subject 1:");
        JTextField subject1Field = new JTextField();

        JLabel subject2Label = new JLabel("Grade for Subject 2:");
        JTextField subject2Field = new JTextField();

        JLabel subject3Label = new JLabel("Grade for Subject 3:");
        JTextField subject3Field = new JTextField();

        JLabel credit1Label = new JLabel("Credit for Subject 1:");
        JTextField credit1Field = new JTextField();

        JLabel credit2Label = new JLabel("Credit for Subject 2:");
        JTextField credit2Field = new JTextField();

        JLabel credit3Label = new JLabel("Credit for Subject 3:");
        JTextField credit3Field = new JTextField();

        // Create a button to calculate CGPA
        JButton calculateButton = new JButton("Calculate CGPA");
        JLabel resultLabel = new JLabel("CGPA: ");

        // Add components to the frame
        frame.add(subject1Label);
        frame.add(subject1Field);

        frame.add(credit1Label);
        frame.add(credit1Field);

        frame.add(subject2Label);
        frame.add(subject2Field);

        frame.add(credit2Label);
        frame.add(credit2Field);

        frame.add(subject3Label);
        frame.add(subject3Field);

        frame.add(credit3Label);
        frame.add(credit3Field);

        frame.add(calculateButton);
        frame.add(resultLabel);

        // Add functionality to the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse grades and credits from input fields
                    double grade1 = Double.parseDouble(subject1Field.getText());
                    double grade2 = Double.parseDouble(subject2Field.getText());
                    double grade3 = Double.parseDouble(subject3Field.getText());

                    double credit1 = Double.parseDouble(credit1Field.getText());
                    double credit2 = Double.parseDouble(credit2Field.getText());
                    double credit3 = Double.parseDouble(credit3Field.getText());

                    // Calculate CGPA
                    double totalCredits = credit1 + credit2 + credit3;
                    double weightedGrades = (grade1 * credit1) + (grade2 * credit2) + (grade3 * credit3);
                    double cgpa = weightedGrades / totalCredits;

                    // Display the result
                    resultLabel.setText("CGPA: " + String.format("%.2f", cgpa));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers for grades and credits.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
