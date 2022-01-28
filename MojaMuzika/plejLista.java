package VezbanjeOOP.MojaMuzika;

import java.util.ArrayList;

public class plejLista {
    private String imePlejListe;
    private ArrayList<Pesma> pesme;
    private int duzinaTrajanja;

    public plejLista(String imePlejListe, ArrayList<Pesma> pesme) {
        this.imePlejListe = imePlejListe;
        this.pesme = pesme;
        for (Pesma p : pesme) {
            this.duzinaTrajanja = p.getTrajanje() + duzinaTrajanja;
        }

    }

    public String getImePlejListe() {
        return imePlejListe;
    }

    public void setImePlejListe(String imePlejListe) {
        this.imePlejListe = imePlejListe;
    }

    public ArrayList<Pesma> getPesme() {
        return pesme;
    }

    public void setPesme(ArrayList<Pesma> pesme) {
        this.pesme = pesme;
    }

    public int getDuzinaTrajanja() {
        return duzinaTrajanja;
    }

    public void setDuzinaTrajanja(int duzinaTrajanja) {
        this.duzinaTrajanja = duzinaTrajanja;
    }
}
