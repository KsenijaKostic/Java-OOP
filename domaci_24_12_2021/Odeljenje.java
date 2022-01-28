package domaci_24_12_2021;

import java.util.ArrayList;

public class Odeljenje {
    //Napisati klasu Odeljenje koja ima sledeca polja:
    //	- String oznaka
    //	- ArrayList dnevnik

    private String oznakaOdeljenja;
    private ArrayList<Ucenik> nizDnevnik;


    //Napisati 2 konstruktora, opet na isti nacin.
    public Odeljenje(String oznakaOdeljenja, ArrayList<Ucenik> nizDnevnik) {
        this.oznakaOdeljenja = oznakaOdeljenja;
        this.nizDnevnik = nizDnevnik;
    }

    public Odeljenje(String oznakaOdeljenja) {
        this.oznakaOdeljenja = oznakaOdeljenja;
        this.nizDnevnik = new ArrayList<>();
    }

    //Napisati gettere i settere za sva polja.
    public String getOznakaOdeljenja() {
        return oznakaOdeljenja;
    }

    public void setOznakaOdeljenja(String oznakaOdeljenja) {
        this.oznakaOdeljenja = oznakaOdeljenja;
    }

    public ArrayList<Ucenik> getNizDnevnik() {
        return nizDnevnik;
    }

    public void setNizDnevnik(ArrayList<Ucenik> nizDnevnik) {
        this.nizDnevnik = nizDnevnik;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznakaOdeljenja);
        sb.append(" odeljenje ima djake: \n");
        for (int i = 0; i < nizDnevnik.size(); i++) {
            sb.append(nizDnevnik.get(i).getIme());
            sb.append(" ");
            sb.append(nizDnevnik.get(i).getPrezime());
            sb.append("\n");
        }
        return sb.toString();
    }

    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisUcenika(Ucenik u) {
        nizDnevnik.add(u);
    }

    //Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    public void upisUcenika(Ucenik u, int redniBroj) {
        nizDnevnik.add(redniBroj, u);

    /*    for (int i = 0; i < nizDnevnik.size(); i++) { // ovo ne radi, i volela bih da znam kako da ga napravim da radi
            if ( == redniBroj && u.equals(u.getIme()) && u.equals(u.getPrezime())) {
                System.out.println("Na rednom broju vec postoji ucenik, ne mozete ga upisati na to mesto");
                break;
            }
            if (i != redniBroj && !u.equals(u.getIme()) && !u.equals(u.getPrezime())) {
                nizDnevnik.add(redniBroj, u);
            }
        }*/
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public void ispisUcenika(Ucenik u) {
        nizDnevnik.remove(u);
    }

    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public void ispisUcenika(int i) {
        nizDnevnik.remove(i);
    }

    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene(Ucenik u) {
        if (u.getNizOcena().isEmpty()) {
            System.out.println("Ucenik jos uvek nema ocene");
        } else {
            System.out.println(u.getNizOcena());
        }
    }

    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int i) {
        if (nizDnevnik.get(i).getNizOcena().isEmpty()) {
            System.out.println("Ucenik jos uvek nema ocene");
        } else {
            System.out.println(nizDnevnik.get(i).getNizOcena());
        }
    }

    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());
    }

    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public void prosecnaOcena(int i) {
        System.out.println(nizDnevnik.get(i).prosek());
    }

    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    public double prosecnaOcenaOdeljenja() {
        double suma = 0;
        if (nizDnevnik.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < nizDnevnik.size(); i++) {
                suma = suma + nizDnevnik.get(i).prosek();
            }
            return suma / nizDnevnik.size();
        }
    }

    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    //	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
    //	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
    //	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
    //	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
    //	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu

    public void opisnaOcena(Ucenik u) {
        if (u.prosek() > 4.5) {
            System.out.println("Odlican \n");
        } else if (u.prosek() > 3.5) {
            System.out.println("Vrlo dobar \n");
        } else if (u.prosek() > 2.5) {
            System.out.println("Dobar \n");
        } else if (u.prosek() > 1.5) {
            System.out.println("Dovoljan \n");
        } else if (u.prosek() < 1.5) {
            System.out.println("Nedovoljan \n");
        }

    }

    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //  - {ime} i {prezime} ima ocene:
    //  - {ocene}
    //za sve ucenike.

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nizDnevnik.size(); i++) {
            sb.append(nizDnevnik.get(i).getIme());
            sb.append(" ");
            sb.append(nizDnevnik.get(i).getPrezime());
            sb.append(" ima ocene \n");
            nizDnevnik.get(i).getNizOcena();
            sb.append(nizDnevnik.get(i).getNizOcena());
            sb.append("\n");
        }

        return sb.toString();
    }

    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15
    public String velicinaOdeljenja() {
        String poruka;
        if (nizDnevnik.size() == 0) {
            poruka = "Nema ucenika u odeljenju \n";
        } else if (nizDnevnik.size() < 15) {
            poruka = "Malo odeljenje \n";
        } else if (nizDnevnik.size() < 25) {
            poruka = "Srednje odeljenje \n";
        } else {
            poruka = "Veliko odeljenje \n";
        }
        return poruka;
    }


}
