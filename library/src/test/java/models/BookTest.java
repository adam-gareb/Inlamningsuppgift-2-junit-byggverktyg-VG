package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;

class BookTest {

    Book book1 = new Book(123, "The Great Book", "James Kennedy", "321-123-1929", "Branch", 598);
    Book book2 = new Book(123, "The Great Book", "James Kennedy", "321-123-1929", "Branch", 598);
    Book book3 = new Book(321, "The Greatest Book", "Jordan Cordon", "192-569-8827", "The Branch", 119);

	//G
	@Test
	public void test2EqualBooks() {
//        Book book = new Book("")
        assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
        assertNotEquals(book1, book3);
	}

}
