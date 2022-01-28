package domaci21_12_2021.sport;

public class Sportista {
    private String ime;
    private String prezime;
    private String klub;
    private int broj;

    public Sportista(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
        if (klub == null){
            System.out.println("Igrac " + ime + " " + prezime + " trenutno nema klub za koji igra");
        }
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        if(klub == null){
            System.out.println("Igrac trenutno nema klub za koji igra");
        } else{
        this.klub = klub;
        }
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        if (broj <= 0 ){
            System.out.println("Sportista trenutno nema odabran broj na dresu");
        } else {
        this.broj = broj;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Sportista ");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" trenutno igra za klub ");
        sb.append(klub);
        sb.append(" i nosi ");
        sb.append(broj);
        sb.append(" na dresu.");
        sb.append("\n");

        return sb.toString();
    }
}
