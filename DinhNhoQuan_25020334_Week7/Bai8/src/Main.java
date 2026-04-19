import java.util.ArrayList;
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
		ExecutorService pool1 = Executors.newSingleThreadExecutor();
		ExecutorService pool2 = Executors.newSingleThreadExecutor();
	
		
		System.out.print("n = ");
		int n = sc.nextInt();

		List<CompletableFuture<Long> > tasks = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			final int id = i;
			List<Integer> a = new ArrayList<>();
			int m = sc.nextInt();

			for(int j = 0; j < m; j++) a.add(sc.nextInt());

			CompletableFuture<List<Integer>> stage1 = CompletableFuture.supplyAsync(() -> {
				List<Integer> ans = new ArrayList<>();
				for(Integer x : a) {
					if(checkPrime(x)) ans.add(x);
				}

				System.out.println("Stage 1 - Array " + id + ": " + ans);
				return ans;
			}, pool1);

			CompletableFuture<Long > stage2 = stage1.thenApplyAsync(p -> {
				long ans = 0;
				int s = p.size();
				if(s % 2 == 1) {
					for(Integer x : p) ans += (long) x * x * x;
					System.out.println("Stage 2 - Array " + id + ": sum of cubes = " + ans);
				}
				else {
					for(Integer x : p) ans += (long) x * x;
					System.out.println("Stage 2 - Array " + id + ":  sum of squares = " + ans);
				}
				
				return ans;
			}, pool2);

			tasks.add(stage2);
		}

		long total = 0;
		for(CompletableFuture<Long> task : tasks) {
			try {
				total += task.get();
			} catch(Exception e) {}
		}

		System.out.println("Total = " + total);

		sc.close();
		pool1.shutdown();
		pool2.shutdown();
	}
 }
