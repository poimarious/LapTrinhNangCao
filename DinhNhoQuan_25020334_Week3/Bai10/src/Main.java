import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> em = new ArrayList<>();
		System.out.println("Amount:");
		int amount = sc.nextInt();

		for(int i = 0; i < amount; i++) {
			String type = sc.next();
			if(type.equals("E")) {
				em.add(new Employee(sc.next(), sc.nextDouble()));
			} else if(type.equals("D")) {
				em.add(new Developer(sc.next(), sc.nextDouble(), sc.nextInt()));
			} else {
				em.add(new Tester(sc.next(), sc.nextDouble(), sc.nextInt()));
			}
		}

		for(int i = 0; i < amount; i++ ){
			System.out.println(em.get(i));
			if(em.get(i) instanceof Developer) {
				System.out.println("Tang khoa hoc AWS");
			} else if(em.get(i) instanceof Tester) {
				System.out.println("Tang tool Test");
			}
		}
	}
 }
