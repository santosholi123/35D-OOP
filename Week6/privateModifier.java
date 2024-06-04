

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  privateModifier {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Login Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use null layout for absolute positioning

        // Create username label and text field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 25);
        frame.add(userText);

        // Create password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(150, 100, 150, 25);
        frame.add(passwordText);

        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 80, 25);
        frame.add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // For demonstration, we assume the correct username is "user" and password is "password"
                if ("user".equals(username) && "password".equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
