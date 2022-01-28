package vezbanjeNaCasu.klase.Kupovina;

import vezbanjeNaCasu.klase.osoba.osoba;

import java.util.ArrayList;

public class Racun {

    private String datum;
    private osoba kupac;
    private osoba prodavac;
    private double iznos;
    private ArrayList<Proizvod> nizKupljenihProizvoda;

    public Racun(String datum, osoba kupac, osoba prodavac) {
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.iznos = 0;
        this.nizKupljenihProizvoda = new ArrayList<>();

    }

    public Racun(String datum, osoba kupac, osoba prodavac, ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
        this.iznos = 0;
        for(Proizvod p : nizKupljenihProizvoda){
            this.iznos = this.iznos + p.getCena();
        }
    }

    /*  private void DaLiJeIznosNegativan(double iznos){
            if (iznos <= 0){
                System.out.println("Cena proizvoda ne moze biti negativna ili jednaka 0");
            } else {
                this.iznos = iznos;
            }
        }*/
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

    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }

    public double getIznos() {
        return iznos;
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
        sb.append("\n");
        sb.append("Datum: ");
        sb.append(datum);
        sb.append("Iznos: ");
        sb.append(iznos);
        sb.append("\n");
        sb.append("Kupljeni proizvodi: ");
        for (Proizvod p : nizKupljenihProizvoda){
            sb.append(p.getNaziv());
            sb.append(", ");
            sb.append(p.getCena());
            sb.append("\n");
        }


        return sb.toString();
    }


    public void dodavanjeNaRacun(Proizvod p) {
        nizKupljenihProizvoda.add(p);
        iznos = iznos + p.getCena();
    }

    public void ukljanjanjeSaRacuna(Proizvod p) {
        boolean uklonjen = nizKupljenihProizvoda.remove(p);
        if (uklonjen == true){
            iznos = iznos - p.getCena();
        } else {
            System.out.println("Proizvoda nema na racunu.");
        }

    }


}
