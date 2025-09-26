//Buffer reader
//Write a Program to read the same program file and find the no. of lines, words and characters. Write the result in in to a text file (result.txt)
import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        // The program will read this same file (FileStats.java)
        String fileName = "FileStats.java"; 
        String outputFile = "result.txt";

        int lineCount = 0, wordCount = 0, charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words (splitting by spaces, tabs, etc.)
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters (excluding newline characters)
                charCount += line.length();
            }

            // Writing results into result.txt
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                bw.write("File: " + fileName + "\n");
                bw.write("Number of lines: " + lineCount + "\n");
                bw.write("Number of words: " + wordCount + "\n");
                bw.write("Number of characters: " + charCount + "\n");
            }

            System.out.println("Results written to " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
