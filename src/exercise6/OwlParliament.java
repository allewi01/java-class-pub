package exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class OwlParliament
 * @author allewi01
 */
public class OwlParliament {
    
    private ArrayList<Owl> parliament = new ArrayList();

    public OwlParliament(String filename) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = inputFile.readLine()) != null) {
                if (line.endsWith("Owl")) {
                    String[] stuff = line.split(",");
                    this.parliament.add(new Owl(stuff[0], Integer.parseInt(stuff[1])));
                }
            }
        } catch (Exception ex) {
        }
    }

    public int size() {
        return this.parliament.size();
    }

    public Owl getChief() {
        Owl oldest = new Owl("", 0);
        for (Owl parliament1 : this.parliament) {
            if (parliament1.getAge() > oldest.getAge()) {
                oldest = parliament1;
            }
        }
        return oldest;
    }
}
