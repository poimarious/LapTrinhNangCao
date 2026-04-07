abstract public class Room {
	protected long price;
	protected int days;
	public Room(Long price, int days) {
		this.price = price;
		this.days = days;
	}
	
	abstract public long calPrice();
}