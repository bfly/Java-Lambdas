import java.util.Arrays;
import java.util.List;

public class MainLambdasComposition {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Java 8; The best parts", 200, true, 49.95),
            new Book("Web Development with Java", 200, false, 35.00),
            new Book("JUnit Testing", 150, false, 14.95),
            new Book("Java: The next step", 120, false, 14.95),
            new Book("Java: A First Language", 230, true, 24.95),
            new Book("Scala Introduction", 119, true, 19.95),
            new Book("Groovy: How to stop it?", 50, true, 9.95),
            new Book("Spring framework examples", 410, true, 50.00)
        );

        books.stream().filter(Book.getIsAvailableAndCheap).forEach(System.out::println);    // Composite function

    }

}
