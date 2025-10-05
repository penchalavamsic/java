import java.io.*;

public class LongestWordFinder {
    public static void main(String[] args) {
        String fileName = "sample.txt";  // input file

        String longestWord = "";
        int maxLength = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split line into words (removes punctuation using regex)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.length() > maxLength) {
                        maxLength = word.length();
                        longestWord = word;
                    }
                }
            }

            if (!longestWord.isEmpty()) {
                System.out.println("Longest word: " + longestWord);
                System.out.println("Length: " + maxLength);
            } else {
                System.out.println("No words found in the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
