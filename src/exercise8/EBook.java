package exercise8;

/**
 * Class EBook MediaLIbrary code 4
 *
 * @author allewi01
 */
public class EBook extends Book {

    private final String format;

    public EBook(String format, String author, int publishingYear, long id, String title) {
        super(author, publishingYear, id, title, 1);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void checkin() {
    }

    @Override
    public void checkout() {
    }

    @Override
    public String getInfo() {
        return this.title + " (" + this.publishingYear + ") by " + this.author + " is available for " + this.format;
    }

}
