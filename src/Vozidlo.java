public class Vozidlo {
    protected String znacka;
    protected Integer vykonMotora;
    public Vozidlo(String znacka, Integer vykonMotora){
        this.znacka=znacka;
        this.vykonMotora=vykonMotora;
    }

    void popis(){
        System.out.println("Znacka: "+znacka+" vykon: "+vykonMotora);
    }


}
