package com.example.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

public class BookCollectionTest {

    @Test
    public void testAddBook() {
        BookCollection collection = new BookCollection();
        Book book = new Book("Java Programming", "John Doe", "12345");
        collection.addBook(book);
        assertTrue(collection.contains(book));
    }

    @Test
    public void testRemoveBook() {
        BookCollection collection = new BookCollection();
        Book book = new Book("Java Programming", "John Doe", "12345");
        collection.addBook(book);
        collection.removeBook(book);
        assertFalse(collection.contains(book));
    }

    @Test
    public void testIterator() {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Java Programming", "John Doe", "12345"));
        collection.addBook(new Book("Design Patterns", "Gamma et al.", "67890"));

        Iterator<Book> iterator = collection.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Java Programming", iterator.next().getTitle());
    }
}

