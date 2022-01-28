package vezbanjeNaCasu.nedelja6.Zivotinjskocarstvo;

public class Macka extends Zivotinja{
    private String boja;

    public Macka(String ime, int godine, String boja) {
        super(ime, godine);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void zvuk(){
        System.out.println("mjau mjau");
    }
}
