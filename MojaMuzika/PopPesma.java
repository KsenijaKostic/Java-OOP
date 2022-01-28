package VezbanjeOOP.MojaMuzika;

public class PopPesma extends  Pesma{
    public PopPesma(String ime, int trajanje) {
        super(ime, "Pop", trajanje);
    }

    @Override
    public String zvuk() {
        return "Pop Pop";
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n").append("Ja pop rock");
        return sb.toString();
    }
}
