public class SMSApp extends NotificationApp {
    @Override 
    public Notification createNotification() {
        return new SMSNotification();
    }
}
