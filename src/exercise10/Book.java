package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 *
 * @author allewi01
 */
public class Book {

    final String title;
    final String author;
    Double price;
    final Integer year;

    public Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.year = other.year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.title);
        hash = 61 * hash + Objects.hashCode(this.author);
        hash = 61 * hash + this.year;
        return hash;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.year + ") by " + this.author + " costs $" + String.format("%.2f", this.price);
    }

}

class ByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }

}

class ByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }

}

class ByPrice implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.price.compareTo(o2.price);
    }

}

class ByYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.year.compareTo(o2.year);
    }

}
