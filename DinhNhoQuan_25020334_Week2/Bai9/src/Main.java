import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static String name;
	private static double discount, price;
	private static int quantity;
	public static Product readProduct() {
		System.out.println("Name:");
		name = scanner.nextLine();
		System.out.println("Price:");
		price = scanner.nextDouble();
		System.out.println("Quantity:");
		quantity = scanner.nextInt();
		System.out.println("Discount:");
		discount = scanner.nextDouble();
		scanner.nextLine();
		return new Product(name, price, quantity, discount);
	}  
	public static void main(String[] args) {
		Product p1 = readProduct();
		Product p2 = readProduct();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("Amount:");
		int amount = scanner.nextInt();
		p1.sell(amount);
		p2.sell(amount);
		System.out.println("Final Price:" + p1.calculateFinalPrice());
		System.out.println("Final Price:" + p2.calculateFinalPrice());

		Product.updateTaxRate(0.08);
		System.out.println("Final Price:" + p1.calculateFinalPrice());
		System.out.println("Final Price:" + p2.calculateFinalPrice());

		p1.updateDiscount(10.0);
		System.out.println("Final Price:" + p1.calculateFinalPrice());
		System.out.println("Final Price:" + p2.calculateFinalPrice());

		System.out.println("Total Revenue:" + Product.getTotalRevenue());
		scanner.close();
	}
}