package pl.sda.mini_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.sda.mini_project.books.Book;
import pl.sda.mini_project.books.BookType;

import java.util.*;
import java.util.stream.Collectors;

public class BooksManager {
    /**
     * 1. (zadanie z loggera) Dodaj do wszystkich metod klasy pl.sda.mini_project.BooksManager szczegółową informację (poziom DEBUG) o wykonaniu
     */
    private Logger logger = LoggerFactory.getLogger(BooksManager.class);
    private List<Book> books;

    public BooksManager() {
        books = createBooks();
        /**
         * 3. (zadanie z loggera) Dodaj do klasy z pkt 1 logowanie informacji zaraz po tym jak klasa zostanie zainicjalizowana w konstruktorze.
         */
        logger.debug("BooksManager object initialized successfully");
    }

    public List<Book> findBooks() {
        logger.debug("Fetched all books");
        return books;
    }

    public void addBook(String author, String title, BookType type) {
        Book book = new Book(author, title, type);
        books.add(book);
        logger.debug("Book added: {}", book);
    }

    public boolean deleteBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == bookId) {
                books.remove(book);
                logger.debug("Book deleted, id: {}", bookId);
                return true;
            }
        }

        /**
         * 2. (zadanie z loggera) Dodaj do klasy z pkt 1 logowanie błędu gdy user próbuje usunąć książkę której id nie ma na liście.
         */
        logger.error("Book not deleted, can't find id: {}", bookId);
        return false;
    }

    public List<Book> getSortedByAuthor() {
        List<Book> byAuthors = new ArrayList<>(books);
        byAuthors.sort(Comparator.comparing(Book::getAuthor));
        logger.debug("Fetched all books - sorted by authors");
        return byAuthors;
    }

    public List<Book> getSortedByType() {
        List<Book> byTypes = new ArrayList<>(books);
        byTypes.sort(Comparator.comparing(Book::getType).thenComparing(Book::getAuthor));
        logger.debug("Fetched all books - sorted by type");
        return byTypes;
    }

    /**
     * 5. Dodaj kod do metody pl.sda.mini_project.BooksManager.getAuthors()
     *    tak żeby zwracała zbiór autorów (imię i nazwisko jako String) posortowanych alfabetycznie.
     */
    public Set<String> getAuthors() {
        logger.debug("Fetched all authors - sorted by name");
        return books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     * 6. Dodaj kod do metody BooksManager.getAuthorsBooks() tak żeby zwracała mapę gdzie kluczem jest autor (imię i nazwisko jako String),
     *    a wartością lista książek (obiekty klasy Book) tego autora znajdujących się w bibliotece.
     */
    public Map<String, List<Book>> getAuthorsBooks() {
        logger.debug("Fetched authors - books map");
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
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