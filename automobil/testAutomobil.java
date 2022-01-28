package vezbanjeNaCasu.klase.automobil;

import java.util.Scanner;

public class testAutomobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite model automobila: ");
            String model = sc.next();
        System.out.print("Unesite drzavu proizvodnje: ");
            String drzava = sc.next();
        System.out.print("Unesite godinu proizvodnje: ");
            int godina = sc.nextInt();
        System.out.print("Unesite predjenu kilometrazu: ");
            double kilometri = sc.nextDouble();

        automobil auto = new automobil(model, drzava, godina, kilometri);



        System.out.println("marka automobila je " + auto.getMarka());
        System.out.println("godina proizvodnje je " + auto.getZemljaProizvodnje());
        System.out.println(auto.getGodinaProizvodnje());
        System.out.println(auto.getKilometraza());

        auto.setKilometraza(sc.nextDouble());
        System.out.println("Nova kilometraza je: " + auto.getKilometraza());

    }
}
