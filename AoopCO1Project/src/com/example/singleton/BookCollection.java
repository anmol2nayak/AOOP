package com.example.singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BookCollection implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}