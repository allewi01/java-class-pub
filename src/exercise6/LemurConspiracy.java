package exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class LemurConspiracy
 * @author allewi01
 */
public class LemurConspiracy {
    
    private ArrayList<Lemur> conspiracy = new ArrayList();

    public LemurConspiracy(String filename) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = inputFile.readLine()) != null) {
                if (line.endsWith("Lemur")) {
                    String[] stuff = line.split(",");
                    this.conspiracy.add(new Lemur(stuff[0], Integer.parseInt(stuff[1])));
                }
            }
        } catch (Exception ex) {
        }
    }

    public int size() {
        return this.conspiracy.size();
    }

    public Lemur getChief() {
        Lemur oldest = new Lemur("", 0);
        for (Lemur conspiracy1 : this.conspiracy) {
            if (conspiracy1.getAge() >= oldest.getAge()) {
                oldest = conspiracy1;
            }
        }
        return oldest;
    }
}
