package domaci22_12_2021;

public class Glumac {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiJeIzSrbije;

    public Glumac(String ime1, String prezime1, char pol1, int godine1, double ocena1, boolean daLiJeIzSrbije1){
        ime = ime1;
        prezime = prezime1;
        pol = pol1;
        godine = godine1;
        ocena = ocena1;
        daLiJeIzSrbije = daLiJeIzSrbije1;

    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public boolean isDaLiJeIzSrbije() {
        return daLiJeIzSrbije;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
            sb.append("Glumac/ica ");
            sb.append(ime);
            sb.append(" ");
            sb.append(prezime);
            sb.append(" je ");
            if (pol == 'm'){
                sb.append("muskog");
            } else {
                sb.append("zenskog");
            }
            sb.append(" pola, i trenutno ima ");
            sb.append(godine);
            sb.append(" godina\n");
        if (daLiJeIzSrbije == true){
            sb.append("Glumac/ica je poreklom iz Srbije \n");
        } else {
            sb.append("Glumac/ica nije poreklom iz Srbije \n");
        }
            sb.append("Moja ocena glumca/ice je ");
            sb.append(ocena);
            sb.append("\n");

        return sb.toString();
    }
}


