package vezbanjeNaCasu.klase.Trougao;

public class Trougao {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    private boolean validan(){
        //vracamo true ako je validan
        //vracamo false ako nije validan
        if ((stranicaA + stranicaB) < stranicaC){
            return false;
        } else if ((stranicaC + stranicaB) < stranicaA){
            return false;
        } else if((stranicaA + stranicaC) < stranicaB){
            return false;
        } else {
            return true;
        }


    }

    //konstruktor
    public Trougao (double stranicaA1, double stranicaB1, double stranicaC1){
        if (stranicaA1 <= 0 || stranicaB1 <= 0 || stranicaC1 <= 0){
            System.out.println("Uneli ste nevalidnu duzinu stranice trougla");
        } else if (validan() == false){
            System.out.println("Uneli ste nevalidnu duzinu stranice trougla");
        } else if (validan() == true){
            stranicaA = stranicaA1;
            stranicaB = stranicaB1;
            stranicaC = stranicaC1;
        }
    }

    public double getStranicaA(){
        return stranicaA;
    }

    public void setStranicaA(double stranicaA1) {
        if (stranicaA1 <= 0){
            System.out.println("Uneli ste pogresnu vrednost");
        } else if(validan() == false){
            System.out.println("Uneli ste pogresnu vrednost");
        } else {
            stranicaA1 = stranicaA;
        }
    }

    public double getStranicaB() {
        return stranicaB;

    }

    public void setStranicaB(double stranicaB1) {
        if (stranicaB1 <= 0){
            System.out.println("Uneli ste pogresnu vrednost");
        } else if(validan() == false){
            System.out.println("Uneli ste pogresnu vrednost");
        } else {
            stranicaB1 = stranicaB;
        }
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC1) {
        if (stranicaC1 <= 0){
            System.out.println("Uneli ste pogresnu vrednost");
        } else if(validan() == false){
            System.out.println("Uneli ste pogresnu vrednost");
        }
        else {
            stranicaC1 = stranicaC;
        }
    }

    //obim
    public double obim () {
        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    //povrsina
    public double povrsina(){
        double p;
        double s = (stranicaA + stranicaB + stranicaC) / 2;
        p = Math.sqrt(s * (s-stranicaA) * (s - stranicaB) * (s - stranicaC));
        return p;
    }

    public String toString(){
       /* String vraceniString; //ovaj nacin nije efikasan, ukljucuje mnogo kopiranja u memoriji
            vraceniString = "Duzina stranice a je: " + stranicaA + "\n";
            vraceniString += "Duzina stranice b je: " + stranicaB + "\n";
            vraceniString += "Duzina stranice c je: " + stranicaC;
        return vraceniString;*/

        StringBuilder sb = new StringBuilder(); //ovo je mnogo bolji nacin

        sb.append("Duzina stranice a je: "); //ovaj princip je jos bolji, cim ima + on sabira dva stringa
        sb.append(stranicaA);
        sb.append("\n");
        sb.append("Duzina stranice b je: " + stranicaB + "\n");
        sb.append("Duzina stranice c je: " + stranicaC + "\n");
        //moze i String noviString = sb.toString()'
        //pa onda return noviString;
        return sb.toString();

    }

}
