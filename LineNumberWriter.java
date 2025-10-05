//Line number writer
//Write a program to read the same program file and write it to other file with the lines number added before each line, starting from 1.
import java.io.*;

public class LineNumberWriter {
    public static void main(String[] args) {
        String inputFile = "LineNumberWriter.java";  // this program file
        String outputFile = "output.txt";            // file to save with line numbers

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                bw.write(lineNumber + ": " + line);
                bw.newLine(); // move to next line
                lineNumber++;
            }

            System.out.println("File copied with line numbers into " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
