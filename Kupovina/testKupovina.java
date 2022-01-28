package vezbanjeNaCasu.klase.Kupovina;

import vezbanjeNaCasu.klase.osoba.osoba;

import java.util.ArrayList;

public class testKupovina {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod("Mleko", 100, 1000);
        ProizvodNaStajanju pns1 = new ProizvodNaStajanju(p1, 10);

        Proizvod p2 = new Proizvod("Secer", 80, 1000);
        ProizvodNaStajanju pns2 = new ProizvodNaStajanju(p2, 100);

        Proizvod p3 = new Proizvod("Brasno", 70, 1000);
        ProizvodNaStajanju pns3 = new ProizvodNaStajanju(p3, 5);

        osoba o1 = new osoba("Petar", "Zivkovic");
        osoba o2 = new osoba("Maja", "Ivkovic");

        //I nacin
        Racun r1 = new Racun("24.12.2021.", o1, o2);


        Prodavnica prodavnica1 = new Prodavnica("Maxi", "Autoput");

        prodavnica1.dodajZaposlenog(o1);
        prodavnica1.dodajProizvodNaStajanju(pns1);
        prodavnica1.dodajProizvodNaStajanju(pns2);
        prodavnica1.dodajProizvodNaStajanju(pns3);

        ArrayList<Proizvod> listaZelja = new ArrayList<Proizvod>();
        listaZelja.add(p1);
        listaZelja.add(p2);





     /*   r1.dodavanjeNaRacun(p1);
        System.out.println(r1);

        r1.dodavanjeNaRacun(p3);
        System.out.println(r1);

        r1.dodavanjeNaRacun(p2);
        r1.dodavanjeNaRacun(p2);
        System.out.println(r1);
        r1.ukljanjanjeSaRacuna(p2);
        System.out.println(r1);


        r1.ukljanjanjeSaRacuna(p1);
        System.out.println(r1);

        r1.ukljanjanjeSaRacuna(p1);
        System.out.println(r1);
*/




    }
}
