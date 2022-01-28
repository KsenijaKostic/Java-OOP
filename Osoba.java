package VezbanjeOOP;

public class Osoba {
    private String ime;
    private String prezime;
    private int godiste;
    private double visina;

    public Osoba(String ime, String prezime, int godiste, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godiste = godiste;
        this.visina = visina;
    }

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append("\n");
        if (godiste == 0) {

        } else {
            sb.append("Rodjena je ");
            sb.append(godiste);
            sb.append(" godine \n");
        }
        if (visina == 0) {
            sb.append("Nema podataka");
        } else {
            sb.append("Visoka je: ");
            sb.append(visina);
            sb.append("\n");
        }


        return sb.toString();
    }
}
