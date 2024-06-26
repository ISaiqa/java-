import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class AttractiveSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Attractive Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a gradient background panel
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(
                    0, 0, Color.BLUE, getWidth(), getHeight(), Color.CYAN);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        // Create a custom button
        JButton button = new JButton("Click me!");
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(0, 0, 0, 0)); // Transparent background
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Add padding

        // Add button to the panel
        panel.add(button);

        // Set layout (optional; default is BorderLayout)
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
