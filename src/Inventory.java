import java.time.Year;
import java.util.*;

public class Inventory {

    private final Map<String, Book> books = new HashMap<>();
    
    public void addBook(Book b) {
        books.put(b.getISBN(), b);
        System.out.println("Quantum book store Added: " + b.getTitle());
    }
    public double buyBook(String ISBN, int qty, String email, String address) {
        Book b = books.get(ISBN);
        if (b == null) throw new NoSuchElementException("ISBN not found");
        if (!b.isSellable()) throw new IllegalStateException("Book not for sale");
        b.buy(qty, email, address);
        return b.getPrice() * qty;
    }
    
   public List<Book> removeOutdated(int maxYears) {
    int currentYear = Year.now().getValue();
    List<Book> removedBooks = new ArrayList<>();
    Iterator<Book> iterator = books.values().iterator();

    while (iterator.hasNext()) {
        Book book = iterator.next();
        if (currentYear - book.getYPublished() > maxYears) {
            removedBooks.add(book); 
            iterator.remove();      
        }
    }
    System.out.println("Quantum book store Removed " + removedBooks.size() + " outdated books");
    return removedBooks;
}

}
