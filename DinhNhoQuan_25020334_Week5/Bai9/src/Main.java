import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String filename = "students.dat";
        List<Student> students = new ArrayList<>();

        try {
            while(true) {
                System.out.print("ID: ");
                String id = sc.nextLine();
                if(id.equalsIgnoreCase("END")) break;
                System.out.print("Ten: ");
                String name = sc.nextLine();
                System.out.print("GPA: ");
                double gpa = Double.parseDouble(sc.nextLine());

                students.add(new Student(id, name, gpa));
            }
        } catch(NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Reader:");

        try(ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("Write successfully.");
        } catch(IOException e ) {
            System.err.println("System Output Error:" + e.getMessage());
        }


        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Student> readList = (List<Student> ) ois.readObject();
            for(Student s : readList) {
                System.out.println(s);
            }
        } catch(FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch(ClassNotFoundException e) {
            System.err.println("Error: Student class not found.");
        } catch(IOException e) {
            System.err.println("System IO Error: " + e.getMessage());
        }
	}
 }
