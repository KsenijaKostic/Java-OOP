package VezbanjeOOP.Usluge;

public class Broj {
    private String drzava;
    private String pozivniBr;
    private String broj;
    private boolean indikatorFiksnog;

    public Broj(String drzava, String pozivniBr, String broj, boolean indikatorFiksnog) throws Exception {
        this.drzava = drzava;

        if (pozivniBr.equals(null) || pozivniBr.isEmpty() || pozivniBr.length() > 3) { //isti uslov kao i metoda koji ispisuje poruku ili baca gresku
            Exception e = new Exception("Pozivni broj je nevalidan");
            throw  e;
        } else {
            this.pozivniBr = pozivniBr;
        }
        this.broj = broj;

        if (indikatorFiksnog == false) {
            System.out.println("fiksni");
        } else {
            System.out.println("mobilni");
        }
        this.indikatorFiksnog = indikatorFiksnog;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getPozivniBr() {
        return pozivniBr;
    }

    public void setPozivniBr(String pozivniBr) {
        this.pozivniBr = pozivniBr;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean isIndikatorFiksnog() {
        return indikatorFiksnog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(drzava).append(pozivniBr).append(broj);
        return sb.toString();
    }

    private boolean broj() {  //ovo porverava broj i u konstruktoru se kopira isti uslov
        boolean proveri;      //pravi se bulean koji proverava
        if (pozivniBr.isEmpty() || pozivniBr.equals(null)) {
            proveri = false;
        } else {
            proveri = true;
        }
        return proveri;
    }


}
