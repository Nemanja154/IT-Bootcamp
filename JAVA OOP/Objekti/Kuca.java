package objekti;

public class Kuca extends Objekti{

    private int brojClanova;

    public Kuca(String adresa, double povrsina, int zona,int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return koeficijent() * this.povrsina;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina + ", zona: " + this.zona + ", Broj clanova: " + this.brojClanova);
    }
}
