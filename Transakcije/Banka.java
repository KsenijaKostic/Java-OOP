package VezbanjeOOP.Transakcije;

import java.util.ArrayList;

public class Banka {
    private String naziv;
    private Racun racun;
    private ArrayList<ZahtevZaTransfer> nizZahteva;

    public Banka(String naziv, Racun racun) {
        this.naziv = naziv;
        this.racun = racun;
        this.nizZahteva = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public ArrayList<ZahtevZaTransfer> getNizZahteva() {
        return nizZahteva;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv banke: ").append(naziv).append("\n");
        sb.append("Lista zahteva na cekanju: \n");
        for (ZahtevZaTransfer zt : nizZahteva){
            sb.append(zt.toString()).append("\n");

        }
        return sb.toString();
    }

    public void dodajZahtev(ZahtevZaTransfer zt){
        nizZahteva.add(zt);
    }

    public void izvrsiZahtev(){
        ZahtevZaTransfer zt = nizZahteva.get(0); //uzima prvi zahtev iz niza

        nizZahteva.remove(0);  //ovde ga uklanja

        boolean izvrsen = zt.izvrsiZahtev(); //ako ga izvrsi onda je uklonjen/true
        if (izvrsen == false){ //ako nije uklonjen onda je false
            System.out.println("Nije moguce izvrsiti zahtev: ");
            System.out.println(zt);
        }
    }
}
