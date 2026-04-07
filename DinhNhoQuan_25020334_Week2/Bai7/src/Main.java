public class Main {
	public static void main(String[] args) {
		Product[] arr = {new Product("P0", "Laptop", 1000), new Product("P1", "Book", 40)};
		Inventory kho = new Inventory(arr);

		arr[0].setPrice(5000);
		kho.showItem();
	}
}