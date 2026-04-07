public class Electronic extends Product {
    public int warrantyMonth;
    public Electronic(String id, String name, int warrantyMonth) {
        super(id, name);
        this.warrantyMonth = warrantyMonth;
    }

    @Override 
    public String getInfo() {
        return name + " - " + warrantyMonth + " thang bao hanh"; 
    }
}
