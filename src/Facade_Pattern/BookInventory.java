package Facade_Pattern;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {
    private List<Book> books;

    public BookInventory() {
        books = new ArrayList<Book>();
        books.add(new Book("book1", "author"));
    }

    public boolean checkAvailability(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                return true;
            }
        }
        return false;
    }

    public void borrowBook(String bookTitle) {
        System.out.println("Book '" + bookTitle + "' has been borrowed.");
    }

    public void returnBook(String bookTitle) {
        System.out.println("Book '" + bookTitle + "' has been returned.");
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
}