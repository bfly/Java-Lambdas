import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Book {
    private String title;
    private Integer pages;
    private Boolean available;
    private Double price;

    public Book() {};

    public Book(String title, Integer pages, Boolean available, Double price) {
        this.title = title;
        this.pages = pages;
        this.available = available;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", available=" + available +
                ", price=" + price +
                '}';
    }

    public static Comparator<Book> byPrice = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
    };

    // Funtional Interfaces

    public static Function<Book, Advertisement> makeAd = b -> new Advertisement(b);     // Function interface
    public static Predicate<Book> isAvailable = b -> b.getAvailable();                  // Predicate interface
    public static Supplier<Book> newBookDraft = () -> new Book();                       // Supplier interface
    public static Consumer<Book> impression = b -> System.out.println("Very good impressions about the :" + b); // Consumer interface

    // Lambdas Composition

    public static Predicate<Book> getIsAvailableAndCheap = isAvailable.and(b -> b.getPrice() < 30.00);

    // Method References

    public void shortInfo() {                   // Reference to a method of a particular type
        System.out.println("Short info about the " + getTitle());
    }

    public static Book discount(Book b) {       // Reference to a static method
        b.price = 10.00;
        return b;
    }

}
