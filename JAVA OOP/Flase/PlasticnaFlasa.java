package Flase;

public class PlasticnaFlasa extends Flasa {
    private double cenaSaKaucijom;

    public PlasticnaFlasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstePica vrstaPica) {
        super(nalepnica, cenaBezKaucije, zapremina, vrstaPica);
        this.cenaSaKaucijom = super.getCenaBezKaucije();
    }
}
