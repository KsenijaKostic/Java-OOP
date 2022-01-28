package VezbanjeOOP.Transakcije_2;

public abstract class ZahtevZaTransfer {
    private static int brojac = 1;
    protected int id;
    protected Racun primaoc;
    protected Racun uplatioc;
    protected Datum datumPodnosenjaZahteva;
    protected double iznos;

    public ZahtevZaTransfer(Racun primaoc, Racun uplatioc, Datum datumPodnosenjaZahteva, double iznos) {
        this.primaoc = primaoc;
        this.uplatioc = uplatioc;
        this.datumPodnosenjaZahteva = datumPodnosenjaZahteva;
        this.iznos = iznos;
        this.id = brojac;
        brojac++;
    }

    public Datum getDatumPodnosenjaZahteva() {
        return datumPodnosenjaZahteva;
    }

    public void setDatumPodnosenjaZahteva(Datum datumPodnosenjaZahteva) {
        this.datumPodnosenjaZahteva = datumPodnosenjaZahteva;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public static int getBrojac() {
        return brojac;
    }

    public int getId() {
        return id;
    }

    public Racun getPrimaoc() {
        return primaoc;
    }

    public Racun getUplatioc() {
        return uplatioc;
    }

    public abstract boolean izvrsiZahtev();

}
