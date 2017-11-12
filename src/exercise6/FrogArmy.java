package exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author allewi01
 */
public class FrogArmy {
    
    private ArrayList<Frog> army = new ArrayList();

    public FrogArmy(String filename) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = inputFile.readLine()) != null) {
                if (line.endsWith("Frog")) {
                    String[] stuff = line.split(",");
                    this.army.add(new Frog(stuff[0], Integer.parseInt(stuff[1])));
                }
            }
        } catch (Exception ex) {
        }
    }

    public int size() {
        return this.army.size();
    }

    public Frog getChief() {
        Frog oldest = new Frog("", 0);
        for (Frog army1 : this.army) {
            if (army1.getAge() > oldest.getAge()) {
                oldest = army1;
            }
        }
        return oldest;
    }
}
