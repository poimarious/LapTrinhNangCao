public class Book {
	private String title;
	private String author;
	private double price;

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public boolean equals(Book b) {
		return (this.title == b.title && this.author == b.author && this.price == b.price);
	}
}