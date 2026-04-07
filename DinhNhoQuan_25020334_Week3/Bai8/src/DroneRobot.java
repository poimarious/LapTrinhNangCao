public class DroneRobot extends Robot implements Flyable, GPS  {

	public DroneRobot(int id, String modelName) {
		super(id, modelName);
	}
	public void fly() {
		System.out.println(getName() + " flying");
	}
	public void getCoordinates() {
		System.out.println(getName() + " getting coordinates");
	}
	public void performMainTask() {
		System.out.println(getName() + " performing main task");
	}
}