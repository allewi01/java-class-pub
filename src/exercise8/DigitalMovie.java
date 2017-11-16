package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie MediaLIbrary code 2
 *
 * @author allewi01
 */
public class DigitalMovie extends Movie {

    private String service;

    public DigitalMovie(String service, String director, int releaseYear, long id, String title) {
        super(director, releaseYear, id, title, 1);
        this.service = service;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public void checkin() {
    }

    @Override
    public void checkout() {
    }

    @Override
    public String getInfo() {
        return this.title + " (" + this.releaseYear + ") by " + this.director + " is available via " + this.service;
    }

}
