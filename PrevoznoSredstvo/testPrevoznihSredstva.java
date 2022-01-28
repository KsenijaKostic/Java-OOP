package vezbanjeNaCasu.nedelja6.PrevoznoSredstvo;

import java.util.ArrayList;

public class testPrevoznihSredstva {
    public static void main(String[] args) {
        //nominalni tip PrevoznoSredstvo, stvarni tip Automobil
        PrevoznoSredstvo autobus1 = new Autobus(1999, "Kina", "IkarBus", 52);
        //autobus1.getMaksimalanBrPutnika ne moze da se pozove jer je NOMINALNI TIP PrevoznoSredstvo, i tamo toga nema definisano

        PrevoznoSredstvo auto1 = new Automobil(2011, "Nemacka", "BMW", "dizel", 2.0);
        //nominalni tip je Voz, stvarni tip je Voz, i moze da se pristupi svim varijablama koje su definisane u vozu
        Voz voz1 = new Voz(1950, "Rusija", "samoVoz", 11);
        voz1.getBrojVagona();

        voz1.sirena();   //pozvace se sirena iz voza, a ne iz prevoznog predstva


        //prava moc polimorfizma
        ArrayList<PrevoznoSredstvo> prevoznaSredstva = new ArrayList<>();
        prevoznaSredstva.add(auto1);
        prevoznaSredstva.add(autobus1);
        prevoznaSredstva.add(voz1); //moze se dodati i voz, jer je nasledio sve iz PrevoznoSredstvo!

        for (PrevoznoSredstvo ps : prevoznaSredstva){
            ps.sirena();        //ispisuje metode iz automobila, voza i autobusa, iako se te metode nalaze u tim klasama, a ne u klasi PrevoznoSredstvo
        }

    }
}
