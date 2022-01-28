package vezbanjeNaCasu.klase.osoba;

public class osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;

    public osoba(String ime1, String prezime1, int godinaRodjenja1, double visina1){     //ovo je konstruktor metoda
        ime = ime1;
        prezime = prezime1;
        godinaRodjenja = godinaRodjenja1;
        visina = visina1;
    }

    public osoba(String ime, String prezime) {
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

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public String toString(){
     /*   String vraceniString;
        vraceniString = "Ime: " + ime + "\n";
        vraceniString += "Prezime: " + prezime + "\n";
        vraceniString += "Godina rodjenja: " + godinaRodjenja + "\n";
        vraceniString += "Visina: " + visina + "\n";
        return vraceniString;*/

        StringBuilder sb = new StringBuilder();
        sb.append("Ime: " + ime + "\n");
        sb.append("Prezime: " + prezime + "\n");
        if (godinaRodjenja <= 0){

        } else {
        sb.append("Godina rodjenja: " + godinaRodjenja + "\n"); }
        if (godinaRodjenja <= 0){

        } else {
            sb.append("Visina: " + visina);
        }

        return sb.toString();
    }

}
