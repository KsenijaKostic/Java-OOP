package vezbanjeNaCasu.nedelja6.Zivotinjskocarstvo;

public class Pas extends Zivotinja{
    private String rasa;

    public Pas(String ime, int godine, String rasa) {
        super(ime, godine);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void zvuk(){
        System.out.println("av av av");
    }
}
