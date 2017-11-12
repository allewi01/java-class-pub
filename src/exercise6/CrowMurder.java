package exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class CrowMurder
 *
 * @author allewi01
 */
public class CrowMurder {

    private ArrayList<Crow> murder = new ArrayList();

    public CrowMurder(String filename) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = inputFile.readLine()) != null) {
                if (line.endsWith("Crow")) {
                    String[] stuff = line.split(",");
                    this.murder.add(new Crow(stuff[0], Integer.parseInt(stuff[1])));
                }
            }
        } catch (Exception ex) {
        }
    }

    public int size() {
        return this.murder.size();
    }

    public Crow getChief() {
        Crow oldest = new Crow("", 0);
        for (Crow murder1 : this.murder) {
            if (murder1.getAge() > oldest.getAge()) {
                oldest = murder1;
            }
        }
        return oldest;
    }
}
