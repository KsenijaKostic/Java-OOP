package vezbanjeNaCasu.klase.Krug;

import java.util.Scanner;

public class TestKrugNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koliko krugova zelite da smestite u niz: ");
        int brojKrugova = sc.nextInt();

        Krug[] nizKrugova = new Krug[brojKrugova];

        for (int i = 0; i < brojKrugova; i++) {
            System.out.print("Upisite poluprecnik " + (i + 1) + ". kruga: ");
            double poluprecnik = sc.nextDouble();

            Krug k = new Krug(poluprecnik);
            nizKrugova[i] = k;
        }

        for (int i = 0; i < brojKrugova; i++) {
            Krug k = nizKrugova[i];
            System.out.println(k);
            System.out.println("Obim kruga je: " + k.obim());
            System.out.println("Povrsina kruga je: " + k.povrsina() + "\n");
        }


    }

}
