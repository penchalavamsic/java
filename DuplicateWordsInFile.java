//Duplicate Words in a file
import java.io.*;
import java.util.*;

public class DuplicateWordsInFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";  // input file

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split by non-word characters (spaces, punctuation, etc.)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        String lowerWord = word.toLowerCase();
                        wordCount.put(lowerWord, wordCount.getOrDefault(lowerWord, 0) + 1);
                    }
                }
            }

            // Print duplicate words
            System.out.println("Duplicate words in file:");
            boolean found = false;
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No duplicate words found.");
            }

            // Optional: Write duplicates into another file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("duplicate_words.txt"))) {
                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    if (entry.getValue() > 1) {
                        bw.write(entry.getKey() + " -> " + entry.getValue() + " times");
                        bw.newLine();
                    }
                }
            }
            System.out.println("\nDuplicate words also written to duplicate_words.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
