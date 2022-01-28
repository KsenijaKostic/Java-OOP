package vezbanjeNaCasu.klase.knjiga;


import vezbanjeNaCasu.klase.osoba.osoba;

public class testKnjiga {
    public static void main(String[] args) {
        osoba autor = new osoba("Antoan", "Egziperi");
        osoba vlasnik = new osoba("Pera", "Peric");
        osoba autor2 = new osoba("Ivko", "Ivkovic");
        osoba vlasnik2 = new osoba("Zivko", "Zivkovic");

        Knjiga knjizica = new Knjiga("Mali princ", autor, vlasnik, 5, 2000);
        Knjiga knjiga2 = new Knjiga ("Nefertiti", autor2, 500, 1555);

        System.out.println(knjizica);
        System.out.println(knjiga2);
    }
}
