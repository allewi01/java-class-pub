package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author allewi01
 */
public class Company {
    private String name;
    private double stockPrice;
    
    public Company (String name, double stockPrice) {
        this.name = name;
        this.stockPrice = stockPrice;
    }
    
    public String getName () {
        return this.name;
    }
    
    public double getStockPrice () {
        return this.stockPrice;
    }
    
    public void setStockPrice (double stockPrice) {
        this.stockPrice = stockPrice;
    }
    
    @Override
    public String toString () {
        return this.name + " trading at $" + String.format("%.2f", this.stockPrice);
    }
}
