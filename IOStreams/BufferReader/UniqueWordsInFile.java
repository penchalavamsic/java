//Unique Words in a file

import java.io.*;
import java.util.*;

public class UniqueWordsInFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";  // input file name

        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split by non-word characters (spaces, punctuation, etc.)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        uniqueWords.add(word.toLowerCase()); // store lowercase for uniformity
                    }
                }
            }

            // Print all unique words
            System.out.println("Unique words in file:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }

            // Optional: Write unique words into another file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("unique_words.txt"))) {
                for (String word : uniqueWords) {
                    bw.write(word);
                    bw.newLine();
                }
            }
            System.out.println("\nUnique words also written to unique_words.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
