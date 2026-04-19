public class Main extends Thread {
	public static void main(String[] args) throws InterruptedException {
        Thread task1 = new Thread(new Task("first task", 1000));
        Thread task2 = new Thread(new Task("second task", 2000));
        
        task1.start();
        task2.start();
        task1.join();
        task2.join();
        System.out.println("All tasks done");
	}
 }
