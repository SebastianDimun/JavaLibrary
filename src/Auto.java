
public class Auto extends Vozidlo{

    private Integer vykonKlimatizacie;
    Auto(String znacka, Integer vykonMotora, int vykonKlimatizacie){
        super(znacka,vykonMotora);
        this.vykonKlimatizacie=vykonKlimatizacie;
    }

    public void popis(){
        super.popis();
        System.out.println(this.vykonKlimatizacie);
    }


}
