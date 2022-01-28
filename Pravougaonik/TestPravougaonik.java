package vezbanjeNaCasu.klase.Pravougaonik;

import java.util.Scanner;

public class TestPravougaonik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi duzinu: ");
        double duzina = sc.nextDouble();
        System.out.print("Unesi sirinu: ");
        double sirina = sc.nextDouble();

        pravougaonik prav = new pravougaonik(duzina, sirina);
/*
        System.out.println("duzina je: " + prav.getDuzina());
        System.out.println("sirina je: " + prav.getSirina());*/

        System.out.println(prav);

        System.out.println("obim je: " + prav.obim());
        System.out.println("povrina je: " + prav.povrsina());

    }
}
