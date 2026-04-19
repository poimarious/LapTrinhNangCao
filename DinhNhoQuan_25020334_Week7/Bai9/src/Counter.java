import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private final ReentrantLock lock = new ReentrantLock();
    
    private int value;

    public Counter() {
        this.value = 0;
    }

    public int getValue() {return value;}

    public void increment() {
        if(lock.tryLock()) {
            try { 
                value++;
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "-No way");
        }
    }
}
