package VezbanjeOOP.Transakcije;

public class Datum {
    protected int dan;
    private int mesec;
    private int godina;

    public Datum(int dan, int mesec, int godina) throws ArithmeticException { //drugo u konstruktoru napisemo uslov

        boolean dobarDatum = proveriDatum(dan, mesec, godina);
        if (dobarDatum == false) {
            ArithmeticException ae = new ArithmeticException("Datum nije dobar");
            throw ae;
        }
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);
        if (dobarDatum == false) {
            ArithmeticException ae = new ArithmeticException("Datum nije dobar");
            throw ae;
        }
        this.dan = dan;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);
        if (dobarDatum == false) {
            ArithmeticException ae = new ArithmeticException("Datum nije dobar");
            throw ae;
        }
        this.mesec = mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) throws ArithmeticException {
        boolean dobarDatum = proveriDatum(dan, mesec, godina);
        if (dobarDatum == false) {
            ArithmeticException ae = new ArithmeticException("Datum nije dobar");
            throw ae;
        }
        this.godina = godina;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dan).append(" - ").append(mesec).append(" - ").append(godina).append("\n");
        return sb.toString();
    }

    private static boolean proveriDatum(int dan, int mesec, int godina) { //prvo napravimo metodu
        boolean proveri = true;
        if (godina < 2000){
            proveri = false;
        }
        if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) {
            if (dan < 1 || dan > 31){
                proveri = false;
            }
        } else if (mesec == 4 || mesec == 6 ||mesec == 9 || mesec == 11){
            if(dan < 1 || dan > 30){
                proveri = false;
            }
        } else if (mesec == 2){
            if (godina % 4 == 0){
                if(dan < 1 || dan > 29){
                    proveri = false;
                }
            } else {
                if (dan < 1 || dan > 28){
                    proveri = false;
                }
            }
        }
        return proveri;
    }
}
