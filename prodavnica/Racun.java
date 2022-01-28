package VezbanjeOOP.prodavnica;

import VezbanjeOOP.prodavnica.Proizvod;
import vezbanjeNaCasu.klase.osoba.osoba;

import java.util.ArrayList;

public class Racun {
    private ArrayList<Proizvod> nizKupljenihProizvoda;
    private String datum;
    private osoba kupac;
    private osoba prodavac;
    private double iznos;   //iznos mora da se poveca ili smanji ako se proizvod doda ili ukloni sa racuna

    public Racun(ArrayList<Proizvod> nizKupljenihProizvoda, String datum, osoba kupac, osoba prodavac) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;

        this.iznos = 0; // iznos postavljamo na 0, jer je na pocetku racuna iznos 0
        for (Proizvod proizvod : nizKupljenihProizvoda){ // kako dodajemo proizvode na racun
            this.iznos = this.iznos + proizvod.getCenaProizvoda();   //iznos se poveca za cenu proizvoda
        }
    }

    public Racun(String datum, osoba kupac, osoba prodavac) {
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.nizKupljenihProizvoda = new ArrayList<>();
        this.iznos = 0;
    }

    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public osoba getKupac() {
        return kupac;
    }

    public void setKupac(osoba kupac) {
        this.kupac = kupac;
    }

    public osoba getProdavac() {
        return prodavac;
    }

    public void setProdavac(osoba prodavac) {
        this.prodavac = prodavac;
    }

    public double getIznos() {
        return iznos;
    }

    public void dodajProizvodNaRacun(Proizvod pro){  //ako se proizvod doda iznos mora da se uveca za cenu proizvoda
        nizKupljenihProizvoda.add(pro);
        iznos = iznos + pro.getCenaProizvoda();
    }

    public void ukloniProizvodSaRacuna(Proizvod p){   // ako se proizvod
        boolean uklonjen = nizKupljenihProizvoda.remove(p);
        if (uklonjen == true){
            iznos = iznos - p.getCenaProizvoda();
        } else {
            System.out.println("Proizvod nije na racunu");
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Kupac: ");
        sb.append(kupac.getIme());
        sb.append(" ");
        sb.append(kupac.getPrezime());
        sb.append("\n");
        sb.append("Prodavac: ");
        sb.append(prodavac.getIme());
        sb.append(" ");
        sb.append(prodavac.getPrezime());
        sb.append("Datum: ");
        sb.append(datum);
        sb.append("Iznos: ");
        sb.append(iznos);
        sb.append("Kupljeni proizvodi: ");
        for (Proizvod p : nizKupljenihProizvoda){
            sb.append(p.getNazivProizvoda());
            sb.append(", ");
            sb.append(p.getCenaProizvoda());
            sb.append("\n");
        }
        return sb.toString();
    }

}
