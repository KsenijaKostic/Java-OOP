package vezbanjeNaCasu.nedelja6.Zivotinjskocarstvo;

public abstract class Zivotinja {
    protected String ime;
    protected int godine;

    public Zivotinja(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public abstract void zvuk();
}
