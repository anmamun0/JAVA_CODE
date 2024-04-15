/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  16:52:24
   _File    : three.java */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    public Login() {
        // Set frame properties
        setTitle("Your Login Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setResizable(false);

        // Create a panel to hold components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Custom background painting
                g.setColor(new Color(23, 35, 51));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null); // Disable layout manager for custom component positioning
        panel.setPreferredSize(new Dimension(400, 300)); // Set preferred size

        add(panel);

        JLabel title = new JLabel("Login form");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(140, 20, 200, 30);
        panel.add(title);

        JLabel user = new JLabel("Username: ");
        user.setForeground(Color.WHITE);
        user.setBounds(50, 80, 100, 20);
        panel.add(user);

        userField = new JTextField();
        userField.setBounds(150, 80, 200, 25);
        panel.add(userField);

        JLabel pass = new JLabel("Pasword");
        pass.setForeground(Color.WHITE);
        pass.setBounds(50, 120, 200, 20);
        panel.add(pass);

        passField = new JPasswordField();
        passField.setBounds(150, 120, 200, 25);
        panel.add(passField);

        //Button
        JButton btn = new JButton("Login");
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(0, 128, 128));
        btn.setFocusPainted(false);
        btn.setBounds(150, 160, 100, 30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = new String(userField.getText());
                String password = new String(passField.getPassword());

                if (password.isEmpty() || username.isEmpty()) {
                    JOptionPane.showMessageDialog(Login.this, "Please enter a password and User", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                }
            }
        });
        panel.add(btn);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}