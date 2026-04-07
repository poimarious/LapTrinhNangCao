public class Circle extends Shape {
    private int r;    
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public void draw() {
        System.out.println("Ve hinh tron tai " + this);
    }
    public void erase() {
        System.out.println("Xoa hinh tron tai " + this);
    }
    
}
