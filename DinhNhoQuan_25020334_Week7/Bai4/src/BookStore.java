import java.util.concurrent.locks.*;
import java.util.Map;
import java.util.HashMap;

public class BookStore {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private Map<String, Integer> stock;

    public BookStore() {
        stock = new HashMap<>();
    }

    public Integer getStock(String title) {
        rwLock.readLock().lock();
        try {
            System.out.println("[GETSTOCK] title: " + title);
            return stock.get(title);
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public void addBook(String title, int qty) {
        rwLock.writeLock().lock();
        try {
            stock.put(title, qty);
            System.out.println("[ADDBOOK] title: " + title + " - qty: " + qty);
        } finally {
            rwLock.writeLock().unlock();
        }
    }
    
    public void borrow(String title, int qty) {
        rwLock.writeLock().lock();
        try {
            int nQty = stock.get(title);
            System.out.println(nQty);
            if(nQty < qty) {
                System.out.println("[BORROW] ERROR!");
                return;
            }
            stock.put(title, nQty - qty);
            System.out.println("[BORROWs] title: " + title + " - qty: " + qty);
        } finally {
            rwLock.writeLock().lock();
        }
    }
}
