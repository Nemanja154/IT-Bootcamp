package PozorisnaPredstava;

public class Glumac extends Zaposleni {
    private String nazivUloge;

    public Glumac(String imeIPrezime, Pozoriste pozoriste, String nazivUloge) {
        super(imeIPrezime, pozoriste);
        this.nazivUloge = nazivUloge;
    }

}
