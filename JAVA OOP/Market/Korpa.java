import java.util.HashMap;

public class Korpa {
    private String kupac;
    private HashMap<Proizvod,Integer> hm = new HashMap<Proizvod,Integer>();

    public Korpa(String kupac){
        this.kupac = kupac;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public HashMap<Proizvod, Integer> getHm() {
        return hm;
    }


    public void addProizvod(Proizvod proizvod, Integer kolicina){
        this.hm.put(proizvod,kolicina);
    }
    public void ispisiRacun(){
        for(Proizvod p : hm.keySet()){
            System.out.println(p.getNaziv() + " " + hm.get(p) + " " + p.getCena()*hm.get(p));
        }
        int sum = 0;
        for (Proizvod p : hm.keySet()){
            sum += p.getCena()* hm.get(p);
        }
        System.out.println("Za uplatu: " + sum);
    }
}
