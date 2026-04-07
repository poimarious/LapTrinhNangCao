public class Message {

    private long id;
    private String content;

    public Message(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public String getContent() {return content;}

    @Override
    public String toString() {
        return String.format("Message{id=%d - content=%s}", id, content);
    }

}
