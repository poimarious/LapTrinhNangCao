public class Employee {
	protected String name;
	protected double baseSalary;

	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public double calculateBonus() {return 0.1 * baseSalary;}
	public String toString() {
		return String.format("%s - Bonus: %f", name, calculateBonus());
	}
}