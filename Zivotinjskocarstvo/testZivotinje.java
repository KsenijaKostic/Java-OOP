package vezbanjeNaCasu.nedelja6.Zivotinjskocarstvo;

public class testZivotinje {
    public static void main(String[] args) {
     //   Zivotinja z = new Zivotinja("pera", 3); crveni se jer zivotinju ne mozemo da napravimo, jer je apstraktna klasa
        Pas p = new Pas("Dzeki", 3, "buldog");
        Macka m = new Macka("cici", 5, "zuta");

      //  z.zvuk(); //i svaka ova ce da ispisuje to sto pise u toj klasi, bez obzira sto u klasi zivotinja imamo istu metodu sa istim stvarima
        p.zvuk();
        m.zvuk();


    }
}
