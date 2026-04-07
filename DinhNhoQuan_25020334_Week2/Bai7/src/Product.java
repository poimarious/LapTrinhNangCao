public class Product {
	private String id, name;
	private double price;

	public Product(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return String.format("ID: %s | Name: %s | Price: %f", id, name, price);
	}
}