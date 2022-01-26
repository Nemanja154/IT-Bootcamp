package objekti;

public class Lokal extends Objekti{

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double racunajPorez() {
        return this.povrsina * koeficijent() * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina + ",zona:  " + this.zona );

    }
}
