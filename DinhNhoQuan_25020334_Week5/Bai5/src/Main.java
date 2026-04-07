public class Main {
    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();

        lib.addBook(new Book("B05", "Java Core", "James Gosling", 1995));
        lib.addBook(new Book("B01", "Clean Code", "Robert Martin", 2008));
        lib.addBook(new Book("B03", "Design Patterns", "Gang of Four", 1994));
        lib.addBook(new Book("B02", "Effective Java", "Joshua Bloch", 2001));
        lib.addBook(new Book("B04", "Algorithms", "Robert Sedgewick", 2011));

        lib.printAll("ArrayList");
        lib.printAll("HashMap");
        lib.printAll("TreeMap");

        System.out.println("Tim sach B03: " + lib.findInList("B03"));
        lib.removeById("B02");
        System.out.println("Sau khi xoa B02:");
        lib.printAll("TreeMap");
    }
}
