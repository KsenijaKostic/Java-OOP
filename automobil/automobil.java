package vezbanjeNaCasu.klase.automobil;

public class automobil {
    //Napisati klasu Automobil, koja treba da ima sledece atribure: marka, zemljaProizvodnje, godiste, kilometrzu.
    // Napisati test program u kome treba napraviti 2 automobila, i ispisati ih na izlaz

    private String marka;
    private String zemljaProizvodnje;
    private int godinaProizvodnje;
    private double kilometraza;
    private double prosecnaBrzina;


    public automobil(String marka1, String zemljaProizvodnje1, int godinaProizvodnje1, double kilometraza1){
        marka = marka1;
        zemljaProizvodnje = zemljaProizvodnje1;
        godinaProizvodnje = godinaProizvodnje1;
        kilometraza = kilometraza1;
    }

    public automobil(String marka, String zemljaProizvodnje, int godinaProizvodnje, double kilometraza, double prosecnaBrzina) {
        this.marka = marka;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
        this.prosecnaBrzina = prosecnaBrzina;
    }

    //getter i setter


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    //getter i setter
    public String getZemljaProizvodnje () {
        return  getZemljaProizvodnje();
    }
    public void setZemljaProizvodnje(String zemljaProizvodnje1){
        zemljaProizvodnje = zemljaProizvodnje1;
    }

    //getter i setter
    public int getGodinaProizvodnje(){
        return godinaProizvodnje;
    }
    public void setGodinaProizvodnje(int godinaProizvodnje1){
        godinaProizvodnje = godinaProizvodnje1;
    }

    //getter i setter
    public double getKilometraza(){
        return kilometraza;
    }
    public void setKilometraza(double kilometraza1){
        kilometraza = kilometraza1;
    }

    public double getProsecnaBrzina() {
        return prosecnaBrzina;
    }

    public void setProsecnaBrzina(double prosecnaBrzina) {
        this.prosecnaBrzina = prosecnaBrzina;
    }
}
