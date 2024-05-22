package school_library_task5_library_service;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {
    private Librarian librarian;

    @BeforeEach
    public void setUp() {
        librarian = new Librarian();
    }

    @Test
    public void testGetBooks_NotNull() {
        assertNotNull(librarian.getBooks(), "The list of books should not be null.");
    }

    @Test
    public void testGetBooks_InitiallyEmpty() {
        assertTrue(librarian.getBooks().isEmpty(), "The list of books should be initially empty.");
    }
    @Test
    public void testGetBooks_ReturnsCorrectList() {
        Books book1 = new Books("Title1", "Author1",4);
        Books book2 = new Books("Title2", "Author2",4);

        librarian.updateBookInventory(book1);
        librarian.updateBookInventory(book2);

        ArrayList<Books> books = librarian.getBooks();

        assertEquals(2, books.size(), "The list of books should contain 2 books.");
        assertTrue(books.contains(book1), "The list should contain the first book.");
        assertTrue(books.contains(book2), "The list should contain the second book.");
    }

    @Test
    public void testGetBooks_Modification() {
        ArrayList<Books> books = librarian.getBooks();
        Books book = new Books("Title3", "Author3",3);
        books.add(book);

        assertFalse(librarian.getBooks().contains(book), "Modifying the returned list should not affect the original list.");
    }
    @org.junit.jupiter.api.Test
    void updateBookInventory() {
        Books books = new Books("Sample Book","Vesiri",2);

    }

    @org.junit.jupiter.api.Test
    void getBooks() {
    }
}