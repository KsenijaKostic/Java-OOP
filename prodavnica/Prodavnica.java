package VezbanjeOOP.prodavnica;

import vezbanjeNaCasu.klase.osoba.osoba;

import java.util.ArrayList;

public class Prodavnica {
    private String naziv;
    private String ulica;
    private ArrayList<osoba> nizZaposlenih;
    private ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju;
    private ArrayList<Racun> nizObavljenihKupovina;

    public Prodavnica(String naziv, String ulica) {
        this.naziv = naziv;
        this.ulica = ulica;
        this.nizZaposlenih = new ArrayList<>();
        this.nizProizvodaNaStajanju = new ArrayList<>();
        this.nizObavljenihKupovina = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public ArrayList<osoba> getNizZaposlenih() {
        return nizZaposlenih;
    }

    public void setNizZaposlenih(ArrayList<osoba> nizZaposlenih) {
        this.nizZaposlenih = nizZaposlenih;
    }

    public ArrayList<ProizvodNaStajanju> getNizProizvodaNaStajanju() {
        return nizProizvodaNaStajanju;
    }

    public void setNizProizvodaNaStajanju(ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju) {
        this.nizProizvodaNaStajanju = nizProizvodaNaStajanju;
    }

    public ArrayList<Racun> getNizObavljenihKupovina() {
        return nizObavljenihKupovina;
    }

    public void setNizObavljenihKupovina(ArrayList<Racun> nizObavljenihKupovina) {
        this.nizObavljenihKupovina = nizObavljenihKupovina;
    }

    //Napisati metodu za dodavanje i uklanjanje zaposlenih.
    public void dodajZaposlenog(osoba o) {
        boolean dodaj = nizZaposlenih.add(o);
        if (dodaj == true) {
            nizZaposlenih.add(o);
        } else {
            System.out.println("Ova osoba je vec zaposlena u ovoj prodavnici. \n");
        }
    }

    public void ukloniZaposlenog(osoba o) {
        boolean ukloni = nizZaposlenih.remove(o);
        if (ukloni == true) {
            nizZaposlenih.remove(o);
        } else {
            System.out.println("Ova osoba nije zaposlena u ovoj prodavnici. \n");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv prodavnice: ");
        sb.append(naziv);
        sb.append("\n");

        sb.append("Ulica: ");
        sb.append(ulica);
        sb.append("\n");

        for (osoba o : nizZaposlenih) {
            sb.append(o.getIme());
            sb.append(" ");
            sb.append(o.getPrezime());
            sb.append("\n");
        }
        for (ProizvodNaStajanju pns : nizProizvodaNaStajanju) {
            sb.append(pns.getProizvod());
            sb.append(", ");
            sb.append(pns.getKolicinaNaStajanju());
            sb.append("\n");
        }

        return sb.toString();
    }

    //Napisati metodu za dodavanje proizvoda na stajanju, ako proizvod vec postoji na stajaju, samo uvecati kolicinu koja se nalazi na stajanju.
    public void dodajProizvod(ProizvodNaStajanju pns) {
        if (nizProizvodaNaStajanju.contains(pns)) { //ako proizvod na stajanju postoji
            for (ProizvodNaStajanju x : nizProizvodaNaStajanju) {  //prolazi se kroz ceo niz da se nadje odredjeni PNS koji smo mu zadali
                if (x.equals(pns)) {              //x = pns
                    int novaKolicina = x.getKolicinaNaStajanju() + pns.getKolicinaNaStajanju(); //onda uvecaj kolicinu na novu kolicinu
                    pns.setKolicinaNaStajanju(novaKolicina);     //setovati novu kolicinu kako bi se ona updejtovala!
                }
            }
        } else {
            nizProizvodaNaStajanju.add(pns);
        }
    }

    //Napisati metodu koja prima osobu i niz proizvoda koje ta osoba zeli da kupi i vraca kreirani racun.
    public Racun kupovina(osoba x, ArrayList<Proizvod> nizZeljenihProizvoda) {
        Racun r1 = new Racun(nizZeljenihProizvoda, "22.22.22", x, nizZaposlenih.get(0));

        for (Proizvod p : nizZeljenihProizvoda) {
            for (ProizvodNaStajanju pns : nizProizvodaNaStajanju) {
                if (pns.equals(p)) {
                    int novaKolicina = pns.getKolicinaNaStajanju() - 1;
                    pns.setKolicinaNaStajanju(novaKolicina);
                    break;
                }
            }
        }
        nizObavljenihKupovina.add(r1);

        return r1;
    }
}


