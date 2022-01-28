package vezbanjeNaCasu.klase.Krug;

public class Krug {

    private double poluprecnik;

    //konstruktor
    public Krug (double poluprecnik1){
        if (poluprecnik1 < 0){
            System.out.println("Uneli ste pogresnu vrednost. poluprecnik kruga mora biti pozivitan");
        } else {
            poluprecnik = poluprecnik1;
        }
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }
    public void setPoluprecnik(double poluprecnik1) {
        if (poluprecnik1 < 0){
            System.out.println("Uneli ste pogresnu vrednost. poluprecnik kruga mora biti pozivitan");
        } else {
        poluprecnik = poluprecnik1;
        }
    }
    //precnik
    public double precnik(){
        double pre = poluprecnik + poluprecnik;
        return pre;
    }
    //povrsina
    public double povrsina(){
        double p = Math.PI * (poluprecnik * poluprecnik);
        return p;
    }
    //obim
    public double obim(){
        double o = 2 * poluprecnik * Math.PI;
        return o;
    }

    public String toString (){
       /* String vraceniString;
            vraceniString = "poluprecnik kruga je: " + poluprecnik;
        return vraceniString;*/

        StringBuilder sb = new StringBuilder();
        sb.append("Poluprecnik kruga je: " + poluprecnik);
        return sb.toString();

    }
}
