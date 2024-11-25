import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel inputLabel = new JLabel("Enter Value:");
        JTextField inputField = new JTextField(10);

        String[] options = {"Meters to Kilometers", "Kilograms to Pounds", "Celsius to Fahrenheit"};
        JComboBox<String> conversionOptions = new JComboBox<>(options);

        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Result: ");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(conversionOptions);
        panel.add(convertButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);

        // Action Listener for Convert Button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(inputField.getText());
                    String selectedOption = (String) conversionOptions.getSelectedItem();
                    double result = 0;

                    if (selectedOption.equals("Meters to Kilometers")) {
                        result = inputValue / 1000;
                    } else if (selectedOption.equals("Kilograms to Pounds")) {
                        result = inputValue * 2.20462;
                    } else if (selectedOption.equals("Celsius to Fahrenheit")) {
                        result = (inputValue * 9 / 5) + 32;
                    }

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
