package VideoPlejer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer(1050,500,20);
        ArrayList<Control> controls = new ArrayList<>();

//        Control premotaj = (new TimeControl(true));

//        controls.add(new TimeControl(true));
//        controls.add(new AudioControl(true));
//        controls.add(new QualityOptimizerControl(20));



        daljinski(controls,5,new AudioControl(true));
        daljinski(controls,3,new TimeControl(true));

        for(Control c : controls){
            c.izvrsiAkciju(vp);
        }
        vp.stampaj();
    }

    public static void daljinski(ArrayList<Control> a,int b,Control c){
        for(int i = 0; i < b; i++){
            a.add(c);
        }
    }
}
