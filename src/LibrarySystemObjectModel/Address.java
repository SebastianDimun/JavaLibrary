package LibrarySystemObjectModel;

import java.util.Scanner;


public class Address {
    private String streetName;
    private Integer streetNum;
    private String city;
    private String country;

    public Address() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Street name:");
        String scannedText = sc.nextLine();
        this.streetName = textFormating(scannedText);
        System.out.print("Street number:");
        scannedText = sc.nextLine();
        this.streetNum = Integer.parseInt(scannedText);
        System.out.print("City:");
        scannedText = sc.nextLine();
        this.city = textFormating(scannedText);
        System.out.print("Country:");
        scannedText = sc.nextLine();
        this.country = textFormating(scannedText);
    }
    public Address(String streetName, Integer streetNum, String city, String country) {
        this.streetName=streetName;
        this.streetNum = streetNum;
        this.city = city;
        this.country = country;
    }

    public String textFormating(String text){
//        String firstLetStr = text.substring(0, 1);
//        String remLetStr = text.substring(1);
//        firstLetStr = firstLetStr.toUpperCase();
//        remLetStr = remLetStr.toLowerCase();
        return text;
    }

    @Override
    public  String toString(){
        return "Street name: "+ this.streetName + " Street number: "+ this.streetNum+ " City: "+ this.city + " Country: " + this.country ;
    }


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(Integer streetNum) {
        this.streetNum = streetNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
