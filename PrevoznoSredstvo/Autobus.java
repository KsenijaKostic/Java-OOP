package vezbanjeNaCasu.nedelja6.PrevoznoSredstvo;

public class Autobus extends PrevoznoSredstvo {
    private int maksimalanBrPutnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnje, String marka, int maksimalanBrPutnika) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.maksimalanBrPutnika = maksimalanBrPutnika;
    }

    public int getMaksimalanBrPutnika() {
        return maksimalanBrPutnika;
    }

    public void setMaksimalanBrPutnika(int maksimalanBrPutnika) {
        this.maksimalanBrPutnika = maksimalanBrPutnika;
    }

    public void sirena(){
        System.out.println("dum dum");
    }
}
