public class Tester extends Employee {
	int bugsFound;
	public Tester(String name, double baseSalary, int bugsFound) {
		super(name, baseSalary);
		this.bugsFound = bugsFound;
	}
	public double calculateBonus() {
		return 0.1 * baseSalary + bugsFound * 50000;
	}
	public String toString() {
		return String.format("%s - Bonus: %f", name, calculateBonus());
	}
}