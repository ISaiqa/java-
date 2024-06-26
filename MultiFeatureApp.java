import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class MultiFeatureApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multi-Feature App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create buttons for different features
        JButton calculatorButton = new JButton("Calculator");
        JButton todoButton = new JButton("To-Do List");

        // Set layout (e.g., GridLayout, FlowLayout, etc.)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // Example: 2 rows, 1 column
        panel.add(calculatorButton);
        panel.add(todoButton);

        // Add action listeners for each button
        calculatorButton.addActionListener(e -> openCalculator());
        todoButton.addActionListener(e -> openTodoList());

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the window visible
        frame.setVisible(true);
    }

    // Implement methods to open different features
    private static void openCalculator() {
        // Calculator logic
        String input = JOptionPane.showInputDialog("Enter an expression:");
        try {
            double result = evaluateExpression(input);
            JOptionPane.showMessageDialog(null, "Result: " + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid expression!");
        }
    }

    private static double evaluateExpression(String expression) {
        // Implement your expression evaluation logic here
        // For simplicity, let's assume the expression is a simple addition
        String[] parts = expression.split("\\+");
        double operand1 = Double.parseDouble(parts[0]);
        double operand2 = Double.parseDouble(parts[1]);
        return operand1 + operand2;
    }

    private static void openTodoList() {
        // To-do list logic
        String task = JOptionPane.showInputDialog("Enter a task:");
        // Save the task or display it in a list
        JOptionPane.showMessageDialog(null, "Task added: " + task);
    }
}
