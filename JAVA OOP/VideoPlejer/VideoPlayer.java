package VideoPlejer;

import java.sql.SQLOutput;

public class VideoPlayer {
    private double duzinaVidea;
    private double trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer(double duzinaVidea, double trenutnoVreme, int jacinaZvuka) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;

    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme: " + this.trenutnoVreme + ",jacina zvuka: " + this.jacinaZvuka + ",kvalitet videa: " + this.kvalitetVidea) ;
    }

}
