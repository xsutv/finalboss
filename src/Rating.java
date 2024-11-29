public class Rating {
    
    private String alias;
    private String  epost;
    private int rate;
    private Book book;
    
        public Rating(String alias, String epost, int rate, Book book) {
            this.alias = alias;
            this.epost = epost;
            this.rate = rate;
            this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public String getAlias() {
        return alias;
    }

    public String getEpost() {
        return epost;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Rating [alias=" + alias + ", epost=" + epost + ", rate=" + rate + "]";
    }

    
}
