package com.example.singleton;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryCatalog catalog = LibraryCatalog.getInstance();
        catalog.addBook("Design Patterns");
        catalog.addBook("Java Concurrency in Practice");
        catalog.showCatalog();
    }
}
