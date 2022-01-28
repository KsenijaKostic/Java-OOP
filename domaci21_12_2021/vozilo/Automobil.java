package domaci21_12_2021.vozilo;

public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik1;   // nisam bila sigurna da li se u zadatku trazio 1 vlasnik ili 4
    private String vlasnik2;   // pa sam uradila sa jednim, ali sam za vezbu i testiranje napravila jos 3
    private String vlasnik3;
    private String vlasnik4;


    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        if (vlasnik1 == null){
            System.out.println("Vozilo trenutno nema ni jednog vlasnika");
        }

    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getVlasnik1() {
        return vlasnik1;

    }

    public void setVlasnik1(String vlasnik1) {
            this.vlasnik1 = vlasnik1;

    }

    public String getVlasnik2() {
        return vlasnik2;
    }

    public void setVlasnik2(String vlasnik2) {
        this.vlasnik2 = vlasnik2;
    }

    public String getVlasnik3() {
        return vlasnik3;
    }

    public void setVlasnik3(String vlasnik3) {
        this.vlasnik3 = vlasnik3;
    }

    public String getVlasnik4() {
        return vlasnik4;
    }

    public void setVlasnik4(String vlasnik4) {
        this.vlasnik4 = vlasnik4;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je ");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model automobila je ");
        sb.append(model);
        sb.append("\n");
        sb.append("Serijski broj automobila je ");
        sb.append(serijskiBroj);
        sb.append("\n");
        sb.append("Prvi vlasnik automobila: ");
        sb.append(vlasnik1);
        sb.append("\n");
        sb.append("Drugi vlasnik automobila: ");
        sb.append(vlasnik2);
        sb.append("\n");
        sb.append("Treci vlasnik automobila: ");
        sb.append(vlasnik3);
        sb.append("\n");
        sb.append("Cetvrti vlasnik automobila: ");
        sb.append(vlasnik4);
        sb.append("\n");

        return sb.toString();
    }


}
