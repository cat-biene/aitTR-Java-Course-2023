package homework.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] book;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(10);
        book = new Book[4];
        book[0] = new Book(100, "Agata Cristi", "Detective", 1920);
        book[1] = new Book(101, "Agata Cristi", "Detective", 1922);
        book[2] = new Book(102, "Agata Cristi", "Detective", 1923);
        book[3] = new Book(103, "Agata Cristi", "Detective", 1924);

        System.out.println("=====================List====================");
        for (int i = 0; i < book.length; i++) {
            library.addBook(book[i]);

        }
        System.out.println();
    }

    @Test
    void addBook() {
        assertFalse(library.addBook(new Book(101, "Agata Cristi", "Detective", 1922)));
        assertFalse(library.addBook(null));
    }

    @Test
    void removeBook() {
        library.printBook();
        assertEquals(book[1], library.removeBook(101));
        assertEquals(3, library.quantity());
        System.out.println();
        library.printBook();
        assertEquals(book[3], library.removeBook(103));
        assertEquals(2, library.quantity());
        System.out.println();
        library.printBook();
        assertNull(library.removeBook(101));
        assertNull(library.removeBook(103));
        assertNull(library.findBook(101));
        assertNull(library.findBook(103));
    }

    @Test
    void findBook() {
        library.printBook();
        assertEquals(book[1], library.findBook(101));
        assertEquals(book[3], library.findBook(103));
        assertNull(library.findBook(105));
    }

    @Test
    void quantity() {
        library.printBook();
        assertEquals(4, library.quantity());
    }

    @Test
    void printBook() {
        library.printBook();
    }
}
