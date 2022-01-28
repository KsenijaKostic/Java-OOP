package VezbanjeOOP.Transakcije_2;

public class Racun {
    private double stanje;
    private double dozvoljeniMinus;

    public Racun(double stanje, double dozvoljeniMinus) {
        this.stanje = stanje;
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public double getDozvoljeniMinus() {
        return dozvoljeniMinus;
    }

    public void setDozvoljeniMinus(double dozvoljeniMinus) {
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public double getStanje() {
        return stanje;
    }

    public void uplati(double suma){
       stanje = stanje + suma;
    }

    public boolean skini(double suma){
        boolean proveri;
        if (suma > stanje + dozvoljeniMinus){
            proveri = false;
        } else {
            stanje = stanje - suma;
            proveri = true;
        }
        return proveri;
    }
}
