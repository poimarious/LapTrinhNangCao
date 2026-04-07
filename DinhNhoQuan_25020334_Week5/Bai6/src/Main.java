import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("a = ");
            long a = sc.nextLong();
            System.out.print("b = ");
            long b = sc.nextLong();
            double ans = (double)a / (double)b;
            System.out.println(a + "/" + b + "=" + ans);
        } catch(InputMismatchException e) {
            System.out.println("Type Error : " + e);
        } catch(ArithmeticException e) {
            System.out.println("Arithmetical Error :" + e);
        } finally {
            System.out.println("Program finished.");
        }
	}
 }
