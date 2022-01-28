package domaci21_12_2021.sport;

public class testSport {
    public static void main(String[] args) {
        Sportista igrac1 = new Sportista("Ivan", "Ivic");
        Sportista igrac2 = new Sportista("Katarina", "Karadzic");
        Sportista igrac3 = new Sportista("Ivica", "Ivicic");


        System.out.println(igrac2);
        System.out.println(igrac3);

        igrac1.setKlub("Vozdovac");
        System.out.println(igrac1);

        igrac1.setBroj(55);
        System.out.println(igrac1);

        igrac2.setKlub("Radnicki");
        igrac2.setBroj(1);
        System.out.println(igrac2);

        System.out.println(igrac3.getBroj());

    }
}
