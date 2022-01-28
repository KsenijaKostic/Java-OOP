package VezbanjeOOP.MojaMuzika;

public abstract class Pesma {
    private String ime;
    private String zanr;
    private int trajanje;

    public Pesma(String ime, String zanr, int trajanje) {
        this.ime = ime;
        this.zanr = zanr;
        this.trajanje = trajanje;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public abstract String zvuk();

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" - ").append(trajanje).append("\n");
        sb.append(zanr);
        return sb.toString();
    }
}
