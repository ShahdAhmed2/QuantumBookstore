public abstract class Book {

    protected String ISBN ,title ,author;
    protected int yPublished;
    protected double price;
    
    public Book(String ISBN, String title, String author,int yPublished, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yPublished = yPublished;
        this.price = price;
    }
    public String getISBN(){ return ISBN; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public int getYPublished(){ return yPublished; }
    public double getPrice(){ return price; }

    public boolean isSellable() { return true; }

    public abstract void buy(int qty, String email, String address);

    public abstract void deliver(String email, String address);
}
