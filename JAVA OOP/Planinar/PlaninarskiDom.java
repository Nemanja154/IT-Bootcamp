import java.util.ArrayList;

import java.util.Collections;


public class PlaninarskiDom {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari = new ArrayList<>();

    public PlaninarskiDom() {
    }

    public PlaninarskiDom(String naziv, int godinaOsnivanja) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void uclaniPlaninara(Planinar p){
        planinari.add(p);
    }

    public int brojUspesnihPlaninara(Planina p){
        int brojUspesnihPlaninara = 0;
        for(Planinar planinar : planinari){
            if (planinar.uspesanUspon(p)){
                brojUspesnihPlaninara += 1;
            }
        }
        return brojUspesnihPlaninara;
    }

    public void izbaciPlaninara(int id){
        for(Planinar p : planinari){
            if(p.getId() == id){
                planinari.remove(p);
            }
        }

    }

    @Override
    public String toString() {
        return "PlaninarskiDom{" +
                "naziv='" + naziv + '\'' +
                ", godinaOsnivanja=" + godinaOsnivanja +
                ", planinari=" + planinari +
                '}';
    }

    public double prihodOdClanarina(){
        double prihod = 0;
        for(Planinar p : planinari){
            prihod += p.clanarina();
        }
        return prihod;
    }



    public void sortiraj(){
        Collections.sort(planinari);
    }

}
