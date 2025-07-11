import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class SecurityApp extends JFrame {
    private JTextField passwordField;
    private JTextArea outputArea;
    private SecretKey secretKey;

    public SecurityApp() {
        setTitle("Security Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        passwordField = new JTextField(20);
        add(new JLabel("Enter Password:"));
        add(passwordField);

        JButton processButton = new JButton("Process");
        add(processButton);

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        // Generate AES secret key
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            outputArea.setText("Error generating encryption key.");
        }

        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processPassword();
            }
        });

        setVisible(true);
    }

    private void processPassword() {
        String password = passwordField.getText();

        if (password.isEmpty()) {
            outputArea.setText("Please enter a password.");
            return;
        }

        String hashedPassword = hashPassword(password);
        String encryptedPassword = encryptData(password, secretKey);
        String decryptedPassword = decryptData(encryptedPassword, secretKey);

        outputArea.setText("Hashed Password: " + hashedPassword + "\n"
                + "Encrypted Password: " + encryptedPassword + "\n"
                + "Decrypted Password: " + decryptedPassword);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            return "Error hashing password.";
        }
    }

    private String encryptData(String data, SecretKey key) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            return "Error encrypting data.";
        }
    }

    private String decryptData(String encryptedData, SecretKey key) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decryptedBytes);
        } catch (Exception e) {
            return "Error decrypting data.";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SecurityApp());
    }
}