package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 *
 * @author allewi01
 */
public class BookShop {

    ArrayList<Book> catalog;

    public BookShop() {
        this.catalog = new ArrayList();
    }

    public BookShop(String filename) throws FileNotFoundException {
        this();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                String[] lineContent = line.split(",");
                this.catalog.add(new Book(lineContent[0], lineContent[1], Double.parseDouble(lineContent[2]), Integer.parseInt(lineContent[3])));
            }
        } catch (IOException ex) {
            Logger.getLogger(BookShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BookShop(BookShop other) {
        this();
        for (Book book : other.catalog) {
            this.catalog.add(new Book(book));
        }
    }

    public void addNewTitle(Book book) {
        this.catalog.add(book);
    }

    public int size() {
        return this.catalog.size();
    }

    public void discountAll(Double discountPercent) {
        for (Book book : this.catalog) {
            book.setPrice((100.0 - discountPercent) / 100.0 * book.getPrice());
        }
    }

    public void printCatalog() {
        for (Book book : this.catalog) {
            System.out.println(book);
        }
    }

    public void order(Comparator<Book> comp) {
        Collections.sort(this.catalog, comp);
    }

    public ArrayList<Book> getCatalog() {
        return this.catalog;
    }

}
