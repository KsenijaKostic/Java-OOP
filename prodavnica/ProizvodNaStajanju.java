package VezbanjeOOP.prodavnica;

import VezbanjeOOP.prodavnica.Proizvod;

public class ProizvodNaStajanju {
    private Proizvod proizvod;
    private int kolicinaNaStajanju;

    public ProizvodNaStajanju(Proizvod proizvod, int kolicinaNaStajanju) {
        this.proizvod = proizvod;
        this.kolicinaNaStajanju = kolicinaNaStajanju;
    }

    public ProizvodNaStajanju(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public int getKolicinaNaStajanju() {
        return kolicinaNaStajanju;
    }

    public void setKolicinaNaStajanju(int kolicinaNaStajanju) {
        this.kolicinaNaStajanju = kolicinaNaStajanju;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ");
        sb.append(proizvod.getNazivProizvoda());
        sb.append("\n");

        sb.append("Kolicina na stajanju: ");
        sb.append(kolicinaNaStajanju);
        sb.append("\n");

        return sb.toString();
    }

}

