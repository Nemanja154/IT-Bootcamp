package Atleticar;

public class Skakac extends Atleticar{


    public Skakac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeBolji(Atleticar a) {
        if(super.getRezultat() > a.getRezultat()){
            return true;
        }
        return false;
        }
}
