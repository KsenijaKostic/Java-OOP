package domaci_24_12_2021;

import java.util.ArrayList;

//Napisati klasu Ucenik koja ima sledeca polja:
//	- String ime
//	- String prezime
//	- ArrayList ocene

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList<Integer> nizOcena;

    public Ucenik(String ime, String prezime, ArrayList<Integer> nizOcena) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = nizOcena;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = new ArrayList<>();
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

    public ArrayList<Integer> getNizOcena() {
        return nizOcena;
    }

    public void setNizOcena(int i) {
        this.nizOcena = nizOcena;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append("\n");

        if (nizOcena.isEmpty()) {
            sb.append(" trenutno nema upisane ocene. \n");
        } else {
            sb.append(" ima ocene: \n");
            for (int ocena : nizOcena) {
                sb.append(ocena);
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    //Napisati metod prosek koji racuna prosek Ucenika.
    public double prosek() {
        double suma = 0;
        int i = 0;
        if (nizOcena.contains(1)) {
            return 1;
        } else if (nizOcena.isEmpty()) {
            return 0;
        } else {
            while (i < nizOcena.size()) {
                suma = suma + nizOcena.get(i);
                i++;
            }
            return suma / nizOcena.size();
        }
    }

}
