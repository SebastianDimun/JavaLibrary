package todayProject;

public class MainClass {

    public static void main(String[] args) {

        Vozidlo v = new Vozidlo("Mercedes");
        v.popis();
        Auto a = new Auto("Mercedes", 10000);
        a.popis();

        Vozidlo va = new Auto("BMW",20000);
        va.popis();


    }
}
