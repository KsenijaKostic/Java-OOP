package VezbanjeOOP.Transakcije_2;

public class KreditniZahtec extends ZahtevZaTransfer {
        private Datum pocetakOtplate;
        private Datum krajOtplate;

    public KreditniZahtec(Racun primaoc, Racun uplatioc, Datum datumPodnosenjaZahteva, double iznos, Datum pocetakOtplate, Datum krajOtplate) {
        super(primaoc, uplatioc, datumPodnosenjaZahteva, iznos);
        this.pocetakOtplate = pocetakOtplate;
        this.krajOtplate = krajOtplate;
    }

    @Override
    public boolean izvrsiZahtev() {
        boolean proveri;
        double provizija = iznos*5/100;
        if (uplatioc.getStanje() > iznos + provizija){
            uplatioc.skini(iznos+provizija);
            primaoc.uplati(iznos-provizija);
            proveri = true;
        } else {
            proveri = false;
        }

        return proveri;
    }
}
