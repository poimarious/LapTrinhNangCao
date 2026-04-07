public class SMSNotifier extends NotifierDecorator {
    
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }
    
    @Override 
    public void send(String msg) {
        super.send(msg);

        System.out.println("Sending a SMS Notifier: " + msg);
    }
}
