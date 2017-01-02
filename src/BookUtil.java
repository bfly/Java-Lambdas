
public class BookUtil {

    public int bySize(Book b1, Book b2) {               // Reference to a method of a particular object
        return b1.getPages().compareTo(b2.getPages());
    }
}
