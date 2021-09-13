package LibrarySystemObjectModel;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static void printConsoleInterface() {
        System.out.println("1 - Add new book");
        System.out.println("2 - Add new customer");

        System.out.println("3 - Change addres of the customer");
        System.out.println("4 - List of all books");

        System.out.println("5 - List of all customers");
        System.out.println("6 - List all available books for borrowing");

        System.out.println("7 - Borrow the book");
        System.out.println("8 - Return the book from customer");

        System.out.println("0 - Exit program");

    }

    public static void main(String[] args) {
        Library library = new Library();
        BorrowingSystem borrowingSystem = new BorrowingSystem(library);
        Book book = new Book("harryPotter", "Rowling", 300);
        Book scientificBook = new ScientificBook("Fyzika", "Einstein", 300, "physic");
        Book foreignBook = new ForeignBook("ForeignBook", "Eugen", 300, "English");
        library.addBook(book);
        library.addBook(scientificBook);
        library.addBook(foreignBook);
        Customer customer1 = new Customer("Jozi", "Duda");
        Customer customer2 = new Customer("Feri", "Meter");
        Customer customer3 = new Customer("Janci", "Kladivo");
        library.addCustomer(customer1);
        library.addCustomer(customer2);
        library.addCustomer(customer3);
        boolean programRunning = true;

        Book newBook;
        Customer newCustomer;
        Integer scannedInt;
        String scannedText;

        while (programRunning) {
            printConsoleInterface();
            scannedInt = sc.nextInt();
            switch (scannedInt) {
                case 1: {
                    library.addBook();
                    break;

                }
                case 2: {
                    newCustomer = new Customer(library);
                    library.addCustomer(newCustomer);
                    break;
                }
                case 3: {
                    library.changeAddres();
                    break;
                }
                case 4: {
                    for (int i = 0; i < library.getBooks().size(); i++) {
                        System.out.println("Book num : " + (i + 1) + library.getBooks().get(i));
                    }
                    break;
                }
                case 5: {
                    for (int i = 0; i < library.getCustomers().size(); i++) {
                        System.out.println("Customer num: " + (i + 1) + library.getCustomers().get(i));
                    }
                    break;
                }
                case 6: {
                    for (int i = 0; i < library.getAvailableBooks().size(); i++) {
                        System.out.println("Book num : " + (i + 1) + library.getBooks().get(i));
                    }
                    break;
                }
                case 7: {
                    borrowingSystem.borrowBook();
                    break;
                }
                case 8: {
                    borrowingSystem.returnBook();
                    break;

                }
                case 0: {
                    programRunning = false;
                    break;
                }
                default:
                    System.out.println("Bad input");

            }

        }


//        Book book = new Book("Standard");
//        Book bookS1 = new ScientificBook("Scientific");
//        Book bookF1 = new ForeignBook("Foreign");
//        System.out.println(book.toString());
//        System.out.println(bookS1.toString());
//        System.out.println(bookF1.toString());


//        Customer customer = new Customer();
//        Customer customer2 = new Customer();
//        library.addCustomer(customer);
//        library.addCustomer(customer2);
//        System.out.println(library.getCustomers());
//        Book book = new ForeignBook("foreign");
//        Book book2 = new Book ("standard");
//        library.addBook(book);
//        library.addBook(book2);

//        borrowingSystem.borrowBook();

//        System.out.println(library.getBooks());
//        System.out.println(library.getAvailableBooks());
//        System.out.println(library.toString());
//        System.out.println(customer);


    }

}
