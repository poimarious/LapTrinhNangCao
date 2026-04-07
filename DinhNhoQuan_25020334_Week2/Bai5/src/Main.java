public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("Book1", "Poi", 40000);
		Book book2 = new Book("Book1", "Poi", 40000);

		System.out.println(book1.equals(book2));
		System.out.println(book1 == book2);
		/*
		khác nhau:
		book1.equals(book2): so sánh các attributes trong 2 objects này
		book1 == book2: sẽ kiểm tra hai vùng nhớ này có giống nhau hay không
		*/
	}
}