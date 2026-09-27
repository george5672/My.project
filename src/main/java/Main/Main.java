package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Кобзар", "Тарас Шевченко");
        Book book2 = new Book("Захар Беркут", "Іван Франко");
        Book book3 = new Book("Тіні забутих предків", "Михайло Коцюбинський");

        System.out.println(" Додавання книг");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Кількість книг у бібліотеці: " + library.getBookCount());
        printLibraryBooks(library);

        System.out.println("\n--- Видалення книги (Захар Беркут) ---");
        boolean isRemoved = library.removeBook(book2);
        System.out.println("Чи успішно видалено? " + isRemoved);

        System.out.println("Кількість книг після видалення: " + library.getBookCount());
        printLibraryBooks(library);

        System.out.println("\n--- Тестування помилкових даних ---");
        try {
            library.addBook(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Зловлено виняток при додаванні null: " + e.getMessage());
        }

        boolean removeNullResult = library.removeBook(null);
        System.out.println("Результат видалення null-книги: " + removeNullResult);
    }

    private static void printLibraryBooks(Library library) {
        System.out.println("Список книг у бібліотеці:");
        List<Book> books = library.getBooks();
        if (books.isEmpty()) {
            System.out.println("  (Бібліотека порожня)");
        } else {

            books.forEach(book -> System.out.println("  -> " + book));
        }
    }
}


class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    public boolean removeBook(Book book) {
        if (book == null) {
            return false;
        }
        return books.remove(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public int getBookCount() {
        return books.size();
    }
}


class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}