package VezbanjeOOP.Usluge;

public class Poziv extends Usluga {  //nasledjena klasa od Usluge
    private int trajanjePozivaSec;

    public Poziv(Broj prviBroj, Broj drugiBroj, int trajanjePozivaSec) {
        super(prviBroj, drugiBroj);
        this.trajanjePozivaSec = trajanjePozivaSec;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(trajanjePozivaSec / 60).append(":").append(trajanjePozivaSec % 60).append(" ").append(cenaUsluge());
        return sb.toString();
    }

    public int getTrajanjePozivaSec() {
        return trajanjePozivaSec;
    }

    @Override
    public int cenaUsluge() {   //nasledjena metoda iz Usluge koja je nadjacana time sto nesto u njoj pise xD
        int cena = 0;
        int minuti = trajanjePozivaSec / 60;  //deli se sa 60 da se dobije broj minuta
        if (proveriDrzave() == true) {  //proverava da li je drzava ista
            if (trajanjePozivaSec % 60 == 0) {   //deli se sa % da se dobije ako ima ostatak sekundi preko celog minuta
                cena = minuti * 10;
            } else {
                cena = (minuti * 10) + 10;
            }
        } else {
            if (trajanjePozivaSec == 0) { //ako su sekunde 0 onda je i cena 0
                cena = 0;
            } else {
                if (trajanjePozivaSec % 60 == 0){  //deli se sa % da se dobije ako ima ostatak sekundi preko celog minuta
                    cena = (minuti * 50) + 30;
                } else {
                    cena = ((minuti * 50) + 30) + 50;
                }
            }
        }

        return cena;
    }
}
