public class Product {
	private String name;
	private int quantity;
	private double price, discount;

	private static double taxRate = 0.1;
	private static double totalRevenue = 0;

	public Product(String name, double price, int quantity, double discount) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}

	public static void updateTaxRate(double newRate) {
		Product.taxRate = newRate;
	}
	public double calculateFinalPrice() {
		return (this.price - this.discount) * (1 + this.taxRate);
	}
	public void updateDiscount(double newDiscount) {
		this.discount = newDiscount;
	}
	public void sell(int amount) {
		if(amount <= quantity) {
			totalRevenue += amount * this.calculateFinalPrice();
			System.out.println("Sell sucessfully!");
			this.quantity -= amount;
		} else {
			System.err.println("Not enough product!");
		}
	}

	public String toString() {
		return String.format("Name: %s | Price: %f | Quantity: %d | Discount: %f", name, price, quantity, discount);
	}

	public static double getTotalRevenue(){return Product.totalRevenue;}
}