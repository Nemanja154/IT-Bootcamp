package Telefonija;

public class Poziv extends Usluga{
    private int trajanje;

    public Poziv(Broj brojOd, Broj brojKa,int trajanje) {
        super(brojOd, brojKa);
        this.trajanje = trajanje;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    @Override
    public String toString() {
        return this.brojOd + " -> " + this.brojKa + " " + this.trajanje/60 + ":" + this.trajanje%60;
    }

    @Override
    public double cenaUsluge() {
        return (this.brojOd != null && this.brojKa != null && brojOd == brojKa) ? Math.ceil(1.0 * this.trajanje/60) * 10 : 0;
    }
}
