public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maxUsponBezOpreme;

    public RekreativniPlaninar(int id, String imeIPrezime, int brojPoena, int tezinaOpreme, String okrug, int maxUsponBezOpreme) {
        super(id, imeIPrezime, brojPoena);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(this.maxUsponBezOpreme - (50 * this.tezinaOpreme) > p.getVisina()){
            setBrojPoena(getBrojPoena() + 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + "RekreativniPlaninar{" +
                "id=" + id +
                ", imeIPrezime='" + imeIPrezime + '\'' +
                ", brojPoena=" + brojPoena +
                ", tezinaOpreme=" + tezinaOpreme +
                ", okrug='" + okrug + '\'' +
                ", maxUsponBezOpreme=" + maxUsponBezOpreme +
                '}';
    }
}
