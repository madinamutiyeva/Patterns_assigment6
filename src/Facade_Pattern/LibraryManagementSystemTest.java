package Facade_Pattern;

public class LibraryManagementSystemTest {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();

        libraryFacade.borrowBook("book1", "username", "password");

        libraryFacade.returnBook("book1");

        Book bookByTitle = libraryFacade.searchBookByTitle("book1");
        System.out.println("Book found by title: " + bookByTitle.getTitle() + " by " + bookByTitle.getAuthor());

        Book bookByAuthor = libraryFacade.searchBookByAuthor("author");
        System.out.println("Book found by author: " + bookByAuthor.getTitle() + " by " + bookByAuthor.getAuthor());
    }
}