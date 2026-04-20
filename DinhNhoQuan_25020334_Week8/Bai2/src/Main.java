public class Main{

	public static void main(String[] args) {

		PayrollSystem system = new PayrollSystem();
		
		String name = "Nguyễn Văn A";
		double baseSalary = 30000000;
		int workDays = 20;
		int totalDays = 22;
		double taxRate = 0.20; 
		double bonus = 2000000;

		system.printPayrollOld(name, baseSalary, workDays, totalDays, taxRate, bonus);
		system.printPayroll(name, baseSalary, workDays, totalDays, taxRate, bonus);
	}
}
