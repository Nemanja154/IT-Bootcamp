package PozorisnaPredstava;

public class Zaposleni {
    private String imeIPrezime;
    private Pozoriste pozoriste;

    public Zaposleni(String imeIPrezime, Pozoriste pozoriste) {
        this.imeIPrezime = imeIPrezime;
        this.pozoriste = pozoriste;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    @Override
    public String toString() {
        return " \n" + "Zaposleni: \n" + imeIPrezime + ",Naziv pozorista: " + pozoriste.getNaziv();
    }

}
