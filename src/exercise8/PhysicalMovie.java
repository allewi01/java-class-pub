package exercise8;

/**
 * Class PhysicalMovie MediaLIbrary code 1
 *
 * @author allewi01
 */
public class PhysicalMovie extends Movie {

    private final String medium;
    private String location;

    public PhysicalMovie(String medium, String location, String director, int releaseYear, long id, String title, int quantity) {
        super(director, releaseYear, id, title, quantity);
        this.medium = medium;
        this.location = location;
    }

    public String getMedium() {
        return medium;
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
        return this.title + " (" + this.releaseYear + ") by " + this.director + " is located at " + this.location;
    }

}
