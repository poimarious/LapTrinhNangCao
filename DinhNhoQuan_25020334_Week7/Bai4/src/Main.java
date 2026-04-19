public class Main {
	public static void main(String[] args) {
		
		BookStore store = new BookStore();

		store.addBook("Book1", 10);
		store.addBook("Book2", 10);

		Thread A =new Thread(() -> {
			store.getStock("Book 1");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
		}, "Reader1");
		Thread B =new Thread(() -> {
			store.getStock("Book 1");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
		}, "Reader2");

		Thread C =new Thread(() -> {
			store.getStock("Book1");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
		}, "Reader3");

		Thread D = new Thread(() -> {
			store.addBook("Book3", 10);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
		}, "Writer Add");


		Thread E = new Thread(() -> {
			store.borrow("Book1", 5);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
		});


		A.start();
		B.start();
		C.start();
		D.start();
		E.start();

		try {
			A.join();
			B.join();
			C.join();
			D.join();
			E.join();
		} catch(Exception e) {}
	}
 }
