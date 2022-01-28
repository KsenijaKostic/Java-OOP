package vezbanjeNaCasu.klase.Auto2;

import vezbanjeNaCasu.klase.automobil.automobil;

import java.util.Scanner;

public class testAutomobil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*    System.out.print("Unesite model automobila: ");
        String model = sc.next();
        System.out.print("Unesite drzavu proizvodnje: ");
        String drzava = sc.next();
        System.out.print("Unesite godinu proizvodnje: ");
        int godina = sc.nextInt();
        System.out.print("Unesite predjenu kilometrazu: ");
        double kilometri = sc.nextDouble();
*/
    //    Automobil2 auto1 = new Automobil2(model, drzava, godina, kilometri);

        Automobil2 auto2 = new Automobil2("lada", "japan", 1999);


        //auto1
   /*     System.out.println("marka automobila je " + auto1.getMarka());
        System.out.println("godina proizvodnje je " + auto1.getZemljaProizvodnje());
        System.out.println(auto1.getGodinaProizvodnje());
        System.out.println(auto1.getKilometraza());

        auto1.setKilometraza(sc.nextDouble());
        System.out.println("Nova kilometraza je: " + auto1.getKilometraza());
*/
        //auto2 ce se ispisati iz toString metode
        System.out.println(auto2);
    }
}
