package VezbanjeOOP.Usluge;

public class Poruka extends Usluga {    //nasledjena klasa od Usluge
    private String tekstPoruke;
    private boolean poslata;

    public Poruka(Broj prviBroj, Broj drugiBroj, String tekstPoruke) {
        super(prviBroj, drugiBroj);
        this.tekstPoruke = tekstPoruke;
        if (poslata == true) {      //ako je true poruka je poslata
            System.out.println("Nije poslata");     //ako je false poruka nije poslata
        } else {
            System.out.println("Poslata");
        }
        this.poslata = poslata;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public boolean isPoslata() {
        return poslata;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tekstPoruke).append(" ").append(cenaUsluge());
        return sb.toString();
    }

    @Override
    public int cenaUsluge() {    //nasledjena metoda iz Usluge koja je nadjacana time sto nesto u njoj pise xD
        int cena = 0;
        if (!prviBroj.isIndikatorFiksnog() || !drugiBroj.isIndikatorFiksnog()) {
            cena = 0;
        } else {
            if (proveriDrzave() == true) {
                cena = 3;
            } else {
                cena = 20;
            }
        }
        return cena;
    }
}
