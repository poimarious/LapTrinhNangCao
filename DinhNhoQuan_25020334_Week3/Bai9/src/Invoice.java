public class Invoice implements IPayable {
	String itemName;
	int quantity;
	double pricePerItem;

	public Invoice(String itemName, int quantity, double pricePerItem) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public double getPaymentAmount() {return quantity * pricePerItem;}
	public String toString() {
		return String.format("Invoice %s - Payment: %f", itemName, getPaymentAmount());
	}
}