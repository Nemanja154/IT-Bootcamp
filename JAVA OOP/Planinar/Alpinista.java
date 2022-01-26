public class Alpinista extends Planinar{

    public Alpinista(int id, String imeIPrezime, int brojPoena) {
        super(id, imeIPrezime, brojPoena);
    }

    @Override
    public double clanarina() {
        return 1500 - (1500*0.05 * getBrojPoena());
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(p.getVisina() <= 4000){
            setBrojPoena(getBrojPoena() + 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + "Alpinista{" +
                "id=" + id +
                ", imeIPrezime='" + imeIPrezime + '\'' +
                ", brojPoena=" + brojPoena +
                '}';
    }
}
