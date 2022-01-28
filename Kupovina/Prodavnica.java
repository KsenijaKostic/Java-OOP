package vezbanjeNaCasu.klase.Kupovina;

import vezbanjeNaCasu.klase.osoba.osoba;

import java.util.ArrayList;

public class Prodavnica {
    //Napisati klasu Prodavnica koja poseduje sledeca polja/atribute:
    //	Naziv prodavnice (string)
    //	Ulica (string)
    //	Niz zaposlenih (arrayList<Osoba>)
    //	Niz proizvoda na stajanju (arraList<ProizvodNaStajanju>)
    //	Niz obavljenih kupovina (arrayList<Racun>)
    private String nazivPodavnice;
    private String ulica;
    private ArrayList<osoba> nizZaposlenih;
    private ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju;
    private ArrayList<Racun> nizObavljenihKupovina;

    public Prodavnica(String nazivPodavnice, String ulica) {
        this.nazivPodavnice = nazivPodavnice;
        this.ulica = ulica;
        this.nizObavljenihKupovina = new ArrayList<>();
        this.nizZaposlenih = new ArrayList<>();
        this.nizProizvodaNaStajanju = new ArrayList<>();
    }

    // Napisati metodu za dodavanje i uklanjanje zaposlenih.
    public void dodajZaposlenog(osoba x) {
        nizZaposlenih.add(x);
    }

    public void ukloniZaposlenog(osoba y) {
        nizZaposlenih.remove(y);
    }

    //Napisati metodu za dodavanje proizvoda na stajanju, ako proizvod vec postoji na stajaju, samo uvecati kolicinu koja se nalazi na stajanju.
    public void dodajProizvodNaStajanju(ProizvodNaStajanju naziv) {
        boolean postoji = nizProizvodaNaStajanju.contains(naziv);
        if (postoji) {
            for (ProizvodNaStajanju pns : nizProizvodaNaStajanju) {
                if (naziv.equals(pns)) {
                    int novaKolicina = pns.getKolicinaNaStanju() + naziv.getKolicinaNaStanju();
                    pns.setKolicinaNaStanju(novaKolicina);
                }
            }
        } else {
            nizProizvodaNaStajanju.add(naziv);
        }
    }

    public Racun kupovina(osoba kupac, ArrayList<Proizvod> listaZelja){
        Racun r = new Racun("27.12.2021", kupac, nizZaposlenih.get(0), listaZelja);

        for (Proizvod p : listaZelja){              //prva petlja izvlaci proizvod iz liste zelja
            for (ProizvodNaStajanju pns : nizProizvodaNaStajanju){  // druga petlja prolazi kroz klasu ProizvodNaStajanju i tamo je trazi dal ga ima
                if (p.equals(pns.getProizvod())){
                    int novaKolicina = pns.getKolicinaNaStanju() - 1;
                    pns.setKolicinaNaStanju(novaKolicina);
                    break;
                }
            }
        }
        nizObavljenihKupovina.add(r);
        return r;
    }

}
