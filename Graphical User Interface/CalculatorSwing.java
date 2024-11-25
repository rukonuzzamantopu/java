import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);

        // Buttons
        JButton[] numberButtons = new JButton[10];
        JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
        JButton sinButton, cosButton, tanButton, logButton, factButton, sqrtButton, sqrButton;
        JButton delButton;

        // Number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        // Operation buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");
        delButton = new JButton("DEL");

        // Scientific buttons
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        logButton = new JButton("log");
        factButton = new JButton("x!");
        sqrtButton = new JButton("√");
        sqrButton = new JButton("x²");

        // Adding components to the frame
        JPanel panel = new JPanel();
        panel.setBounds(30, 100, 300, 300);
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        for (int i = 1; i < 10; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(addButton);
        panel.add(numberButtons[0]);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(eqButton);
        panel.add(clrButton);
        panel.add(delButton);
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(logButton);
        panel.add(factButton);
        panel.add(sqrtButton);
        panel.add(sqrButton);

        frame.add(textField);
        frame.add(panel);

        frame.setSize(400, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        // Functionality
        ActionListener listener = new ActionListener() {
            String operator = "";
            double num1, num2;

            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
                    textField.setText(textField.getText() + command);
                } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                    operator = command;
                    num1 = Double.parseDouble(textField.getText());
                    textField.setText("");
                } else if (command.equals("=")) {
                    num2 = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+" -> textField.setText(String.valueOf(num1 + num2));
                        case "-" -> textField.setText(String.valueOf(num1 - num2));
                        case "*" -> textField.setText(String.valueOf(num1 * num2));
                        case "/" -> textField.setText(String.valueOf(num1 / num2));
                    }
                } else if (command.equals("C")) {
                    textField.setText("");
                } else if (command.equals("DEL")) {
                    String text = textField.getText();
                    textField.setText(text.substring(0, text.length() - 1));
                } else if (command.equals("sin")) {
                    double result = Math.sin(Math.toRadians(Double.parseDouble(textField.getText())));
                    textField.setText(String.valueOf(result));
                } else if (command.equals("cos")) {
                    double result = Math.cos(Math.toRadians(Double.parseDouble(textField.getText())));
                    textField.setText(String.valueOf(result));
                } else if (command.equals("tan")) {
                    double result = Math.tan(Math.toRadians(Double.parseDouble(textField.getText())));
                    textField.setText(String.valueOf(result));
                } else if (command.equals("log")) {
                    double result = Math.log10(Double.parseDouble(textField.getText()));
                    textField.setText(String.valueOf(result));
                } else if (command.equals("x!")) {
                    double num = Double.parseDouble(textField.getText());
                    double fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    textField.setText(String.valueOf(fact));
                } else if (command.equals("√")) {
                    double result = Math.sqrt(Double.parseDouble(textField.getText()));
                    textField.setText(String.valueOf(result));
                } else if (command.equals("x²")) {
                    double num = Double.parseDouble(textField.getText());
                    textField.setText(String.valueOf(num * num));
                }
            }
        };

        // Attach action listeners
        for (JButton button : numberButtons) {
            button.addActionListener(listener);
        }

        addButton.addActionListener(listener);
        subButton.addActionListener(listener);
        mulButton.addActionListener(listener);
        divButton.addActionListener(listener);
        eqButton.addActionListener(listener);
        clrButton.addActionListener(listener);
        delButton.addActionListener(listener);
        sinButton.addActionListener(listener);
        cosButton.addActionListener(listener);
        tanButton.addActionListener(listener);
        logButton.addActionListener(listener);
        factButton.addActionListener(listener);
        sqrtButton.addActionListener(listener);
        sqrButton.addActionListener(listener);
    }
}
