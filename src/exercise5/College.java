package exercise5;

/**
 * Class College
 * Task 5: Create a class College with the following private data members: String name, int rank. Implement setter method for the rank.
 * @author allewi01
 */
public class College {
    private String name;
    private int rank;
    
    public College (String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    
    public String getName () {
        return this.name;
    }
    
    public int getRank () {
        return this.rank;
    }
    
    public void setRank (int rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString () {
        return this.name + " is ranked #" + this.rank;
    }
}
