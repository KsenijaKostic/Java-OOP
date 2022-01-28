package domaci22_12_2021;

public class testGlumac {
    public static void main(String[] args) {

        Glumac glumac1 = new Glumac("Johnny", "Depp", 'm', 55, 9.99, false);
        System.out.println(glumac1);
        glumac1.setOcena(5.55);
        System.out.println("Nova ocena glumca je " + glumac1.getOcena() + "\n"); //ostavila sam da samo ocena moze da se menja, sve ostale stvari imaju samo getter metode

        Glumac glumica = new Glumac("Ivana", "Vukovic", 'z', 35, 8.99, true);
        System.out.println(glumica);
    }
}
