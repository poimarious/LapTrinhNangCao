public class Inventory {
	Product[] items;

	public Inventory(Product[] initialItems) {
		this.items = initialItems;
	}
	public void showItem() {
		for(Product x : items) {
			System.out.println(x);
		}
	}
}