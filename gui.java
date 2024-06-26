import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("My Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set window size

        // Create a JButton
        JButton button = new JButton("Click me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        // Add the button to the content pane
        frame.getContentPane().add(button);

        // Set layout (optional, default is BorderLayout)
        frame.setLayout(new FlowLayout());

        // Make the window visible
        frame.setVisible(true);
    }
}
