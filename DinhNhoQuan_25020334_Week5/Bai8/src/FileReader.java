import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {

        System.out.println("\nReader: ");
        Scanner sc = new Scanner(System.in);

        String filename = "numbers.dat";
        try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while(true) {
                try {
                    int x = dis.readInt();
                    System.out.println(x + " ");
                } catch(EOFException e) {
                    System.out.println("Read successfully.");
                    break;
                }             }
        } catch(FileNotFoundException e) { 
            System.err.println("Error: Not found " + filename); 
        }
        catch(IOException e) {
            System.out.print("Error: " + e.getMessage());
        }


	}
 }
