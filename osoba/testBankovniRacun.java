package vezbanjeNaCasu.klase.osoba;

import vezbanjeNaCasu.ArreyListe.banka.BankovniRacun;

public class testBankovniRacun {
    public static void main(String[] args) {

        osoba persona1 = new osoba("Ivan", "Peric", 1111, 1111);
        osoba persona2 = new osoba("Pera", "Micic", 2222, 144);

        BankovniRacun br1 = new BankovniRacun(persona1);
        BankovniRacun br2 = new BankovniRacun(1000, persona2);

        System.out.println(br1);
        System.out.println(br2);

        br1.uplata(2000);
        System.out.println(br1);
        br1.isplata(1000);
        System.out.println(br1);

        br2.isplata(320);
        System.out.println(br2);

    }
}
