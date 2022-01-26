package Flase;

public class StaklenaFlasa extends Flasa {
    private double cenaSaKaucijom;

    public StaklenaFlasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstePica vrstaPica) {
        super(nalepnica, cenaBezKaucije, zapremina, vrstaPica);
    }

    public double getCenaSaKaucijom() {
        return cenaSaKaucijom;
    }

    public void setCenaSaKaucijom(double cenaSaKaucijom) {
        this.cenaSaKaucijom = cenaSaKaucijom;
    }

    public void racunajCenuSaKaucijom() {
        if (getZapremina() < 0.5)
            setCenaSaKaucijom(getCenaBezKaucije() + (getCenaBezKaucije() * 0.05));
        setCenaSaKaucijom(getCenaBezKaucije() + (getCenaBezKaucije() * 0.10));

    }

    @Override
    public String toString() {
        return super.toString() + "- staklena" ;
    }


}
