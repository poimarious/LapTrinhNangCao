import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {
	private LocalDate expirydate;
	private LocalDate nDate = LocalDate.now();
	public Food(String name, double price, LocalDate expirydate) {
		super(name, price);
		this.expirydate = expirydate;
	}

	public double calPrice() {
		if(ChronoUnit.DAYS.between(nDate, expirydate) <= 7) {
			return price* 0.8;
		} else return price;
	}

	public String toString() {
		return String.format("%s - Food - %f", name, calPrice());
	}
}