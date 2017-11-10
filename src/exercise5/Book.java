package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author allewi01
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle () {
        return this.title;
    }
    
    public String getAuthor () {
        return this.author;
    }
    
    public double getPrice () {
        return this.price;
    }
    
    @Override
    public String toString () {
        return this.title + " by " + this.author + " costs " + this.price;
    }
}
