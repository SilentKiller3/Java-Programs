package iraj;
import java.util.Scanner;

class Library1{
    String[] books;
    int no_of_books;
    Library1(){
            this.books = new String[100];
            this.no_of_books = 0;
    }

    void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added successfully!");
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println(book + " has been issued successfully!");
                // Set the book to null to "delete" it from the array
                this.books[i] = null;
                return; // Book found and issued, no need to continue the loop
            }
        }
        System.out.println(book + " doesn't exist!");
    }

    void showBooks(){
        System.out.println("Available books are:");
        for (String elements: books) {
            if (elements ==  null){
                continue;
            }
            System.out.println("* " + elements);
        }
    }

    void returnBook(String book){
        addBooks(book);
    }
}

//class Execute{
//    Execute(){
//
//    }
//}

public class myLibraryEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library1 myLibrary = new Library1();
        boolean loop = true;
            System.out.println("What do you want to do??");
            System.out.println("Type and press enter for following things:");
            System.out.println("a = To add books");
            System.out.println("i = To issue books");
            System.out.println("s = To show available books");
            System.out.println("r = To return books");
            System.out.println("e = To exit");
        while(loop) {
            String str = sc.next();
            switch (str) {
                case "a" -> {
                    System.out.println("Enter the name of the book you want to add:");
                    myLibrary.addBooks(sc.next());
                }
                case "i" -> {
                    System.out.println("Enter the name of the book you want to issue:");
                    myLibrary.issueBook(sc.next());
                }
                case "s" -> myLibrary.showBooks();
                case "r" -> {
                    System.out.println("Enter the name of the book you want to return:");
                    myLibrary.returnBook(sc.next());
                }
                case "e" -> loop = false;
                default -> System.out.println("Invalid option!!!");
            }
        }
    }
}
