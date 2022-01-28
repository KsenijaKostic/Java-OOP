package vezbanjeNaCasu.klase.knjiga;

import vezbanjeNaCasu.klase.osoba.osoba;

public class Knjiga {
    private String nazivKnjige;
    private osoba autor;
    private osoba vlasnik;
    private int brojStrana;
    private int  godinaIzdanja;

    //private metoda za proveravanje da li su vrednosti ispravne
    /* private void proveriZaNegativno(int brojStrana, int  godinaIzdanja){
           if(brojStrana <= 0){
            System.out.println("Niste uneli dobar broj strana, knjiga mora imati pozitivan broj stranica");
        } else {
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja <= 0){
            System.out.println("Niste uneli dobru godinu");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }
     */

    public Knjiga(String nazivKnjige, osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        if(brojStrana <= 0){
            System.out.println("Niste uneli dobar broj strana, knjiga mora imati pozitivan broj stranica");
        } else {
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja <= 0){
            System.out.println("Niste uneli dobru godinu");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, osoba autor, osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        if(brojStrana <= 0){
            System.out.println("Niste uneli dobar broj strana, knjiga mora imati pozitivan broj stranica");
        } else {
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja <= 0){
            System.out.println("Niste uneli dobru godinu");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public osoba getAutor() {
        return autor;
    }

    public void setAutor(osoba autor) {
        this.autor = autor;
    }

    public osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if(brojStrana <= 0){
            System.out.println("Niste uneli dobar broj strana, knjiga mora imati pozitivan broj stranica");
        } else {
            this.brojStrana = brojStrana;
        }
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja <= 0){
            System.out.println("Niste uneli dobru godinu");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String velicinaKnjige (){
        String velicina = "";

            if (brojStrana > 0 && brojStrana < 100){
                velicina = "mala knjiga";
            } else if (brojStrana < 300){
                velicina = "srednje velika knjiga";
            } else if (brojStrana < 600){
                velicina = "velika knjiga";
            } else {
                velicina = "bas velika knjiga";
            }
        return velicina;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
            sb.append("Naziv knjige: ");
            sb.append(nazivKnjige);
            sb.append("\n");

            sb.append("Autor knjige: ");
            if (autor == null){
                sb.append("Nepoznat \n");
            } else {
                sb.append(autor.getIme());
                sb.append(" ");
                sb.append(autor.getPrezime());
                sb.append("\n");
            }

            sb.append("Vlasnik knjige: ");
            if (vlasnik == null){
                sb.append("Knjiga nema vlasnika \n");
            } else {
                sb.append(vlasnik.getIme());
                sb.append(" ");
                sb.append(vlasnik.getPrezime());
                sb.append("\n");
            }

            sb.append("Broj strana: ");
            sb.append(brojStrana);
            sb.append("\n");

            sb.append("Godina izdanja ");
            sb.append(godinaIzdanja);
            sb.append("\n");

            sb.append(velicinaKnjige());
            sb.append("\n");

        return sb.toString();
    }
}
