package VideoPlejer;

public class QualityOptimizerControl extends Control{
    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
        double kvalitet = brzinaInterneta * 10.1;
        if(kvalitet <= 144) vp.setKvalitetVidea(144);
        else if(kvalitet > 144 && kvalitet <= 240) vp.setKvalitetVidea(240);
        else if(kvalitet > 240 && kvalitet <= 360) vp.setKvalitetVidea(360);
        else if(kvalitet > 360 && kvalitet <= 480) vp.setKvalitetVidea(480);
        else if(kvalitet > 480 && kvalitet <= 720) vp.setKvalitetVidea(720);
        else if(kvalitet > 720 && kvalitet <= 1080) vp.setKvalitetVidea(1080);
    }
}
