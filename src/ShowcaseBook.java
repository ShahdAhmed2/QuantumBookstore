public class ShowcaseBook extends Book {

    public ShowcaseBook(String ISBN, String title, String author,int year, double price){
        super(ISBN, title, author, year, price);
    }
    @Override
    public boolean isSellable(){ return false; }
    @Override
    public void buy(int qty, String email, String address) {
        throw new UnsupportedOperationException("not for sale");
    }
    @Override
    public void deliver(String email, String address) {}
}
