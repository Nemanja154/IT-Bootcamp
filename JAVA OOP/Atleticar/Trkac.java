package Atleticar;

public class Trkac extends Atleticar{


    public Trkac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeBolji(Atleticar a) {
        if(super.getRezultat() < a.getRezultat()){
            return true;
        }
        return false;
    }
}
