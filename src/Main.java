import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();

        Book dune = (new Book("Dune", "Frank Herbert", "9780340960196"));
        Book strwrs =(new Book("Revan: Star Wars Legends (the Old Republic)", "Drew Karpyshyn", "9780593498934"));
        // books.add(new Book("De två tornen", "J. R. R. Tolkien", "9789113084916"));

        books.add(dune);
        books.add(strwrs);

        for (Book bok : books) {
            System.out.println(bok);
        }

        Rating duneRate = new Rating("hai", "hai@gmail.com", 5, dune);
        dune.addRating(duneRate);

        Rating duneRate3 = new Rating("hai", "billy@gmail.com", 5, dune);
        dune.addRating(duneRate3);

        Rating duneRate2 = new Rating("hai", "hai@gmail.com", 5, dune);
        dune.addRating(duneRate2);

        

        System.out.println("Dessa böcker finns med i listan: " + dune.getRateList());
        // // System.out.println();
    }
}
