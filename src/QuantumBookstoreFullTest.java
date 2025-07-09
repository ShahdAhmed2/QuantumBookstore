public class QuantumBookstoreFullTest {

    public static void main(String[] args) {

        Inventory inv = new Inventory();
        inv.addBook(new PaperBook("101", "Python Course", "Ali",
                                  2012, 150.0, 3));

        inv.addBook(new EBook("202", "Clean Code", "Shahd",
                              2020, 200.0, "PDF"));

        inv.addBook(new ShowcaseBook("303", "Java Course", "Unknown",
                                     1946, 0.0));

        System.out.println("------------------------------------------------------------");

        inv.buyBook("101", 2, "y@y.com", "October");
        inv.buyBook("202", 1, "s@s.com", "");
        try {
            inv.buyBook("303", 1, "g@g.com", "Nowhere");
        } catch (Exception ex) {
            System.out.println("Quantum book store : Error: " + ex.getMessage());
        }
        
        inv.removeOutdated(10);
    }
}
