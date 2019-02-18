package pl.sda.mini_project;

import java.util.*;

public class BooksManager {
    private List<Book> books;

    public BooksManager() {
        books = createBooks();
    }

    public List<Book> findBooks() {
        return books;
    }

    public void addBook(String author, String title, BookType type) {
        Book book = new Book(author, title, type);
        books.add(book);
    }

    public boolean deleteBook(int bookId) {
        for (int i = 0; i< books.size(); i++) {
            Book book = books.get(i);
            if(book.getId() == bookId) {
                books.remove(book);
                return true;
            }
        }

        return false;
    }

    public List<Book> getSortedByAuthor() {
        List<Book> byAuthors = new ArrayList<>(books);
        byAuthors.sort(Comparator.comparing(Book::getAuthor));
        return byAuthors;
    }

    public List<Book> getSortedByType() {
        List<Book> byTypes = new ArrayList<>(books);
        byTypes.sort(Comparator.comparing(Book::getType).thenComparing(Book::getAuthor));
        return byTypes;
    }

    public Set<String> getAuthors() {
        return new HashSet<>();
    }

    public Map<String, List<Book>> getAuthorsBooks() {
        return new HashMap<>();

    }

    private List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Henryk Sienkiewicz", "Ogniem i mieczem", BookType.HISTORICAL));
        books.add(new Book("Juliusz Słowacki", "Balladyna", BookType.DRAMA));
        books.add(new Book("Agatha Cristie", "Morderstwo w Orient Expressie", BookType.DETECTIVE_STORY));
        books.add(new Book("Agatha Cristie", "Śmierć na Nilu", BookType.DETECTIVE_STORY));
        books.add(new Book("Juliusz Słowacki", "Oda do wolności", BookType.POETRY));
        books.add(new Book("Henryk Sienkiewicz", "Quo vadis", BookType.HISTORICAL));
        books.add(new Book("Norman Davies", "Boże igrzysko. Historia Polski", BookType.HISTORICAL));

        return books;
    }
}