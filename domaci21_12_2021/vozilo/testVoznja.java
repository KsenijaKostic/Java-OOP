package domaci21_12_2021.vozilo;

public class testVoznja {
    public static void main(String[] args) {

       Automobil auto1 = new Automobil("reno", "niva", 4444467);
            System.out.println(auto1);

        Automobil auto2 = new Automobil("Mercedes", "A class", 12542);
            System.out.println(auto2);

        auto2.setVlasnik3("Kristina");
            System.out.println(auto2);

        auto2.setVlasnik1("Ivana");
        System.out.println(auto2);

        auto2.setVlasnik2("Dragoslav");
        System.out.println(auto2.getVlasnik2());

        auto1.setVlasnik4("Ivica");
        auto1.setVlasnik3("Marica");


        String markaAuta = auto1.getMarka(); //ali ovo ne menja podatke automobila, vec je to samo novi string koji se ponasa kao obican string.
               markaAuta = "Lada";   // marka ne moze da se promeni ako joj nismo napravili setter
        System.out.println(markaAuta);



    }
}
