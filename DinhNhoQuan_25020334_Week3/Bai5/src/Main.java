import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount:");
		int amount = sc.nextInt();
		sc.nextLine();
		Employee[] em = new Employee[amount];
		for(int i = 0; i < em.length; i++) {
			String c = sc.next();
			if(c.equals("F")) {
				em[i] = new FullTimeEmployee(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			} else {
				em[i] = new PartTimeEmployee(sc.next(), sc.nextDouble(), sc.nextDouble());
			}
 		}
 		
 		for(int i = 0; i < em.length; i++) {
 			System.out.println(em[i]);
 		}
	}
 }
