package LibrarySystemObjectModel;

import java.util.Scanner;

public class ScientificBook extends Book {

    private final String field;



    ScientificBook(String typeOfBook) {
        super(typeOfBook);
        System.out.print("Add scientific field of book: ");
        Scanner sc = new Scanner(System.in);
        String scannedText = sc.nextLine();
        this.field = textFormating(scannedText);

    }

    ScientificBook(String name, String author, Integer numberOfPages, String field){
        super(name,author,numberOfPages);
        this.typeOfBook = "Scientific";
        this.field=field;
    }


    @Override
    public String toString() {
        return "\n Name: " + this.name + " Author: " + this.author + " Number of pages: " + this.numberOfPages + " Type of book: " + this.typeOfBook+ " Scientific field: " + this.field  + " Available: " + (!this.getBorrowed());
    }

}