package vezbanjeNaCasu.klase.Krug;

import java.util.Scanner;

public class testKrug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite poluprecnik kruga: ");
        double poluprecnik = sc.nextDouble();

        Krug krug1 = new Krug(poluprecnik);
/*
        System.out.println("Poluprecnik kruga je: " + krug1.getPoluprecnik());
        System.out.println("Precnik kruga je: " + krug1.precnik());*/

        System.out.println(krug1);

        System.out.println("Povrsina kruga je: " + krug1.povrsina());
        System.out.println("Obim kruga je: " + krug1.obim());


    }
}
