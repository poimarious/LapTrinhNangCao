import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;

import java.io.FileNotFoundException;
    import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("source path: ");
        String sourcePath = sc.nextLine();
        System.out.print("destination path: ");
        String destPath = sc.nextLine();

        BufferedReader reader = null;
        PrintWriter writer = null;
        int lineCount = 0;

        try {
            reader = new BufferedReader(new FileReader(sourcePath));

            writer = new PrintWriter(new FileWriter(destPath));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line); 
                lineCount++;
            }

            System.out.println("Copy successfully!");
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException e) {
            if (e.getMessage().contains(sourcePath)) {
                System.err.println("Source file not found.");
            } else {
                System.err.println("Cannot create destination file.");
            }
        } catch (IOException e) {
            System.err.println("I/O error.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.err.println("Error closing files.");
            }
        }
    }
}
