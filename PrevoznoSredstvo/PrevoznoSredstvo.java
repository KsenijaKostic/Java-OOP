package vezbanjeNaCasu.nedelja6.PrevoznoSredstvo;

public abstract class PrevoznoSredstvo {
    protected int godinaProizvodnje;
    protected String zemljaProizvodnje;
    protected String marka;

    public PrevoznoSredstvo(int godinaProizvodnje, String zemljaProizvodnje, String marka) {
        this.godinaProizvodnje = godinaProizvodnje;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getZemljaProizvodnje() {
        return zemljaProizvodnje;
    }

    public void setZemljaProizvodnje(String zemljaProizvodnje) {
        this.zemljaProizvodnje = zemljaProizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public abstract void sirena();
}
