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
            }default -> {
                System.out.println("bad input, you creating standard book");
                newBook = new Book("Standard");
                this.books.add(newBook);
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

        int customerNum;
        while (true){
            try {
                scannedText = sc.nextLine();

                if(scannedText.length()<1){
                    System.out.println("Bad input, try write correct  num:");
                }else{
                    customerNum = Integer.parseInt(scannedText)-1;
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write correct num:");
            }
        }
        System.out.println("You changing customer  "+this.getCustomers().get(customerNum).getFirstName() + " "+this.getCustomers().get(customerNum).getLastName());
        this.getCustomers().get(customerNum).changeAddress();

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
