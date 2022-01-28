package VezbanjeOOP.Transakcije_2;

public class Datum {
    private int dan;
    private int mesec;
    private int godina;

    public Datum(int dan, int mesec, int godina) throws ArithmeticException {
        boolean proveri = proveriDatum(dan, mesec, godina);
        if (proveri == false) {
            ArithmeticException ae = new ArithmeticException("Datum je nevalidan");
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
        boolean proveri = proveriDatum(dan, mesec, godina);
        if (proveri == false) {
            ArithmeticException ae = new ArithmeticException("Datum je nevalidan");
            throw ae;
        }
        this.dan = dan;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) throws ArithmeticException {
        boolean proveri = proveriDatum(dan, mesec, godina);
        if (proveri == false) {
            ArithmeticException ae = new ArithmeticException("Datum je nevalidan");
            throw ae;
        }
        this.mesec = mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) throws ArithmeticException {
        boolean proveri = proveriDatum(dan, mesec, godina);
        if (proveri == false) {
            ArithmeticException ae = new ArithmeticException("Datum je nevalidan");
            throw ae;
        }
        this.godina = godina;
    }

    private static boolean proveriDatum(int dan, int mesec, int godina) { //metodi prosledjujemo dan mesec i godinu

        boolean proveri = true;  //kreiramo boolean koji vracamo

        if (godina < 2000) {  //prvo proveravamo da li je godina manja od 2000, ako je manja to je false, ako je veca to je true
            proveri = false;
        }
        if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) {  //zatim idemo na mesece, ako su ovi meseci to je 1-31 dan
            if (dan > 31 || dan < 1) {  //zatim proveramo da li je dan veci od 31 ili manji od 1
                proveri = false;    // ako su mesec i dan uslov ispunjeni to je false, ako nisu ispunjeni to je true i datum je validan
            }
        } else if (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) { //drugi set meseca sa danima od 1=30
            if (dan < 1 || dan > 30) {
                proveri = false; //ako je ispunjeno vraca false, ako nije datum je validan
            }
        } else if (mesec == 2) {  //zatim februar posto radim prvo sa mesecima
            if (godina % 4 == 0) {  //ako je godina prestupna to se proverava sa %4==0 onda februar ima 29 dana
                if (dan > 29 || dan < 1) {
                    proveri = false; // vraca false ako su svi ovi uslovi ispunjeni, ako nisu datum je validan
                }
            } else {               //isto i za februar kad godina nije prestupna
                if (dan < 1 || dan > 28) {
                    proveri = false;
                }
            }
        }
        return proveri;
    }
}
