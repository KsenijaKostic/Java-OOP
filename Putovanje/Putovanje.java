package vezbanjeNaCasu.klase.Putovanje;

import vezbanjeNaCasu.klase.automobil.automobil;
import vezbanjeNaCasu.klase.osoba.osoba;

import java.util.ArrayList;

public class Putovanje {

    private Grad destinacija;
    private osoba vodjaPuta;
    private automobil vozilo;
    private double udaljenostuKm;
    private ArrayList<osoba> nizPrijavljenihOsoba;

    private void daLiJeUdaljenostNegativan(double udaljenostuKm) {
        if (udaljenostuKm < 0) {
            System.out.println("Uneli ste negativne kilometre");
        } else {
            this.udaljenostuKm = udaljenostuKm;
        }
    }

    public Putovanje(Grad destinacija, osoba vodjaPuta, automobil vozilo, double udaljenostuKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        daLiJeUdaljenostNegativan(udaljenostuKm);
        this.nizPrijavljenihOsoba = new ArrayList<osoba>();
    }

    public Putovanje(Grad destinacija, automobil vozilo, double udaljenostuKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        daLiJeUdaljenostNegativan(udaljenostuKm);
        this.nizPrijavljenihOsoba = new ArrayList<osoba>();

    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostuKm() {
        return udaljenostuKm;
    }

    public void setUdaljenostuKm(double udaljenostuKm) {
        daLiJeUdaljenostNegativan(udaljenostuKm);
    }

    public ArrayList<osoba> getNizPrijavljenihOsoba() {
        return nizPrijavljenihOsoba;
    }

    public void setNizPrijavljenihOsoba(ArrayList<osoba> nizPrijavljenihOsoba) {
        this.nizPrijavljenihOsoba = nizPrijavljenihOsoba;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ");
        sb.append(destinacija.getImeGrada());
        sb.append(", ");
        sb.append(destinacija.getDrzava());
        sb.append("\n");

        if (vodjaPuta == null) {
            sb.append("Vodja puta ne postoji \n");
        } else {
            sb.append("Vodja puta je: ");
            sb.append(vodjaPuta.getIme());
            sb.append(" ");
            sb.append(vodjaPuta.getPrezime());
            sb.append("\n");
        }
        sb.append("Putuje se automobilom: ");
        sb.append(vozilo.getMarka());
        sb.append(", ");
        sb.append(vozilo.getGodinaProizvodnje());
        sb.append(", ");
        sb.append(vozilo.getKilometraza());
        sb.append("\n");

        sb.append("Udaljenost do destinacije: ");
        sb.append(udaljenostuKm);
        sb.append("\n");

        sb.append("Vreme potrebno da se stigne do odabranog grada ako vozimo prosecnom brzinom od ");
        sb.append(vozilo.getProsecnaBrzina());
        sb.append(" km/h, je ");
        sb.append(potrebnoVremedoDestinacije(vozilo.getProsecnaBrzina()));
        sb.append(" sati.");
        sb.append("\n");

        sb.append("Na put idu \n");
        for (osoba osoba1 : nizPrijavljenihOsoba) {
            sb.append(osoba1.getIme());
            sb.append(" ");
            sb.append(osoba1.getPrezime());
            sb.append("\n");

        }

        return sb.toString();
    }

    public void dodajCoveka(osoba b) {
        nizPrijavljenihOsoba.add(b);
    }

    public void oduzmiCoveka(osoba c) {
        nizPrijavljenihOsoba.remove(c);
    }
    //napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri odredjenoj prosecnoj brzini.
    // Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce biti prosecna brzina automobila,
    // a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto bude vozio tom prosecnom brzinom.

    public double potrebnoVremedoDestinacije(double prosecnaBrzina) {
        double vreme = udaljenostuKm / prosecnaBrzina;
        return vreme;
    }

}
