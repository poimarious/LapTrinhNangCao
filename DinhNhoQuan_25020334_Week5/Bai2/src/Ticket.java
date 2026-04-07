import java.time.LocalDateTime;

public class Ticket {

    private String id;
    private String content;
    private LocalDateTime timestamp;

    public Ticket(String id, String content, LocalDateTime timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }
}
