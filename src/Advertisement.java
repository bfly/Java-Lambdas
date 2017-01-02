
public class Advertisement {

    private String content = "Very interesting review of the:";
    private Book  book = null;

    public Advertisement(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "content='" + content + '\'' +
                ", book=" + book +
                '}';
    }
}
