import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLambdasInGeneral {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Java 8; The best parts", 200, true, 49.95),
            new Book("Web Development with Java", 200, false, 35.00),
            new Book("JUnit Testing", 150, false, 14.95),
            new Book("Java: The next step", 120, false, 14.95),
            new Book("Java: A First Language", 230, true, 24.95)
        );

        // We want to get all available books sorted by pages ascending

        /*
        List<Book> availableSortedByPriceAscBooks = new ArrayList<>();

        for (Book book: books) {
            if (book.getAvailable()) availableSortedByPriceAscBooks.add(book);      // Load available books
        }

        availableSortedByPriceAscBooks.sort(Book.byPrice);                          // Sort available books by price
        for (Book book:availableSortedByPriceAscBooks) System.out.println(book); }  // Print sorted available books
        */

        // Using lambdas takes only three lines
        books.stream()
            .filter((Book b) -> b.getAvailable())
            .sorted(Comparator.comparing(Book::getPrice))
            .forEach((Book b) -> System.out.println(b));
    } // main
}  // MainLambdasInGeneral
