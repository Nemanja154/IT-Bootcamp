package Telefonija;

import java.util.ArrayList;

public class Korisnik {
    private int id;
    private String ime;
    private String prezime;
    private Broj brojKorisnika;
    private ArrayList<Usluga> istorijaUsluga = new ArrayList<>();

    public Korisnik(String ime, String prezime, Broj brojKorisnika) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojKorisnika = brojKorisnika;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Broj getBrojKorisnika() {
        return brojKorisnika;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojKorisnika(Broj brojKorisnika) {
        this.brojKorisnika = brojKorisnika;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + this.brojKorisnika + "\n"
                + "Istorija usluga" + "\n"
                + getIstorijaUsluga();
    }

    public void posaljiPoruku(Broj b, String teks) {
        Poruka poruka = new Poruka(brojKorisnika, b, teks);
        istorijaUsluga.add(poruka);
    }

    public void pozovi(Broj b, int tr) {
        Poziv poziv = new Poziv(brojKorisnika, b, tr);
        istorijaUsluga.add(poziv);
    }

    public double cenaSvihUsluga() {
        double suma = 0;
        for (Usluga u : istorijaUsluga) {
            suma += u.cenaUsluge();
        }
        return suma;

    }
}
