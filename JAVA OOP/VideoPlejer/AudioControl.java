package VideoPlejer;

public class AudioControl extends Control{
    private boolean smanjiPojacaj;

    public AudioControl(boolean smanjiPojacaj){
        super();
        this.smanjiPojacaj = smanjiPojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
        if(smanjiPojacaj && vp.getJacinaZvuka() <= 99){
            vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
        }else if(!smanjiPojacaj && vp.getJacinaZvuka() >=1){
            vp.setJacinaZvuka((vp.getJacinaZvuka()) - 1);
        }else{
            System.out.println("Ne moze da se promeni jacina zvuka");
        }

    }
}
