import java.util.*;

public class Book {
    
    private String title;
    private String author;
    private String isbn;
    private List<Rating> rateList;

    public Book(String title, String author, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public void addRating(Rating r) {
        Book bok = new Book(title, author, isbn);
        Rating rate = new Rating(isbn, author, 0);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book: " + title + " Author: " + author + " ISBN: " + isbn;
    }


    
}
