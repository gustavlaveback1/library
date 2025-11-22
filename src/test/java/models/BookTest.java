package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {


    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(10, "Harry Potter", "JK Rowling", "12244", "21", 21);
        Book book2 = new Book(10, "Harry Potter", "JK Rowling", "12244", "21", 21);
        assertEquals(book1.getTitle(), book2.getTitle());
        assertEquals(book1.getAuthor(), book2.getAuthor());
        assertEquals(book1.getIsbn(), book2.getIsbn());
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(10, "Harry Potter", "JK Rowling", "12244", "21", 21);
        Book book2 = new Book(10, "Sagan om ringen", "JRR Tolkien", "12244", "21", 21);
        assertNotEquals(book1.getTitle(), book2.getTitle());
        assertNotEquals(book1.getAuthor(), book2.getAuthor());
    }

}
