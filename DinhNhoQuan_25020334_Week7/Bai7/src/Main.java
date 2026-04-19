import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

	public static boolean checkPrime(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		System.out.print("n = ");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>(Collections.nCopies(n + 1, null));
		System.out.println(list.size());
		
		List<Callable<Integer>> callables = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			List<Integer> a = new ArrayList<>();
			int m = sc.nextInt();
			for(int j = 0;j < m; j++) a.add(sc.nextInt());

			final int id = i;

			Callable<Integer > callable = () -> {
				Integer cnt = 0;
				for(Integer x : a) {
					if(checkPrime(x)) cnt++;
				}
				
				//mp.put("Array " + id, cnt);
				list.set(id, cnt);
				return cnt;
			};
			callables.add(callable);
		}


		List<Future<Integer>> futures = new ArrayList<>();

		for(Callable<Integer> callable : callables) {
			futures.add(executorService.submit(callable));
		}


		for(Future<Integer> f : futures) {
			try {
				f.get();
			} catch(Exception e) {}
		}

		int mx = 0; 

		for(int i = 0; i < n; i++) {
			System.out.println("Array " + i + ":" + list.get(i));
			if(list.get(i) > list.get(mx)) mx = i;
		}

		System.out.println("Most primes: Array " + mx + " with " + list.get(mx) + (list.get(mx) == 1 ? " prime" : " primes"));

		sc.close();
		executorService.shutdown();
	}
 }
