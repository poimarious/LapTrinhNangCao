public class Main {
	public static void main(String[] args) {
        Notifier SMSNoti = new SMSNotifier(new FacebookNotifier(new EmailNotifier()));
        SMSNoti.send("Hello World!");

        // muti channel
        Notifier email = new EmailNotifier();
        Notifier SMS2 = new SMSNotifier(email);
        Notifier FB =  new FacebookNotifier(email);
        SMS2.send("Hello World 2");
        FB.send("Hello Hell 2");


        // Điểm yếu : không thể tạo SMSNotifier(new FacebookNotifier())
        // muốn tạo, phải code thêm 1 class lõi rỗng, hoặc biến 1 trong 2 thành lõi
    }
 }
