package VezbanjeOOP.prodavnica;

public class Proizvod {
    private String nazivProizvoda;
    private double cenaProizvoda;
    private String opisProizvoda;
    private int tezina;

    public Proizvod(String nazivProizvoda, double cenaProizvoda, String opisProizvoda, int tezina) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.opisProizvoda = opisProizvoda;
        this.tezina = tezina;
    }

    public Proizvod(String nazivProizvoda, double cenaProizvoda, int tezina) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.tezina = tezina;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public double getCenaProizvoda() {
        return cenaProizvoda;
    }

    public void setCenaProizvoda(double cenaProizvoda) {
        this.cenaProizvoda = cenaProizvoda;
    }

    public String getOpisProizvoda() {
        return opisProizvoda;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
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
        sb.append(nazivProizvoda);
        sb.append("\n");

        sb.append("Cena proizvoda: ");
        sb.append(cenaProizvoda);
        sb.append("\n");

        if (opisProizvoda != null) {
            sb.append("Opis proizvoda");
            sb.append(opisProizvoda);
            sb.append("\n");
        } else {
            sb.append("Proizvod trenutno nema opis");
            sb.append("\n");
        }

        sb.append("Tezina proizvoda: ");
        sb.append(tezina);
        sb.append(" u gramima. \n");

        return sb.toString();
    }
}
