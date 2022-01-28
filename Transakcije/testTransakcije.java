package VezbanjeOOP.Transakcije;

public class testTransakcije {
    public static void main(String[] args) {
        try {
            Datum d1 = new Datum(11, 12, 2012);
            Datum d2 = new Datum(12, 11, 2002);
            Datum d3 = new Datum(13, 9, 2001);
            Datum d4 = new Datum(13, 10, 2021);

            Racun r1 = new Racun(1000, 2000);
            Racun r2 = new Racun(3000, 3000);
            Racun r3 = new Racun(5500, 4000);

            Banka b = new Banka("Komercijalna banka", r1);
            Uplatnica u1 = new Uplatnica(r1, r2, d3, 500, "struja");
            KreditniZahtev k1 = new KreditniZahtev(r2, r3, d2, 200, d1, d4);

        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

    }
}
