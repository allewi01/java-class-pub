package exercise8;

/**
 * Class PaperBook MediaLIbrary code 3
 *
 * @author allewi01
 */
public class PaperBook extends Book {

    private final int pages;
    private String location;

    public PaperBook(int pages, String location, String author, int publishingYear, long id, String title, int quantity) {
        super(author, publishingYear, id, title, quantity);
        this.pages = pages;
        this.location = location;
    }

    public int getPages() {
        return pages;
    }

    public String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    public void move(String newLocation) {
        this.location = newLocation;
    }
    
    @Override
    public String getInfo() {
        return this.title + " (" + this.publishingYear + ") by " + this.author + " is available at " + this.location;
    }

}
