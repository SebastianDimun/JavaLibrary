package LibrarySystemObjectModel;

import java.util.Scanner;

public class ForeignBook  extends Book{

    private  String language;


    ForeignBook(String typeOfBook){
        super(typeOfBook);
        System.out.print("Add language of book: ");
        Scanner sc = new Scanner(System.in);
        String scannedText;

        while (true){
            try {
                scannedText = sc.nextLine();
                if(scannedText.length()<1){
                    System.out.println("Bad input, try write correct  count of pages:");
                }else{
                    this.language = textFormating(scannedText);
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Bad input, try write correct  count of pages:");
            }
        }
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

