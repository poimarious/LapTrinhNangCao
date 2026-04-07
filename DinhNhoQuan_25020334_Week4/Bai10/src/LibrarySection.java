import java.util.ArrayList;
import java.util.List;

public class LibrarySection<T extends MediaItem> {
    private String name;
    private List<T > list;
    public LibrarySection(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void addItem(T item) {
        list.add(item);
    }

    public void show() {
        System.out.println();
        System.out.println(name + ":");
        for(T item : list) {
            System.out.println(item.getInfo());
        }
    }
}
