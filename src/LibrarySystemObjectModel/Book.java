package LibrarySystemObjectModel;

import java.util.Scanner;

public class Book {
    protected String name;
    protected String author;
    protected Integer numberOfPages;
    protected String typeOfBook;
    private Boolean borrowed;



    public Book(String typeOfBook){
        System.out.print("You are creating a book, how you wish to name it? Name:");
        Scanner sc = new Scanner(System.in);
        String scannedText = sc.nextLine();
        this.name = textFormating(scannedText);

        System.out.print("Your book is named, who is the author of the book? Write a first name of author: ");
        scannedText = sc.nextLine();
        this.author = textFormating(scannedText);

        System.out.print("How many pages the book has?: ");
        scannedText = sc.nextLine();
        this.numberOfPages = Integer.parseInt(scannedText);

        this.typeOfBook = textFormating(typeOfBook);
        this.borrowed = false;
        if (typeOfBook.equals("Standard"))
            System.out.println("Book " + this.name +" was successful added.");
    }

    public  String textFormating(String text){
//        String firstLetStr = text.substring(0, 1);
//        String remLetStr = text.substring(1);
//        firstLetStr = firstLetStr.toUpperCase();
//        remLetStr = remLetStr.toLowerCase();
        return text;
    }



    Book(String name, String author, Integer numberOfPages){
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.typeOfBook = "Standard";
        this.borrowed = false;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }


    @Override
    public  String toString(){

            return " \n Name: "+this.name + " Author: " + this.author + " Number of pages: " + this.numberOfPages + " Type of book: " + this.typeOfBook + " Available: " + (!this.borrowed);
    }
}
