

class Library {
    int noOfBooks;
    String[] book;

    Library() {
        this.book = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book) {
        this.book[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added");
    }

    void showAvailableBooks() {
        for (String book : this.book) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(book)) {
                System.out.println("the book has been issued");
                this.book[i] = null;
                return;
            }
        }
        System.out.println("this book is not available");

    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("enjoy your life!");
        centralLibrary.addBook("Java");
        centralLibrary.addBook("Python");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Python");
        centralLibrary.showAvailableBooks();
    }
}