package exercise8;

/**
 * Class Item
 *
 * @author allewi01
 */
public abstract class Item {

    protected final long id;
    protected final String title;
    protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return this.quantity > 0;
    }

    public void checkout() {
        if (this.quantity > 0) {
            this.quantity--;
        }
    }

    public void checkin() {
        this.quantity++;
    }

    @Override
    public String toString() {
        if (this.quantity == 1) {
            return "We have a copy of " + this.title;
        }
        return "We have " + this.quantity + " copies of " + this.title;
    }

    public abstract String getInfo();

}
