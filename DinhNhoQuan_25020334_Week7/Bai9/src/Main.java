import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Counter counter = new Counter();

		List<Thread> threads = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			Thread t = new Thread(() -> {
				for(int j = 0; j < 10000; j++) {
					counter.increment();
				}
			}, "Thread " + i);
			threads.add(t);
			t.start();
		}

		System.out.println(threads.size());

		for(Thread t : threads) {
			try {
				t.join();
			} catch(Exception e) {}
		}


		System.out.println("Value = " + counter.getValue());
	}
 }
