import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SupportSystem {

    private Queue<Customer> customerQueue = new LinkedList<>();
    private Stack<Message> messageHistory = new Stack<>();
    
    public void addCustomer(Customer c) {
        customerQueue.offer(c);
        System.out.println("Khach den: " + c.getName());
    }
    
    public Customer serveNext() {
        if(customerQueue.isEmpty()) {
            System.out.println("Khong con khach doi!");
     
            return null;
        }
        Customer c = customerQueue.poll();
        System.out.println("Dang xu li:" + c.getName() + "...");
        messageHistory.clear();
        return c;
    }
        
    public void typeMessage(String content){
        Message msg = new Message(messageHistory.size() + 1, content);
        messageHistory.push(msg);
        System.out.println("Staff:" + content);
    }

    public void undoMessage() {
        if(messageHistory.isEmpty()){
            System.out.println("Khong con tin nhan de xoa.");
            return ;
        }
        Message rm = messageHistory.pop();
        System.out.println("da xoa cau: " + rm.getContent());
    }

    public void viewLast() {
        if(messageHistory.isEmpty()) return ;
        System.out.println("Cau vua go: " + messageHistory.peek());
    }
}
