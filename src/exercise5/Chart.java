package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author allewi01
 */
public class Chart {
    private HashMap<Integer, Song> songs = new HashMap<>();
    
    public Chart (String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String[] stuff = scanner.next().split(",");
                this.songs.put(Integer.valueOf(stuff[0]), new Song(stuff[1], stuff[2].substring(0, stuff[2].length() - 1)));
            }
        } catch (Exception ex) {}
    }
    
    public Song getSong (int position) {
        return this.songs.get(position);
    }
}
