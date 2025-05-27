// Exercise 4 - Online Library
// You have to implement a library using Java Class "Library"

// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
import java.util.ArrayList;

class library {

    private ArrayList<String> availableBooks = new ArrayList<>();
    private ArrayList<String> issuedBooks = new ArrayList<>();

    public void addBook(String bookName) {
        availableBooks.add(bookName);
        System.out.println("Books added");

    }

    public void issueBook(String bookName) {
        if (availableBooks.contains(bookName)) {
            availableBooks.remove(bookName);
            issuedBooks.add(bookName);
            System.out.println("Books issued");
        } else {
            System.out.println("book not available");
        }
    }

    public void returnBook(String bookName) {
        if (issuedBooks.contains(bookName)) {
            issuedBooks.remove(bookName);
            availableBooks.add(bookName);
            System.out.println("books returned");
        } else {
            System.out.println("book not returned");
        }

    }

    public void showAvailableBooks() {
        System.out.println("Avaliable books:");
        if (availableBooks.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (String book : availableBooks) {
                System.out.println("-" + book);
            }
        }
    }
}

public class cwh_08_Ex4 {

    public static void main(String[] args) {
        library lib = new library();
        lib.addBook("Java");
        lib.addBook("Data Structure");

        lib.issueBook("Java");

        lib.showAvailableBooks();

        lib.returnBook("Java");
    }

}
