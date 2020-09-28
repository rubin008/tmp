
    public class Kniga {
    private String isbn;
    private  String title ;
    private String author ;
    private String publisher ;
    private int yearOfIssue;
    private int numberOfPages;
    private long price;
    boolean isInUse;

    public Kniga(String isbn, String title, String author, String publisher, int yearOfIssue, int numberOfPages, long price, boolean isInUse) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfIssue = yearOfIssue;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.isInUse = isInUse;
    }

        @Override
        public String toString() {
            return "Kniga{" +
                    "isbn='" + isbn + '\'' +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", yearOfIssue=" + yearOfIssue +
                    ", numberOfPages=" + numberOfPages +
                    ", price=" + price +
                    ", isInUse=" + isInUse +
                    '}';
        }
    }
