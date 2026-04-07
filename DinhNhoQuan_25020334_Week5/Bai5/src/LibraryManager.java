import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class LibraryManager {
    private List<Book> listBooks = new ArrayList<>();
    private Map<String, Book> hashMapBooks = new HashMap<>();
    private Map<String, Book> treeMapBooks = new TreeMap<>();

    public void addBook(Book book) {
        listBooks.add(book);
        hashMapBooks.put(book.getId(), book);
        treeMapBooks.put(book.getId(), book);
    }

    public Book findInList(String id) {
        for (Book b : listBooks) {
            if (b.getId().equals(id)) return b;
        }
        return null;
    }

    public Book findInMap(Map<String, Book> map, String id) {
        return map.get(id);     }

    public void removeById(String id) {
        listBooks.removeIf(b -> b.getId().equals(id));
        hashMapBooks.remove(id);
        treeMapBooks.remove(id);
    }

    public void printAll(String type) {
        System.out.println("Danh sach sach (" + type + "): ");
        if (type.equals("ArrayList")) {
            listBooks.forEach(System.out::println);
        } else if (type.equals("HashMap")) {
            hashMapBooks.values().forEach(System.out::println);
        } else {
            treeMapBooks.values().forEach(System.out::println);
        }
    }
}
