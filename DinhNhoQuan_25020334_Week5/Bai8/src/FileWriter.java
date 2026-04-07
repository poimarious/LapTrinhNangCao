import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String filename = "numbers.dat";

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            System.out.print("n = ");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {
                System.out.println("So " + (i + 1) + ": ");
                int x = sc.nextInt();
                dos.writeInt(x);
            }
            System.out.println("Write successfully.");
        } catch(IOException e) {
            System.err.println("Error while writing: " + e.getMessage());
        }

    }
}
