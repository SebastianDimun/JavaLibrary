package todayProject;

public class Auto extends Vozidlo{

    public Auto(String znacka, Integer pocetPrejdenychKm) {
        super(znacka);
        this.pocetPrejdenychKm = pocetPrejdenychKm;
    }

    private Integer pocetPrejdenychKm;

    @Override
    public void popis(){
        System.out.println("Pocet prejdenych km je "+pocetPrejdenychKm);
    }

    public void popis2(){
        System.out.println("Ja tiez popisujem");
    }
}
