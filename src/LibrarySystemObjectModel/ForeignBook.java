package LibrarySystemObjectModel;

import java.util.Scanner;

public class ForeignBook  extends Book{

    private final String language;


    ForeignBook(String typeOfBook){
        super(typeOfBook);
        System.out.print("Add language of book: ");
        Scanner sc = new Scanner(System.in);
        String scannedText = sc.nextLine();
        this.language = textFormating(scannedText);

    }


    ForeignBook(String name, String author, Integer numberOfPages, String language){
        super(name,author,numberOfPages);
        this.typeOfBook = "Foreign";
        this.language=language;
    }


    @Override
    public String toString() {
        return "\nName: " + this.name + " Author: " + this.author + " Number of pages: " + this.numberOfPages + " Type of book: " + this.typeOfBook+ " Language: " + this.language  + " Available: " + (!this.getBorrowed());
    }
}

