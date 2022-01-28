package vezbanjeNaCasu.klase.Putovanje;

public class Grad {
        private String imeGrada;
        private int brojStanovnika;
        private String drzava;

    public Grad(String imeGrada, int brojStanovnika, String drzava) {
        this.imeGrada = imeGrada;
        if (brojStanovnika < 0){
            System.out.println("Uneli ste negativan broj stanovnika");
        } else {
            this.brojStanovnika = brojStanovnika;
        }
        this.drzava = drzava;
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        if (brojStanovnika < 0){
            System.out.println("Uneli ste negativan broj stanovnika");
        } else {
            this.brojStanovnika = brojStanovnika;
        }
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime grada: ");
        sb.append(imeGrada);
        sb.append("\n");

        sb.append("Broj stanovnika: ");
        sb.append(brojStanovnika);
        sb.append("\n");

        sb.append("Drzava: ");
        sb.append(drzava);
        sb.append("\n");

        return sb.toString();
    }
}
