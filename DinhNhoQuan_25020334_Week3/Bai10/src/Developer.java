public class Developer extends Employee {
	int overtimeHours;

	public Developer(String name, double baseSalary, int overtimeHours) {
		super(name, baseSalary);
		this.overtimeHours = overtimeHours;
	}

	public double calculateBonus() {
		return 0.1 * baseSalary + overtimeHours * 50000;
	}
	public String toString() {
		return String.format("%s - Bonus: %f", name, calculateBonus());
	}
}