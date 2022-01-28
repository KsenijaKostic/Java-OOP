package VezbanjeOOP.Transakcije;

import VezbanjeOOP.Transakcije.Datum;
import VezbanjeOOP.Transakcije.Racun;

public abstract class ZahtevZaTransfer {

    protected int id;
    private static int brojac = 0; //napraviti novu promenljivu brojac i dodeliti mu odmah vrednost 0. u svakoj sledecoj iteraciji bice za 1 broj veci!
    protected Racun racunPrimaoca;
    protected Racun racunUplatioca;
    protected Datum datumPodnesenjaZahteva;
    protected double iznos;

    public ZahtevZaTransfer(Racun racunPrimaoca, Racun racunUplatioca, Datum datumPodnesenjaZahteva, double iznos) {
        this.racunPrimaoca = racunPrimaoca;
        this.racunUplatioca = racunUplatioca;
        this.datumPodnesenjaZahteva = datumPodnesenjaZahteva;
        this.iznos = iznos;
        this.id = brojac;
        brojac++;
    }

    public int getId() {
        return id;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }

    public Datum getDatumPodnesenjaZahteva() {
        return datumPodnesenjaZahteva;
    }

    public double getIznos() {
        return iznos;
    }

    public void setDatumPodnesenjaZahteva(Datum datumPodnesenjaZahteva) {
        this.datumPodnesenjaZahteva = datumPodnesenjaZahteva;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public abstract boolean izvrsiZahtev();
}
