package vezbanjeNaCasu.klase.Putovanje;

import vezbanjeNaCasu.klase.automobil.automobil;
import vezbanjeNaCasu.klase.osoba.osoba;

public class testPutovanje {
    public static void main(String[] args) {

        osoba o1 = new osoba("Perica", "Pericic");
        osoba o2 = new osoba("Petar", "Petrovic");
        osoba o3 = new osoba("Gavra", "Gavrilovic");
        osoba o4 = new osoba("Steva", "Stevic");

        Grad g1 = new Grad("Nis", 500000, "Srbija");
        Grad g2 = new Grad("Berlin", 3000000, "Nemacka");
        Grad g3 = new Grad("Prag", 1000000, "Slovacka");

        automobil a1 = new automobil("Lada", "Rusija", 1999, 200000, 100);
        automobil a2 = new automobil("VW", "Nemacka", 2001, 300000, 50);
        automobil a3 = new automobil("Fiat", "Italija", 1985, 100000, 120);

        Putovanje p1 = new Putovanje(g1,o4,a1, 280);
        Putovanje p2 = new Putovanje(g2, a3, 1000);
        Putovanje p3 = new Putovanje(g2, o2, a2, 2500);

        System.out.println(p1 + "\n");
        System.out.println(p2 + "\n");
        System.out.println(p3 + "\n");

        //deo sa ArrayList
        Putovanje p4 = new Putovanje(g1, o2, a3, 600);

        p1.dodajCoveka(o4);      // dodala sam coveka kao putnika
        System.out.println(p1); //putovanje br 1

        p2.dodajCoveka(o2);
        p2.dodajCoveka(o3); //index 1
        p2.dodajCoveka(o4);
        System.out.println(p2);

        p2.oduzmiCoveka(o3);  //index 1
        System.out.println(p2);


    }

}
