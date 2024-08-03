import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeChecker extends JFrame implements ActionListener {

    private JTextField inputField;
    private JLabel resultLabel;

    public PalindromeChecker() {
        super("Palindrome Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter a number:");
        add(inputLabel);

        inputField = new JTextField(10);
        add(inputField);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        add(checkButton);

        resultLabel = new JLabel("");
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        if (input.isEmpty()) {
            resultLabel.setText("Please enter a number.");
            return;
        }

        try {
            int num = Integer.parseInt(input);
            if (isPalindrome(num)) {
                resultLabel.setText(num + " is a palindrome.");
            } else {
                resultLabel.setText(num + " is not a palindrome.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }

    private boolean isPalindrome(int num) {
        if (num < 0) {
            num = -num; // Handle negative numbers
        }
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        new PalindromeChecker();
    }
}