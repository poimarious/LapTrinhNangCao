public class Square extends Shape {
    private int d;
    public Square(int x, int y, int d) {
        super(x, y);
        this.d = d;
    }

    public void erase() {
        System.out.println("Xoa hinh vuong tai " + this);
    }
    public void draw() {
        System.out.println("Ve hinh vuong tai " + this);
    }
}
