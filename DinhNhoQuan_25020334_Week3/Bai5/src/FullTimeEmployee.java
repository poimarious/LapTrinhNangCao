public class FullTimeEmployee extends Employee {
	private double baseSalary, bonus, penalty;

	public FullTimeEmployee(String name, double baseSalary, double bonus, double penalty) {
		super(name);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.penalty = penalty;
	}

	public double calSalary() {
		return baseSalary + (bonus - penalty);
	}
	public String toString() {
		return String.format("%s - Full-time - %f", name, this.calSalary());
	}
}