import java.util.concurrent.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        System.out.print("n = ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0, x; i < n; i++) {
            System.out.print("a[" + i + "]=");
            x = sc.nextInt();
            arr.add(x);
        }

        System.out.println(arr);

        Callable<Integer> callable;

        List<Future<Integer>> futureList = new ArrayList<>();

        for(int i = 0; i < n; i+=4) {
            final int id = i;
            callable = () -> {
                System.out.println("Calculating from " + id + " to " + Math.min(id + 3, n - 1) + "...");
                Thread.sleep(2000);
                
                int ans = 0;
                for(int j = id; j <= Math.min(n - 1, id + 3); j++) ans += arr.get(j);

                System.out.println("done");
                return ans;
            };
            futureList.add(executorService.submit(callable));
        }

        executorService.shutdown();


        int sum = 0;
        try {
            for(Future<Integer> f : futureList) {
                sum += f.get();
            }
            System.out.println("Total = " + sum);
        } catch(InterruptedException e) {

        } catch (ExecutionException e) {}
        sc.close();
    }
 }
