import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();

        books.add(new Book("Dune", "Frank Herbert", "9780340960196"));
        books.add(new Book("Revan: Star Wars Legends (the Old Republic)", "Drew Karpyshyn", "9780593498934"));
        books.add(new Book("De två tornen", "J. R. R. Tolkien", "9789113084916"));

        for (Book bok : books) {
            System.out.println(bok);
        }
    }
}
