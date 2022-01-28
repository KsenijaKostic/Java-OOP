package VezbanjeOOP.Transakcije;

public class Racun {
    private double stanje;
    private double minus;

    public Racun(double stanje, double minus) {
        this.stanje = stanje;
        this.minus = minus;
    }

    public double getMinus() {
        return minus;
    }

    public void setMinus(double minus) {
        this.minus = minus;
    }

    public double getStanje() {
        return stanje;
    }

    public void uplati(double x) {

        if (x > 0) {
            stanje = x + stanje;
        } else {
            System.out.println("Ne mozete uplatiti negativnu vrednost");
        }
    }

    public boolean skini(double x){
        boolean skinutNovac;
        if (x < stanje + minus){
            stanje = stanje - x;
            skinutNovac = true;
        } else {
            skinutNovac = false;
        }
        return skinutNovac;
    }

}
