package Osoba;

public class Zaposleni extends Osoba{
    private double mesecnaZarada;
    private boolean odobrenGodisnji;


    public Zaposleni(String jmbg, String ime, String prezime, double mesecnaZarada, boolean odobrenGodisnji) {
        super(jmbg, ime, prezime);
        this.mesecnaZarada = mesecnaZarada;
        this.odobrenGodisnji = odobrenGodisnji;
    }

    public double getMesecnaZarada() {
        return mesecnaZarada;
    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "mesecnaZarada=" + mesecnaZarada +
                ", odobrenGodisnji=" + odobrenGodisnji +
                '}' + "\n";
    }
}
