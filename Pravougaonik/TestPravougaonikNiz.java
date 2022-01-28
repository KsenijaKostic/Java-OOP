package vezbanjeNaCasu.klase.Pravougaonik;

import java.util.Scanner;

public class TestPravougaonikNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite koliko pravougaonika zelite da kreirate: ");
        int brojPravougaonika = sc.nextInt();


        pravougaonik[] nizPravougaonika = new pravougaonik[brojPravougaonika];
      // klasa             ime               novi niz

        for (int i = 0; i < brojPravougaonika; i++ ){
            System.out.print("Unesite duzinu " + (i+1) + ". pravougaonika: ");
            double duzina = sc.nextDouble();

            System.out.print("Unesite sirinu " + (i+1) + ". pravougaonika: ");
            double sirina = sc.nextDouble();

            pravougaonik p = new pravougaonik(duzina, sirina);
            nizPravougaonika[i] = p;
        }

        for (int i = 0; i < brojPravougaonika; i++){
            pravougaonik p = nizPravougaonika[i];
            System.out.println(p);
            System.out.println("Obim pravougaonika je: " + p.obim());
            System.out.println("Povrsina pravougaonika je: " + p.povrsina() + "\n");
        }


    }
}
