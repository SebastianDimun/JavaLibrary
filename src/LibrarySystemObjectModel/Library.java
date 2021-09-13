package LibrarySystemObjectModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Customer> customers;
    private ArrayList<Book> availableBooks;
    private int scannedInt;
    private String scannedText;
    private Scanner sc = new Scanner(System.in);


    Library() {
        this.books = new ArrayList<Book>();
        this.customers = new ArrayList<Customer>();
        this.availableBooks = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addBook() {
        System.out.println("1 - Create standard book");
        System.out.println("2 - Create scientific book");
        System.out.println("3 - Create foreign book");
        scannedInt = sc.nextInt();
        Book newBook;
        switch (scannedInt) {
            case 1 -> {
                newBook = new Book("Standard");
                this.books.add(newBook);
                break;
            }
            case 2 -> {
                newBook = new ScientificBook("Scientific");
                this.books.add(newBook);
                break;
            }
            case 3 -> {
                newBook = new ForeignBook("Foreign");
                this.books.add(newBook);
                break;
            }
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;

    }

    public Customer getCustomer(Integer i) {
        return customers.get(i);
    }


    public void changeAddres(){
        for (int i = 0; i < this.getCustomers().size(); i++) {
            System.out.println("Customer num: " + (i + 1) + this.getCustomers().get(i));
        }
        System.out.println("Select number of customer");
        scannedText = sc.nextLine();
        int customerNum = Integer.parseInt(scannedText)-1;
        System.out.println("You changing customer  "+this.getCustomers().get(customerNum).getFirstName() + " "+this.getCustomers().get(customerNum).getLastName());

        System.out.println("Set customer street name");
        scannedText = sc.nextLine();
        this.getCustomers().get(customerNum).getAddress().setStreetName(scannedText);

        System.out.println("Set customer street num");
        scannedText = sc.nextLine();
        this.getCustomers().get(customerNum).getAddress().setStreetNum(Integer.parseInt(scannedText));

        System.out.println("Set customer city");
        scannedText = sc.nextLine();
        this.getCustomers().get(customerNum).getAddress().setCity(scannedText);

        System.out.println("Set customer country");
        scannedText = sc.nextLine();
        this.getCustomers().get(customerNum).getAddress().setCountry(scannedText);
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public ArrayList<Book> getAvailableBooks() {
        this.availableBooks.clear();
        for (Book b : this.books) {
            if (!b.getBorrowed())
                this.availableBooks.add(b);
        }
        return this.availableBooks;
    }

    public Book getAvailableBook(Integer i) {
        return this.books.get(i);
    }

    @Override
    public String toString() {
        return "Library" +
                "books:" + books +
                "customers:" + customers +
                "availableBooks:" + availableBooks;
    }
}
