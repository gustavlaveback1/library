package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {


    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(10, "Harry Potter", "JK Rowling", "12244", "21", 21);
        Book book2 = new Book(10, "Harry Potter", "JK Rowling", "12244", "21", 21);
        assertEquals(book1, book2);
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Harry Potter", "JK Rowling", "12244", "21", 21);
        Book book2 = new Book(2, "Harry Potter", "JK Rowling", "12244", "21", 21);
        assertNotEquals(book1, book2);
    }

}
