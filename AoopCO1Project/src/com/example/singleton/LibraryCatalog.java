package com.example.singleton;

import java.util.ArrayList;
import java.util.List;

class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<String> books;

    private LibraryCatalog() {
        books = new ArrayList<>();
    }

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void showCatalog() {
        System.out.println("Library Catalog:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}