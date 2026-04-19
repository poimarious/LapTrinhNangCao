import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
    
        Scanner sc = new Scanner(System.in);
        
        AtomicInteger cnt = new AtomicInteger();
        
        System.out.print("m = ");
        int m = sc.nextInt();
        
        
        
        List<Callable<Boolean > > callList = new ArrayList<>();
        List<String > logs = new CopyOnWriteArrayList<>();



        for(int i = 0; i < m; i++) {
            System.out.print("[ORDER" + i + "]" + "id=");
            String id = sc.next();
            System.out.print("[ORDER" + i + "]" + "processMs=");
            long processMs = sc.nextLong();
            Callable<Boolean> callable = () -> {
                System.out.println("Start <" + id + ">");
                Thread.sleep(processMs);
                System.out.println("Returned " + id);
                if(processMs > 1500) {
                    logs.add("FAIL <" + id + ">");
                    return false;
                }
                logs.add("DONE <" + id + ">");
                cnt.incrementAndGet();
                return true;
            };
            callList.add(callable);
        }


        List<Future<Boolean> > futures = new ArrayList<>();
        for(Callable<Boolean > callable : callList) {
            futures.add(executorService.submit(callable));
        }

        sc.close();
        executorService.shutdown();
        
        for(Future<Boolean> future : futures) {
            try {
                future.get();
            } catch(Exception e) {}
        }

        System.out.println(logs.size());
        for(String log : logs) {
            System.out.println(log);
        }

        System.out.println("Amount of done order: " + cnt);
    }
}

/*
example:
3
w1
1500
w2
1000
w3
2000
*/
