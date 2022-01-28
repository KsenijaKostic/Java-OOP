package vezbanjeNaCasu.nedelja6.Nasledjivanje;

public class Profesor extends Osoba{
    private String predmetKojiPredaje;

    public Profesor(String ime, String prezime, int godiste, String predmetKojiPredaje) {
        super(ime, prezime, godiste);
        this.predmetKojiPredaje = predmetKojiPredaje;
    }

    public String getPredmetKojiPredaje() {
        return predmetKojiPredaje;
    }

    public void setPredmetKojiPredaje(String predmetKojiPredaje) {
        this.predmetKojiPredaje = predmetKojiPredaje;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getIme());     //da uzmemo samo ime i samo njega da ispisemo. ima super ispred jer se odnosi na glavnu klasu

        return sb.toString();
    }
}
