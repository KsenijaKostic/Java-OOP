package VezbanjeOOP.Transakcije;

public class Uplatnica extends ZahtevZaTransfer {
    private String svrhaUplate;

    public Uplatnica(Racun racunPrimaoca, Racun racunUplatioca, Datum datumPodnesenjaZahteva, double iznos, String svrhaUplate) {
        super(racunPrimaoca, racunUplatioca, datumPodnesenjaZahteva, iznos);
        this.svrhaUplate = svrhaUplate;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    @Override
    public boolean izvrsiZahtev() {
        //nadjacati metodu izvrsiZahtev, ova metoda skida <iznos> i proviziju koja iznosi 1% od <iznos>-a sa racuna uplatioca
        // ako je to moguce(ako uplatilac ima dovoljno sredstava),
        // i uplacuje <iznos> (ne i proviziju!) na racun primaoca.
        // Metoda vraca true ako je zahtev izvrsen, false ako nije.

        boolean proveri = true;
        double provizija = (iznos * 1) / 100;
      //  double suma = racunPrimaoca.getStanje();
        if (racunUplatioca.getStanje() > (iznos + provizija)){
            racunUplatioca.skini((iznos + provizija));
            racunPrimaoca.uplati(iznos);
            proveri = true;
        } else {
            proveri = false;
        }

        return proveri;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Uplatnica ").append("( ").append(id).append(") ").append(datumPodnesenjaZahteva.toString()).append(" ");
        sb.append(iznos).append(" [").append((iznos*1)/100).append(" ] Svrha uplate je: ").append(svrhaUplate);
        return sb.toString();
    }
}
