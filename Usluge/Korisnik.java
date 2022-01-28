package VezbanjeOOP.Usluge;

import java.util.ArrayList;

public class Korisnik {
    private ArrayList<Usluga> nizUsluga;    //lista sa nizom usluga
    private Broj brTelefona;

    public Korisnik(Broj brTelefona) {
        this.brTelefona = brTelefona;
        this.nizUsluga = new ArrayList<>();
    }

    public ArrayList<Usluga> getNizUsluga() {
        return nizUsluga;
    }

    public void setNizUsluga(ArrayList<Usluga> nizUsluga) {
        this.nizUsluga = nizUsluga;
    }

    public Broj getBrTelefona() {
        return brTelefona;
    }

    public void setBrTelefona(Broj brTelefona) {
        this.brTelefona = brTelefona;
    }

    public void dodajUslugu(Usluga u) {  //dodaje uslugu na listu
        nizUsluga.add(u);
    }

    public int ukupnaCena(){  //racuna cenu svih usluga koje ima jedan korisnik
        int uCena = 0;
        for (Usluga u : nizUsluga){
            uCena = uCena + u.cenaUsluge();
        }
        return uCena;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Broj telefona: ").append(brTelefona).append("\n");
        sb.append("Usluge: \n");
        for (Usluga u : nizUsluga){
            sb.append(u.id).append(" ").append(u).append("\n");
        }
        return sb.toString();
    }
}
