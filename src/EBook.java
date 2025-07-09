public class EBook extends Book {

    private String filetype;

    public EBook(String ISBN, String title, String author, int year, double price, String filetype){
        super(ISBN, title, author, year, price);
        this.filetype = filetype;
    }
    @Override
    public void buy(int qty, String email, String address) {
        if (qty <= 0)throw new IllegalArgumentException("Quantity <= 0");
        deliver(email, address);
        System.out.println("Quantum book store Paid: " + (qty * price));
    }
    @Override
    public void deliver(String email, String address) {
        MailService.send(email);
    }
}
