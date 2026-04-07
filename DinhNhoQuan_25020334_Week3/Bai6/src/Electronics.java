public class Electronics extends Product {
	private double warrantyFee;
	public Electronics(String name, double price, double warrantyFee) {
		super(name, price);
		this.warrantyFee = warrantyFee;
	}
	public double calPrice() {
		return 1.1 *price + warrantyFee;
	}

	public String toString() {
		return String.format("%s - Electronics - %f", name, this.calPrice());
	}
}