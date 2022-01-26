public class Pice  extends Proizvod{
    private String ambalaza;

    public Pice(String barKod,String naziv,int cena,String ambalaza){
        super(barKod,naziv,cena);
        this.ambalaza = ambalaza;
    }

    public String getAmbalaza() {
        return ambalaza;
    }

    public void setAmbalaza(String ambalaza) {
        this.ambalaza = ambalaza;
    }

    @Override
    public void poruci(int kolicina) {
        double cena_ambalaze = 0;
        if(this.ambalaza.equals("kartonska")){
            cena_ambalaze = super.getCena() * 0.1;
            System.out.println("Vas racun je: " + (super.getCena() + cena_ambalaze)* kolicina);
        }
        if(this.ambalaza.equals("plasticna")){
            cena_ambalaze =super.getCena() * 0.2;
            System.out.println("Vas racun je: " + (super.getCena() + cena_ambalaze)* kolicina);
        }
        if(this.ambalaza.equals("staklena")){
            cena_ambalaze =super.getCena() * 0.3;
            System.out.println("Vas racun je: " + (super.getCena() + cena_ambalaze)* kolicina);
        }
        if(this.ambalaza.equals("limenka")){
            cena_ambalaze =super.getCena() * 0.3;
            System.out.println("Vas racun je: " + (super.getCena() + cena_ambalaze)* kolicina);
        }

    }

}
