package Flase;

public class Flasa{
    private Nalepnica nalepnica;
    private double cenaBezKaucije;
    private double zapremina = 0.33;
    private VrstePica vrstaPica;

    public Flasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstePica vrstaPica) {
        this.nalepnica = nalepnica;
        this.cenaBezKaucije = cenaBezKaucije;
        this.zapremina = zapremina;
        this.vrstaPica = vrstaPica;
    }

    public Nalepnica getNalepnica() {
        return nalepnica;
    }

    public double getCenaBezKaucije() {
        return cenaBezKaucije;
    }

    public double getZapremina() {
        return zapremina;
    }

    public VrstePica getVrstaPica() {
        return vrstaPica;
    }

    public void setCenaBezKaucije(double cenaBezKaucije) {
        this.cenaBezKaucije = cenaBezKaucije;
    }

    @Override
    public String toString() {
        return this.nalepnica + "(" + this.cenaBezKaucije + "," + this.zapremina + "," + this.vrstaPica + ")";
    }
}
