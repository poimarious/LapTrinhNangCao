public class CentralHub {
	public void registerDevice(SmartLight light) {
		System.out.println("[HUB]Connecting to device:" + light.getName());
	}
}