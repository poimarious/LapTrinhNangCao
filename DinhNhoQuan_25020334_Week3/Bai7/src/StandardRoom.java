public class StandardRoom extends Room {
	public StandardRoom(int days) {
		super((long)500000, days);
	}

	public long calPrice() {
		if(days > 3) return (long)(price * days * 0.95);
		return price * days;
	}
}