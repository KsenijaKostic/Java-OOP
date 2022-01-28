package vezbanjeNaCasu.klase.Auto2;

public class Automobil2 {
    private String marka;
    private String zemljaProizvodnje;
    private int godinaProizvodnje;
    private double kilometraza;

        //konstruktor 1
    public Automobil2(String marka1, String zemljaProizvodnje1, int godinaProizvodnje1, double kilometraza1){
        marka = marka1;
        zemljaProizvodnje = zemljaProizvodnje1;
        godinaProizvodnje = godinaProizvodnje1;
        kilometraza = kilometraza1;
    }

        //konstruktor 2
    public Automobil2 (String marka1, String zemljaProizvodnje1, int godinaProizvodnje1){
        marka = marka1;
        zemljaProizvodnje = zemljaProizvodnje1;
        godinaProizvodnje = godinaProizvodnje1;
    }

    //getter i setter
    public String getMarka () {
        return  getMarka();
    }
    public void setMarka(String marka1){
        marka = marka1;
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

    public String toString(){
        String stringKojiVracam;
        stringKojiVracam = "Marka automobila je: " + marka + "\n";
        stringKojiVracam += "Zemlja porekla: " + zemljaProizvodnje + "\n";
        stringKojiVracam += "Godina proizvodnje je: " + godinaProizvodnje + "\n";
        stringKojiVracam += "Kilometraza je: " + kilometraza + "km" + "\n";
        return stringKojiVracam;
    }
}
