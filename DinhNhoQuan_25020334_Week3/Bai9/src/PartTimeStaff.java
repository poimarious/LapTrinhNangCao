public class PartTimeStaff extends Staff {
	private int workingHours;
	private double hourlyRate;
	public PartTimeStaff(String id, String name, int workingHours, double hourlyRate) {
		super(id, name);
		this.workingHours = workingHours;
		this.hourlyRate = hourlyRate;
	}

	public double getPaymentAmount() {return workingHours * hourlyRate;}
	public String toString(){
		return String.format("PartTimeStaff %s - Payment:%f", this.getName(), this.getPaymentAmount());
	}

}