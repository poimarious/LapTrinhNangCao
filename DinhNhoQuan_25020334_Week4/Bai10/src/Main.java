import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LibrarySection<Book> books = new LibrarySection<>("Khu vuc Sach");
        LibrarySection<DVD> dvds = new LibrarySection<>("Khu vuc DVD");

        for(int i = 0; i < n; i++) {
            String type = sc.next();
            if(type.equals("B")) books.addItem(new Book(sc.next(), sc.next(), sc.next(), sc.nextInt()));
            else dvds.addItem(new DVD(sc.next(), sc.next(), sc.next(), sc.nextInt()));
        }


        books.show();
        dvds.show();
	}
 }
