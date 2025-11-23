package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;


	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}
	//G
	@Test
	public void testAddABook() {
        Book book1 = new Book(10, "Harry Potter", "JK Rowling", "12244", "21", 21);
	    bc.addBook(book1);
    }

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
        Book found = bc.findBook(book1.getTitle());
        assertNotNull(found);
        assertEquals(book1.getTitle(), found.getTitle());
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException{
        Book found = bc.findBook("LEARNING JAVA");
        assertNotNull(found);
        assertEquals(book1.getTitle(), found.getTitle());
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book found = bc.findBook("             Learning Java            ");
        assertNotNull(found);
        assertEquals(book1.getTitle(), found.getTitle());
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
