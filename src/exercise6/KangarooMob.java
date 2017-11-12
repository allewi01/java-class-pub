package exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class KangarooMob
 *
 * @author allewi01
 */
public class KangarooMob {

    private ArrayList<Kangaroo> mob = new ArrayList();

    public KangarooMob(String filename) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = inputFile.readLine()) != null) {
                if (line.endsWith("Kangaroo")) {
                    String[] stuff = line.split(",");
                    this.mob.add(new Kangaroo(stuff[0], Integer.parseInt(stuff[1])));
                }
            }
        } catch (Exception ex) {
        }
    }

    public int size() {
        return this.mob.size();
    }

    public Kangaroo getChief() {
        Kangaroo oldest = new Kangaroo("", 0);
        for (Kangaroo mob1 : this.mob) {
            if (mob1.getAge() > oldest.getAge()) {
                oldest = mob1;
            }
        }
        return oldest;
    }
}
