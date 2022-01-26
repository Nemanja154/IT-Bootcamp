package PozorisnaPredstava;

public class Reditelj extends Zaposleni {
    private String nadimak;

    public Reditelj(String imeIPrezime, Pozoriste pozoriste, String nadimak) {
        super(imeIPrezime, pozoriste);
        this.nadimak = nadimak;
    }
}
