public class Main {
	public static void main(String[] args) {
		CentralHub hub = new CentralHub();
		SmartLight l1 = new SmartLight("L01", "Living room's light", 80);
		SmartLight l2 = new SmartLight("L02", "Bedroom's light");
		l2.setBrightness("ECO");
		l1.connectToHub(hub);
		l2.connectToHub(hub);

		System.out.println(l1.getName() + "'s brightness: " + l1.getBrightness());
		System.out.println(l2.getName() + "'s brightness: " + l2.getBrightness());
	}
}