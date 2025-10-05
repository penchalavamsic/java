//CaesarCipher problem

import java.io.*;

public class CaesarCipherFile {
    // Method to encrypt text with Caesar cipher
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ((c - 'A' + shift) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ((c - 'a' + shift) % 26 + 'a'));
            } else {
                result.append(c); // keep spaces, punctuation as is
            }
        }
        return result.toString();
    }

    // Method to decrypt text with Caesar cipher
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // reverse shift
    }

    public static void main(String[] args) {
        String plainText = "Hello Caesar Cipher Example using Files!";
        int shift = 3; // displacement value

        String encrypted = encrypt(plainText, shift);

        // Step 1: Write encrypted message to enc_message.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("enc_message.txt"))) {
            bw.write(encrypted);
            System.out.println("Encrypted message written to enc_message.txt");
        } catch (IOException e) {
            System.out.println("Error writing encrypted file: " + e.getMessage());
        }

        // Step 2: Read encrypted message from file
        StringBuilder encryptedFromFile = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("enc_message.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                encryptedFromFile.append(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading encrypted file: " + e.getMessage());
        }

        // Step 3: Decrypt the message
        String decrypted = decrypt(encryptedFromFile.toString(), shift);

        // Step 4: Write decrypted message to dec_message.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dec_message.txt"))) {
            bw.write(decrypted);
            System.out.println("Decrypted message written to dec_message.txt");
        } catch (IOException e) {
            System.out.println("Error writing decrypted file: " + e.getMessage());
        }
    }
}
