import java.util.List;
import java.util.ArrayList;


public class Folder extends FileSystemItem {

    public List<FileSystemItem> child = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(FileSystemItem item) {
        item.setParent(this);
        child.add(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Folder: " + name);
        for(FileSystemItem item : child) {
            item.print(indent + "  ");
        }
    }

}
