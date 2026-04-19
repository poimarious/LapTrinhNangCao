public class Worker implements Runnable {
    private volatile boolean running = true;

    public void stop() {
        this.running = false;
    }


    @Override
    public void run() {
        while(running) {
            System.out.println("Working...");
        }
    }
}
