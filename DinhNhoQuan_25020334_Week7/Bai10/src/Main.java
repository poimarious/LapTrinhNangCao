public class Main {
	public static void main(String[] args) {
		Worker worker = new Worker();

		Thread t = new Thread(worker);
		

		t.start();
		
		try {
			Thread.sleep(1000);
			System.out.println("WAIT!");
		
			worker.stop();

			t.join();
		} catch(InterruptedException e) {}
	}
 }

 // Việc sử dụng volatile giúp các luồng không vì sử dụng bộ nhớ cache riêng mà khiến cho chúng bị điếc trước
// những thay đổi của nhau do cơ chế tối ưu hóa bộ nhớ của CPU.
