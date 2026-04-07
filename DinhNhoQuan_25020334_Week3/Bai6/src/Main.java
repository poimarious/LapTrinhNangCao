import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		LocalDate nDate = LocalDate.now();

		Scanner sc = new Scanner(System.in);
		System.out.println("Amount:");
		int amount = sc.nextInt();
		sc.nextLine();
		Product[] p = new Product[amount];
		for(int i = 0; i < p.length; i++) {
			String c = sc.next();
			if(c.equals("E")) {
			 	p[i] = new Electronics(sc.next(), sc.nextDouble(), sc.nextDouble());	
			} else {
				p[i] = new Food(sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()));
			}
		}
		
		double total = 0;
		for(int i = 0; i < amount; i++) {
			System.out.println(p[i]);
			total += p[i].calPrice();
		}
		System.out.println("Total:" + total);
	}
 }
