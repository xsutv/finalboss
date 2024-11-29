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
        this.rateList.add(r);
        for (Rating rate : rateList) {
            if (rate.getEpost().equals(r.getEpost())) {
                System.out.println("Du kan inte rösta fler gånger på samma bok.");
            } 
        }
        
    }

    // public void addRating(Rating r) {
    //     // for (Rating rat : this.rateList) {
    //         if (r.getEpost().equals(r.getEpost()) && this.isbn.equals(isbn)) {
    //             System.out.println("Du kan endast rösta en gång.");
    //         } else {
    //             rateList.add(r);
    //         }
    //     }
    // // }

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
