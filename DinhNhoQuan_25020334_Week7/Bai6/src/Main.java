import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		System.out.print("n = ");
		int n = sc.nextInt();

		//List <Integer> a = new ArrayList<>();

		List<Callable<Integer> > callables = new ArrayList<>();
		List<Future<Integer> > futures = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			List<Integer> a = new ArrayList<>();
			int m = sc.nextInt();
			for(int j = 0; j < m; j++) {
				a.add(sc.nextInt());
			}
			
			final int id = i;
			
			Callable<Integer> callable = () -> {
				int mx = Integer.MIN_VALUE;
				for(Integer x : a) {
					if(mx < x) mx = x;
				}

				int ans = Integer.MIN_VALUE;
				for(Integer x : a) {
					if(mx != x && ans < x) ans = x;
				}
				System.out.println("Array " + id + ": " + ((ans == Integer.MIN_VALUE || ans == mx) ? "Not found" : "second largest = " + ans));
				return ((ans == Integer.MIN_VALUE || ans == mx) ? 0 : ans);
			};
			callables.add(callable);
		}
		

		for(Callable<Integer> callable : callables) {
			futures.add(executorService.submit(callable));
		}


		AtomicInteger total = new AtomicInteger(0);
		for(Future<Integer> f : futures) {
			try {
				total.addAndGet(f.get());
			} catch(Exception e) {}
		}
		System.out.println("total = " + total);
		
		sc.close();
		executorService.shutdown();
	}
 }
/*
4
5  3 7 1 9 4
4  5 5 5 5
3  2 8 6
1  10

7 + 6 = 13
*/