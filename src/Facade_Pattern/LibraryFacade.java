package Facade_Pattern;

public class LibraryFacade {
    private BookInventory bookInventory;
    private UserManagement userManagement;

    public LibraryFacade() {
        this.bookInventory = new BookInventory();
        this.userManagement = new UserManagement();
    }

    public void borrowBook(String bookTitle, String username, String password) {
        if (userManagement.authenticateUser(username, password)) {
            if (bookInventory.checkAvailability(bookTitle)) {
                bookInventory.borrowBook(bookTitle);
                System.out.println(bookTitle + " has been borrowed successfully.");
            } else {
                System.out.println(bookTitle + " is not available.");
            }
        } else {
            System.out.println("Authentication failed.");
        }
    }
    public void returnBook(String bookTitle) {
        bookInventory.returnBook(bookTitle);
        System.out.println(bookTitle + " has been returned.");
    }

    public Book searchBookByTitle(String title) {
        return bookInventory.searchBookByTitle(title);
    }

    public Book searchBookByAuthor(String author) {
        return bookInventory.searchBookByAuthor(author);
    }
}
