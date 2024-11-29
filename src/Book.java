public class Book {
    
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
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
