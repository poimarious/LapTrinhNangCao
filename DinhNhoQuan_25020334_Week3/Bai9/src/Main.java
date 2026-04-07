import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount:");
		int amount = sc.nextInt();
		IPayable[] payableList = new IPayable[amount];
		for(int i = 0; i < payableList.length; i++) {
			String type = sc.next();
			if(type.equals("S")) {
				payableList[i] = new PartTimeStaff(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
			} else {
				payableList[i] = new Invoice(sc.next(), sc.nextInt(), sc.nextDouble());
			}
		}
		double total =  0;
		for(int i = 0; i < payableList.length; i++) {
			System.out.println(payableList[i]);
			total += payableList[i].getPaymentAmount();
		}
		System.out.println("Total Payment = " + total);
	}
 }
