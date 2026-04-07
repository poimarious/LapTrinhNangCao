public class PartTimeEmployee extends Employee {
	protected double workingHours, hourlyRate;

	public PartTimeEmployee(String name, double workingHours, double hourlyRate) {
		super(name);
		this.workingHours = workingHours;
		this.hourlyRate = hourlyRate;		
	}

	public double calSalary() {
		return workingHours * hourlyRate;
	}

	public String toString() {
		return String.format("%s - Part-time - %f", name, this.calSalary());
	}
}