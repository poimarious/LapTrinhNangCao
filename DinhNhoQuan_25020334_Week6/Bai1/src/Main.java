public class Main {
	public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            AppConfig config = AppConfig.getInstance();
            System.out.println(config);
            System.out.println(config.hashCode());
        });
        Thread t2 = new Thread(() -> {
            AppConfig config = AppConfig.getInstance();
            config.setAppName("abc").setVersion("1.1.1").setLogLevel("ERROR");
            System.out.println(config);
            System.out.println(config.hashCode());
        });
        t1.start();
        t2.start();
	}
 }
