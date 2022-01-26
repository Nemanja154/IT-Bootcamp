package objekti;

import java.util.ArrayList;
import java.util.List;

public class PoreskaUprava {
    private String grad;
    private List<Objekti> objekti = new ArrayList<Objekti>();

    public PoreskaUprava(String grad) {
        this.grad = grad;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void dodajObjekat(Objekti o){
        this.objekti.add(o);
    }

    public double ukupanPorez(){
        double suma = 0;
        for(Objekti o : objekti){
            suma += o.racunajPorez();
        }
        return suma;
    }

    public void stampajSve(){
        for(Objekti o : objekti)
            o.stampaj();
    }
    
    public Objekti objekatSaNajvecimPorezom(){
        int indeks = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if(this.objekti.get(i).racunajPorez() > this.objekti.get(indeks).racunajPorez()){
                indeks = i;
            }
        }
        return this.objekti.get(indeks);
    }

    public Objekti objekatSaNajmanjimPorezom(){
        int indeks = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if(this.objekti.get(i).racunajPorez() < this.objekti.get(indeks).racunajPorez()){
                indeks = i;
            }
        }
        return this.objekti.get(indeks);
    }


}
