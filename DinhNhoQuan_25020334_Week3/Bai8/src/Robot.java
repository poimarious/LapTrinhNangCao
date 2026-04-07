abstract public class Robot {
	private int id;
	private String modelName;
	private int batteryLevel;

	public Robot(int id, String modelName) {
		this.id = id;
		this.modelName = modelName;
		this.batteryLevel = 100;
	}

	public String getName() {return modelName;}
	public int getId() {return id;}
	public int getBatteryLevel() {return batteryLevel;}
	public void chargeBattery() {
		this.batteryLevel = 100;
	}
	final public void showidentity() {
		System.out.println("ID:" + id);
		System.out.println("Model:" + modelName);
	}
	abstract public void performMainTask();
}