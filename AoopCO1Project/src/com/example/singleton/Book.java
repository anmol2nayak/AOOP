package com.example.singleton;

public class Book {
	 private String title;
	    private String author;
	    private String isbn;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    public String getTitle() {
	        return title;
	    }

	    // Equals and hashCode methods to allow proper comparison
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Book book = (Book) obj;
	        return isbn.equals(book.isbn);
	    }

	    @Override
	    public int hashCode() {
	        return isbn.hashCode();
	    }

}
