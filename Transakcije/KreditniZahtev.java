package VezbanjeOOP.Transakcije;

public class KreditniZahtev extends ZahtevZaTransfer {
        private Datum pocetakOtplate;
        private Datum krajOtplate;

    public KreditniZahtev(Racun racunPrimaoca, Racun racunUplatioca, Datum datumPodnesenjaZahteva, double iznos, Datum pocetakOtplate, Datum krajOtplate) {
        super(racunPrimaoca, racunUplatioca, datumPodnesenjaZahteva, iznos);
        this.pocetakOtplate = pocetakOtplate;
        this.krajOtplate = krajOtplate;
    }

    public Datum getPocetakOtplate() {
        return pocetakOtplate;
    }

    public void setPocetakOtplate(Datum pocetakOtplate) {
        this.pocetakOtplate = pocetakOtplate;
    }

    public Datum getKrajOtplate() {
        return krajOtplate;
    }

    public void setKrajOtplate(Datum krajOtplate) {
        this.krajOtplate = krajOtplate;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Kredit (").append(id).append(") ");
        return sb.toString();
    }


    @Override
    public boolean izvrsiZahtev() {
        //nadjacati metodu izvrsiZahtev, ova metoda skida <iznos> sa racuna uplatioca ako je to moguce(ako uplatilac ima dovoljno sredstava),
        // i uplacuje <iznos> umanjen za kamatu koja iznosi 5% na racun primaoca. Metoda vraca true ako je zahtev izvrsen, false ako nije.
        boolean proveri = true;
        double provizija = (iznos * 5)/100;
        if ((iznos + provizija) > racunUplatioca.getStanje()){
            racunUplatioca.skini((iznos + provizija));
            racunPrimaoca.uplati((iznos - provizija));
            proveri = true;
        } else {
            proveri = false;
        }

        return proveri;
    }
}
