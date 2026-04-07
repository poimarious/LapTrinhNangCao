public class Main {
    public static void main(String[] args) {
        NotificationApp app;
        System.out.print("Email: ");
        app = new EmailApp();
        app.notifyUser("Hello User.");
        System.out.print("SMS: ");
        app = new SMSApp();
        app.notifyUser("Vinaphone xin chao quy buu.");
	}
 }
