import java.io.*;
import java.util.Scanner;

public class ReadFirst3Lines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name (with path if needed): ");
        String fileName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
