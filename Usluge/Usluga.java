package VezbanjeOOP.Usluge;

public abstract class Usluga {  //apstraktna metoda jer ima Poziv i Poruku koji je nasledjuju
    private static int brojac = 1;  //opciono
    protected int id;               //opciono
    protected Broj prviBroj;
    protected Broj drugiBroj;

    public Usluga(Broj prviBroj, Broj drugiBroj) {
        this.prviBroj = prviBroj;
        this.drugiBroj = drugiBroj;
        this.id = brojac;
        brojac++;             //brojac je u svakoj iteraciji za 1 broj veci
    }

    public static int getBrojac() {
        return brojac;
    }

    public static void setBrojac(int brojac) {
        Usluga.brojac = brojac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Broj getPrviBroj() {
        return prviBroj;
    }

    public void setPrviBroj(Broj prviBroj) {
        this.prviBroj = prviBroj;
    }

    public Broj getDrugiBroj() {
        return drugiBroj;
    }

    public void setDrugiBroj(Broj drugiBroj) {
        this.drugiBroj = drugiBroj;
    }

    public boolean proveriDrzave() {              //metoda koja proverava da li je broj drzava isti, ako nije vraca fals, i cena usluga zavisi od toga
        return prviBroj.getDrzava().equals(drugiBroj.getDrzava());
    }

    public abstract int cenaUsluge();  //apstraktna metoda koja se mora naslediti u Pozivu i Poruci
}
