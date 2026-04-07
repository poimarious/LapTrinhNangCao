
public class Book extends MediaItem {
    private String author;
    private int page;

    public Book(String id, String name, String author, int page) {
        super(id, name);
        this.author = author;
        this.page = page;
    }

    public String getInfo() {
        return name + " - " + author + " - " + page;
    }
}
