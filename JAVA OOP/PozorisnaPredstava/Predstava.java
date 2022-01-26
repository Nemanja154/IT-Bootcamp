package PozorisnaPredstava;

import java.util.ArrayList;

public class Predstava {
    private String nazivPredstave;
    private Pozoriste p;
    private ArrayList<Zaposleni> zaposleni = new ArrayList<>();

    public Predstava(String nazivPredstave, Pozoriste p) {
        this.nazivPredstave = nazivPredstave;
        this.p = p;
    }

    public void zaposli(Zaposleni z){
        zaposleni.add(z);
    }

    public void otpusti(Zaposleni z){
        zaposleni.remove(z);
    }

    public int brojZaposlenih(){
        return zaposleni.size();
    }

    @Override
    public String toString() {
        return "Naziv Predstave: " + nazivPredstave + ", Pozorisete: " + p.getNaziv() + "\n" + zaposleni;

    }
}
