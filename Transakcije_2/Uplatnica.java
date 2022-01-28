package VezbanjeOOP.Transakcije_2;

public class Uplatnica extends ZahtevZaTransfer {
    private String svrhaUplate;

    public Uplatnica(Racun primaoc, Racun uplatioc, Datum datumPodnosenjaZahteva, double iznos, String svrhaUplate) {
        super(primaoc, uplatioc, datumPodnosenjaZahteva, iznos);
        this.svrhaUplate = svrhaUplate;
    }

    public String toString(){
        StringBuilder sb= new StringBuilder();
        return sb.toString();
    }


    @Override
    public boolean izvrsiZahtev() {
        boolean proveri = true;
        double provizija = iznos*1/100;
        if (uplatioc.getStanje() > iznos + provizija){
            uplatioc.skini((iznos + provizija));
            primaoc.uplati(iznos);
            proveri = true;
        } else {
            proveri = false;
        }
        return proveri;
    }
}
