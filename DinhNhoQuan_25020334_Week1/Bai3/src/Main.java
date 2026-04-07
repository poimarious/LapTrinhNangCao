public class Main {
	public static void main(String[] args) {
		Object obj1 = new Object("BankAccount", "accountNumber, ownerName, balance", "openAccount(), deposit(), withdraw()");
		Object obj2 = new Object("SmartFan", "brand, isPowerOn, speedLever", "turnOn(), turnOff(), setSpeed()");
		System.out.println("Object 1:");
		obj1.ShowInfo();
		System.out.println("Object 2:");
		obj2.ShowInfo();

	}
}