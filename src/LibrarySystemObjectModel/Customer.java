package LibrarySystemObjectModel;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private Scanner sc = new Scanner(System.in);
    private String scannedText;
    private ArrayList<Book> borrowedBooks;
    private Library library;


    Customer(Library library) {
        System.out.print("You are creating new customer, how you wish to name him? Name:");

        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write correct name:");
                }else{
                    this.firstName = textFormating(scannedText);
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write correct name:");
            }
        }
        this.library = library;
        System.out.print("Surname:");

        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write correct last name:");
                }else{
                    this.lastName = textFormating(scannedText);
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write correct last name:");
            }
        }
        this.address = new Address();
        this.borrowedBooks = new ArrayList<Book>();
        System.out.println("Customer " + this.firstName + " was successful created. " + address.toString());

    }
    Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address("Kovalska",4,"Kosice","Slovakia");
        this.borrowedBooks = new ArrayList<Book>();
        System.out.println("Customer " + this.firstName + " was successful created. " + address.toString());
    }

    public String textFormating(String text){
//        String firstLetStr = text.substring(0, 1);
//        String remLetStr = text.substring(1);
//        firstLetStr = firstLetStr.toUpperCase();
//        remLetStr = remLetStr.toLowerCase();
        return text;
    }

    public void changeAddress(){
        System.out.println("You are changing address of customer: "+this.firstName +" " + this.lastName);
        System.out.println("New street name: ");

        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write correct address:");
                }else{
                    address.setStreetName(scannedText);
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write correct address:");
            }
        }
        System.out.println("New street number: ");
        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write street num:");
                }else{
                    address.setStreetNum(Integer.parseInt(scannedText));
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write street num:");
            }
        }
        System.out.println("New city: ");
        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write city:");
                }else{
                    address.setCity(scannedText);
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write city :");
            }
        }
        System.out.println("New country: ");
        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write country:");
                }else{
                    address.setCountry(scannedText);
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write country :");
            }
        }

        System.out.println("The new addres of customer "+this.firstName +" " + this.lastName+ "is: " + address.toString());
    }



    @Override
    public  String toString(){
        return "\n Name: "+this.firstName + " Surname: " + this.lastName + "\n Address: " +address.toString() + "\nBorrowed books: " +this.borrowedBooks ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
