package VideoPlejer;

public class TimeControl extends Control{
    private boolean napredNazad;

    public TimeControl(boolean napredNazad) {
        super();
        this.napredNazad = napredNazad;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
        if(napredNazad && (vp.getTrenutnoVreme() <= vp.getDuzinaVidea() - 15) ) {
            vp.setTrenutnoVreme(vp.getTrenutnoVreme() + 15);
        }else if(!napredNazad && (vp.getTrenutnoVreme() >= 15)){
            vp.setTrenutnoVreme(vp.getTrenutnoVreme() - 15);
        }else{
            System.out.println("Ne moze da se premota.");
        }

    }

}
