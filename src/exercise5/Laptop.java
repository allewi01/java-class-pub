package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author allewi01
 */
public class Laptop {
    private String manufacturer;
    private double price;
    private String color;
    
    public Laptop (String manufacturer, double price, String color) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }
    
    public String getManufacturer () {
        return this.manufacturer;
    }
    
    public double getPrice () {
        return this.price;
    }
    
    public String getColor () {
        return this.color;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    
    @Override
    public String toString () {
        return this.color + " laptop by " + this.manufacturer + " costs $" + String.format("%.2f", this.price);
    }
}
