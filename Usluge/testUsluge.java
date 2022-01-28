package VezbanjeOOP.Usluge;

public class testUsluge {
    public static void main(String[] args) {
        try {
            Broj b1 = new Broj("12", "456", "789456", true);
            Broj b2 = new Broj("12", "456", "789456", true);
            Broj b3 = new Broj("45", "456", "789456", true);
            Broj b4 = new Broj("12", "456", "789456", false);

            Korisnik k1 = new Korisnik(b1);
            Korisnik k2 = new Korisnik(b2);
            Korisnik k3 = new Korisnik(b3);

            Poruka p1 = new Poruka(b1, b2, "poruka");
            Poruka p2 = new Poruka(b2, b3, "poruka1");
            Poruka p3 = new Poruka(b3, b4, "poruka2");

            Poziv po1 = new Poziv(b1, b2, 256);
            Poziv po2 = new Poziv(b2, b3, 45);
            Poziv po3 = new Poziv(b3, b4, 120);

            k1.dodajUslugu(p1);
            k1.dodajUslugu(po1);
            k1.dodajUslugu(p2);
            k1.dodajUslugu(po2);
            k1.dodajUslugu(po3);
            k1.dodajUslugu(p3);

            System.out.println(k1);
            System.out.println("Ukupna cena razgovora i poruka je: " + k1.ukupnaCena());

        } catch (Exception e) {
            e.getMessage();
        }



    }
}
