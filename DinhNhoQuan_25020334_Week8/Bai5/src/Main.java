import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();

		orders.add(new StandardOrder(2.0, 10.0));
        orders.add(new ExpressOrder(2.0, 10.0));
        orders.add(new FragileOrder(1.5, 5.0));
        orders.add(new BulkyOrder(10.0, 20.0));

		System.out.println("DANH SÁCH VẬN ĐƠN:");
		System.out.println("------------------");
		for(Order o : orders) {
			System.out.println(o.getLabel() + " | Phí: " + o.getDeliveryFee());
		}
	}
 }
