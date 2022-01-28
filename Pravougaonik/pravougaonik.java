package vezbanjeNaCasu.klase.Pravougaonik;

public class pravougaonik {
    private double duzina;
    private double sirina;

    //konstruktor
    public pravougaonik (double duzina1, double sirina1){
        duzina = duzina1;
        sirina = sirina1;
    }

    public double getDuzina() {
        return duzina;
    }

    public double getSirina() {
        return sirina;
    }
    public void setDuzina(double duzina1) {
        duzina = duzina1;
    }

    public void setSirina(double sirina1) {
        sirina = sirina1;
    }

    //obim; metoda koja racuna obim i vraca vrednost koju izracuna
    public double obim(){
        double o = 2*duzina + 2*sirina;
        return o;
    }
    //povrsina; metoda koja racuna povrsinu i vraca vrednost koju izracuna
    public double povrsina() {
        double p = sirina * duzina;
        return p;
    }

    public String toString(){
       /* String vraceniString;
            vraceniString = "Duzina pravouganika je: " + duzina + "\n";
            vraceniString += "Sirina pravouganika je: " + sirina + "\n";
        return vraceniString;*/

        StringBuilder sb = new StringBuilder();
        sb.append("Duzina pravouganika je: " + duzina + "\n");
        sb.append("Sirina pravouganika je: " + sirina );
        return sb.toString();
    }
}
