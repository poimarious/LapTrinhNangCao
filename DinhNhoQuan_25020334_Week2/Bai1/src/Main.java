public class Main {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("aba1", -40000.0, "Poi");
		BankAccount bank1 = new BankAccount("aba2", 40000.0, "Poi");
		bank1.withdraw(50000);
		bank1.withdraw(40000);
		bank1.getBalance();
	}
}