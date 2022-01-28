package domaci_24_12_2021;

import java.util.ArrayList;

public class testOdeljenje {
    public static void main(String[] args) {



        Ucenik ucenik1 = new Ucenik("Ivan", "Ivanovic");
        ucenik1.getNizOcena().add(0, 5);
        ucenik1.getNizOcena().add(1, 5);
        ucenik1.getNizOcena().add(2, 4);
     //   System.out.println(ucenik1);              //ovo sam koristila kao proveru da li lepo ispisuje ocene kada ih unesem za svakog ucenika

        Ucenik ucenik2 = new Ucenik("Ivana", "Ivic");
        ucenik2.getNizOcena().add(4);
        ucenik2.getNizOcena().add(4);
        ucenik2.getNizOcena().add(3);
        ucenik2.getNizOcena().add(5);
        ucenik2.getNizOcena().add(5);
        System.out.println(ucenik2);

        Ucenik ucenik3 = new Ucenik("Tijana", "Tijanic");
        ucenik3.getNizOcena().add(2);
        ucenik3.getNizOcena().add(5);
        ucenik3.getNizOcena().add(4);
        ucenik3.getNizOcena().add(1);
     //   System.out.println(ucenik3);

        System.out.println(ucenik3.prosek());


        Odeljenje odeljenje1 = new Odeljenje("IV1");


        odeljenje1.getNizDnevnik().add(ucenik1);
        odeljenje1.getNizDnevnik().add(ucenik2);
        odeljenje1.getNizDnevnik().add(ucenik3);
        odeljenje1.getNizDnevnik().add(ucenik3);
     //   System.out.println(odeljenje1);

        odeljenje1.prosecnaOcena(ucenik1);
        odeljenje1.prosecnaOcena(1);

        System.out.println(odeljenje1.prosecnaOcenaOdeljenja());

        System.out.println(odeljenje1.izlistajDnevnik());

        odeljenje1.opisnaOcena(ucenik3);

        System.out.println(odeljenje1.velicinaOdeljenja());

        System.out.println(odeljenje1.toString());

        odeljenje1.upisUcenika(ucenik2);
        System.out.println(odeljenje1.toString());
        odeljenje1.upisUcenika(ucenik1, 5);
        System.out.println(odeljenje1.toString());

        odeljenje1.pogledajOcene(3);

        odeljenje1.pogledajOcene(ucenik2);

        odeljenje1.ispisUcenika(3);
        System.out.println(odeljenje1);

        odeljenje1.ispisUcenika(ucenik2);
        System.out.println(odeljenje1);

    }

}
