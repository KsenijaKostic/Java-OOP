package vezbanjeNaCasu.nedelja6.PrevoznoSredstvo;

public class Automobil extends PrevoznoSredstvo {
    private String tipMotora;
    private double kubikaza;

    public Automobil(int godinaProizvodnje, String zemljaProizvodnje, String marka, String tipMotora, double kubikaza) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.tipMotora = tipMotora;
        this.kubikaza = kubikaza;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public double getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(double kubikaza) {
        this.kubikaza = kubikaza;
    }

    public void sirena(){
        System.out.println("pip  pip");
    }
}
