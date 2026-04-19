public class Main {
	public static void main(String[] args) {
		BankAccount Poi = new BankAccount();

		Thread A = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				Poi.deposit(100);
			}
		});
		Thread B = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				Poi.withdraw(100);
			}
		});

		A.start();
		B.start();

		try {
			A.join();
			B.join();
		} catch(Exception e) {}

		System.out.println("Final balance: " + Poi.getBalance());
	}
 }
