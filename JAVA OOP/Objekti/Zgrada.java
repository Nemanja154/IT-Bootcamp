package objekti;

public class Zgrada extends Objekti{
    private int brojStanova;

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {
        return this.povrsina * this.koeficijent() * this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina + ",zona:  " + this.zona + ",Broj stanova " + this.brojStanova );

    }
}
