package vezbanjeNaCasu.klase.Kupovina;

public class Proizvod {

    private String naziv;
    private double cena;
    private String opis;
    private int tezina;

    public Proizvod(String naziv, double cena, int tezina) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezina = tezina;
    }

    public Proizvod(String naziv, double cena, String opis, int tezina) {
        this.naziv = naziv;
        this.cena = cena;
        this.opis = opis;
        this.tezina = tezina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ");
        sb.append(naziv);
        sb.append("\n");

        sb.append("Cena proizvoda: ");
        sb.append(cena);
        sb.append("\n");

        if (opis != null) {
            sb.append("Opis proizvoda: ");
            sb.append(opis);
            sb.append("\n");
        } else {
            sb.append("Proizvod nema opis \n");
        }

        sb.append("Tezina proizvoda: ");
        sb.append(tezina);
        sb.append("gr. \n");

        return sb.toString();
    }
}
