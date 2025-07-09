public class PaperBook extends Book {

    private int quantity;   
    
    public PaperBook(String ISBN, String title, String author,int year, double price, int quantity){
        super(ISBN, title, author, year, price);
        this.quantity = quantity;
    }
    public int getQuantity(){ return quantity; }
    @Override
    public void buy(int qty, String email, String address) {
        if (qty <= 0)throw new IllegalArgumentException("Quantity <= 0");
        if (quantity < qty)throw new IllegalStateException("Not enough stock");
        quantity -= qty;                          
        deliver(email, address);                     
        System.out.println("Quantum book store Paid: " + (qty * price));
    }
    @Override
    public void deliver(String email, String address) {
        ShippingService.send(address);
    }
}
