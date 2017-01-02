import java.util.Arrays;
import java.util.List;

public class MainLambdasPractice {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Java 8: The best parts", 200, true, 49.95),
            new Book("Web Development with Java", 200, false, 35.00),
            new Book("JUnit Testing", 150, false, 14.95),
            new Book("Java: The next step", 120, false, 14.95),
            new Book("Java: A First Language", 230, true, 24.95)
        );

        // Lambdas Practice

        Advertisement ad = Book.makeAd.apply(books.get(0));         // Function interface
        System.out.println(ad);

        System.out.println(Book.isAvailable.test(books.get(0)));    // Predicate interface

        Book draft = Book.newBookDraft.get();                       // Supplier interface

        Book.impression.accept(books.get(0));                       // Consumer interface

    }

}
