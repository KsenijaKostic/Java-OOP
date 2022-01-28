package vezbanjeNaCasu.klase.Trougao;

import java.util.Scanner;

public class testTrougao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite duzinu stranice A: ");
            double a = sc.nextDouble();;
        System.out.print("Unesite duzinu stranice B: ");
            double b = sc.nextDouble();
        System.out.print("Unesite duzinu stranice C: ");
            double c = sc.nextDouble();

        Trougao trouglic = new Trougao(a, b, c);
/*
        System.out.println("Duzina stranice a je " + trouglic.getStranicaA());
        System.out.println("Duzina stranice b je " + trouglic.getStranicaB());
        System.out.println("Duzina stranice c je " + trouglic.getStranicaC()); */


        //ispisano iz toString metode iz klase Trougao
        System.out.println("Stranice trougla su: \n" + trouglic);


        System.out.println("\nObim naseg trougla je " + trouglic.obim());
        System.out.println("Povrsina naseg trougla je " + trouglic.povrsina());



    }
}
