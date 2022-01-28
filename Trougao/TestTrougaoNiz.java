package vezbanjeNaCasu.klase.Trougao;

import java.util.Scanner;

public class TestTrougaoNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite koliko trouglova zelite da bude u nizu: ");
        int brojTrouglova = sc.nextInt();
        Trougao[] nizTrouglova = new Trougao[brojTrouglova];

        for (int i = 0; i < brojTrouglova; i++){
            System.out.print("Upisite duzinu prve stranice trougla broj " + (i+1) + ": ");
            double stranicaA = sc.nextDouble();

            System.out.print("Upisite duzinu druge stranice trougla broj " + (i+1) + ": ");
            double stranicaB = sc.nextDouble();

            System.out.print("Upisite duzinu trece stranice trougla broj " + (i+1) + ": ");
            double stranicaC = sc.nextDouble();

            Trougao t = new Trougao(stranicaA, stranicaB, stranicaC);
        }

        for (int i = 0; i < brojTrouglova; i++){
            Trougao t = nizTrouglova[i];
            System.out.println(t);
            System.out.println("Povrsina " + (i+1) + ". trougla je " + t.povrsina());
            System.out.println("Obim " + (i+1) + ". trougla je " + t.obim());
        }
    }
}
