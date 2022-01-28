package VezbanjeOOP.MojaMuzika;

public class RockPesma extends Pesma{
    public RockPesma(String ime, int trajanje) {
        super(ime, "Rock", trajanje);
    }

    @Override
    public String zvuk() {
        return "Rock Rock";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n").append("Ja volim rock");
        return sb.toString();
    }
}
