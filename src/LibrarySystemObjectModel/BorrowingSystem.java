package LibrarySystemObjectModel;

import java.util.Scanner;

public class BorrowingSystem {
    private Library library;
    private Scanner sc = new Scanner(System.in);
    private String scannedText;
    BorrowingSystem(Library library ){
        this.library = library;

    }


    public void borrowBook() {
        for (int i = 0; i < library.getCustomers().size(); i++) {
            System.out.println("\nCustomer num: " + (i + 1) + library.getCustomers().get(i));
        }

        System.out.println("\nYou are borrowing book from library, select number of customer in lib system who want to borrow a book");
        this.scannedText = sc.nextLine();//-1
        Customer customer =this.library.getCustomer(Integer.parseInt(this.scannedText)-1);//-1

        for (int i = 0; i < library.getAvailableBooks().size(); i++) {
            System.out.println("Book num : " + (i + 1) + library.getBooks().get(i));
        }
        System.out.println("Select number from available books to borrow");
        this.scannedText = sc.nextLine();
        Book book = this.library.getAvailableBook(Integer.parseInt(this.scannedText)-1);
        for (Book b:this.library.getBooks()){
            if(b.name.equals(book.name) ){
                if(customer.getBorrowedBooks().size()<3 ){
                    b.setBorrowed(true);
                    customer.getBorrowedBooks().add(b);
                    this.library.getAvailableBooks().remove(book);
                }
                }
        }
    }

    public void returnBook(){
        for (int i = 0; i < library.getCustomers().size(); i++) {
            System.out.println("\nCustomer num: " + (i + 1) + library.getCustomers().get(i));
        }

        System.out.println("\nYou are returning book from library, select number of customer in lib system who want to return a book");
        this.scannedText = sc.nextLine();//-1
        Customer customer =this.library.getCustomer(Integer.parseInt(this.scannedText)-1);//-1

        for (int i = 0; i < customer.getBorrowedBooks().size(); i++) {
            System.out.println("Borrowed book num : " + (i + 1) + customer.getBorrowedBooks().get(i));
        }
        System.out.println("Select number from borrowed books to return");
        this.scannedText = sc.nextLine();
        Book book = customer.getBorrowedBooks().get(Integer.parseInt(this.scannedText) - 1);
        for (Book b:this.library.getBooks()){
            if(b.name.equals(book.name) ){
                if(customer.getBorrowedBooks().size()<3 ){
                    b.setBorrowed(false);
                    customer.getBorrowedBooks().remove(b);
                    this.library.getAvailableBooks().add(book);
                }
            }
        }
    }
}
