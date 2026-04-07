public class VipRoom extends Room {
	public VipRoom(int days) {
		super((long)2000000, days);
	}
	public long calPrice() {
		return price * days;
	}

}