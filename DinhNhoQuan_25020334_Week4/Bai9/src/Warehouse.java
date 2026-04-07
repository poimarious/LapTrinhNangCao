import java.util.ArrayList;
import java.util.List;

public class Warehouse<T extends Product>  {
    private String Name;
    private List<T> list;

    public Warehouse(String Name) {
        this.Name = Name;
        list = new ArrayList<>();
    }

    public void addProduct(T p) {
        list.add(p);
    }

    public void show() {
        System.out.println();
        System.out.println(Name + ":");
        for(T p : list) {
            System.out.println(p.getInfo());
        }
    }
}
