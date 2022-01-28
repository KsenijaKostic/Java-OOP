package VezbanjeOOP.Transakcije_2;

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

    public void dodajZahtev(ZahtevZaTransfer zt){
        nizZahteva.add(zt);
    }

    public void izvrsiPrviZahtev(){
        ZahtevZaTransfer zt = nizZahteva.get(0);

        nizZahteva.remove(0);

        boolean izvrsi = zt.izvrsiZahtev();
        if (izvrsi == false){
            System.out.println("Ne moze da se izvrsi");
        }
    }

}
