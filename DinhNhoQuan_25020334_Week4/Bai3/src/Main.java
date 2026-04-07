import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] em = new Employee[n];
        for(int i = 0; i < n; i++) {
            if(sc.next().equals("O")) em[i] = new OfficeWorker(sc.next(), sc.next(), sc.nextDouble());
            else em[i] = new Technician(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
        }
        double total = 0;
        System.out.println("");
        for(int i = 0; i < n; i++) {
            System.out.println(em[i].getName() + "-Pay:" + em[i].calculatePay());
            em[i].work();
            System.out.println("");
            total += em[i].calculatePay();
        }
        System.out.printf("Total: %.1f%n", total);
    }
 }
