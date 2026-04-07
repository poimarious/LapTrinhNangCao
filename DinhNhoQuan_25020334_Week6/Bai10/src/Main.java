public class Main {
	public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        System.out.println("Logger 1: " + log1.hashCode());
        System.out.println("Logger 2: " + log2.hashCode());

        log1.logInfo("App is starting");
        log2.logError("Something went wrong!");
	}
 }
