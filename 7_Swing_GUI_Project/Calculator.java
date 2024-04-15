import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField display;

    public Calculator() {
        setTitle("Calculator");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        
        // Create display field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 25));
        display.setBackground(new Color(255, 255, 255));
        display.setPreferredSize(new Dimension(100, 150)); // Set panel size
        display.setForeground(Color.BLACK);
        add(display, BorderLayout.NORTH);

        // Create buttons panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(5, 4, 1, 1)); // 4x4 grid layout with gaps
        buttonsPanel.setPreferredSize(new Dimension(100, 80)); // Set panel size
        add(buttonsPanel, BorderLayout.CENTER);

        // Button labels
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "AC" // Add AC button
        };

        // Create buttons and add ActionListener
        for (String label : buttonLabels) 
        {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 15));
            // button.setPreferredSize(new Dimension(500, 30)); // Set button size
            button.addActionListener(new ButtonClickListener());
            button.setBackground(new Color(193, 193, 193));
            button.setForeground(Color.BLACK);
            buttonsPanel.add(button);
            if (label.equals("="))
            {
                button.setBackground(new Color(70, 149, 252));
            }
            if(label.equals("AC"))
            {
                button.setPreferredSize(new Dimension(10, 30)); // Set button size
                button.setForeground(Color.RED);
            }

        }
    }

    // ActionListener for calculator buttons
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("=")) {
                calculate();
            } else if (command.equals("AC")) { // Handle AC button
                display.setText("");
            } else {
                display.setText(display.getText() + command);
            }
        }

        private void calculate() {
            String expression = display.getText();
            try {
                double result = eval(expression);
                display.setText(Double.toString(result));
            } catch (Exception ex) {
                display.setText("");
            }
        }

        // Method to evaluate arithmetic expression
        private double eval(String expression) {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                    return x;
                }

                // Grammar:
                // expression = term | expression `+` term | expression `-` term
                // term = factor | term `*` factor | term `/` factor
                // factor = `+` factor | `-` factor | `(` expression `)` | number
                double parseExpression() {
                    double x = parseTerm();
                    for (;;) {
                        if      (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (;;) {
                        if      (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new RuntimeException("Unexpected: " + (char)ch);
                    }

                    return x;
                }
            }.parse();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
}
