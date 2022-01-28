package vezbanjeNaCasu.klase.Kupovina;

public class ProizvodNaStajanju {
    private Proizvod proizvod;
    private int kolicinaNaStajanju;

    public ProizvodNaStajanju(Proizvod proizvod, int kolicinaNaStanju) {
        this.proizvod = proizvod;
        this.kolicinaNaStajanju = kolicinaNaStanju;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public int getKolicinaNaStanju() {
        return kolicinaNaStajanju;
    }

    public void setKolicinaNaStanju(int kolicinaNaStanju) {
        this.kolicinaNaStajanju = kolicinaNaStanju;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv proizvoda: ");
        sb.append(proizvod.getNaziv());
        sb.append("\n");

        sb.append("Kolicina na stajanju");
        sb.append(kolicinaNaStajanju);
        sb.append("\n");
        return sb.toString();
    }

}
