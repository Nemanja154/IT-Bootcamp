package objekti;

public abstract class Objekti {
    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekti() {
    }

    public Objekti(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent(){
        if (this.zona == 1) return 1.4;
        if(this.zona == 2) return 1.1;
        return 1.05;
    }


    public abstract double racunajPorez();

    public abstract void stampaj();
}
