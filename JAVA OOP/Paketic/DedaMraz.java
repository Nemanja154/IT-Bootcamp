package Paketic;

import java.util.ArrayList;
import java.util.List;

public class DedaMraz {
    public ArrayList<NovogodisnjiPaketici> novogodisnjiPaketicis;

    public DedaMraz() {
        this.novogodisnjiPaketicis = new ArrayList<>();
    }

    public boolean pripremiZaIsporuku(NovogodisnjiPaketici np, String s) {
        if (np.spakuj()) {
            np.setOpis(s);
            np.setSpremanZaIsporuku(true);
            System.out.println("Novogodisnji paketic je spreman za isporuku.");
            return true;
        }
        return false;
    }

//    public boolean dodaj(NovogodisnjiPaketici np) {
//
//        if(!np.isSpremanZaIsporuku())return false;
//        if(np.isSpremanZaIsporuku()&&novogodisnjiPaketicis.contains(np))return false;
//        return novogodisnjiPaketicis.add(np);
//
//}

    public boolean dodaj(NovogodisnjiPaketici novogodisnjiPaketic) {
        if(!novogodisnjiPaketic.isSpremanZaIsporuku())
            return false;

        for(NovogodisnjiPaketici np : novogodisnjiPaketicis)
            if(np.equals(novogodisnjiPaketic))
                return false;

        return novogodisnjiPaketicis.add(novogodisnjiPaketic);
    }


    public boolean izbaci(String s){
        for(NovogodisnjiPaketici np : novogodisnjiPaketicis)
            if(np.getNamenjen().equals(s)){
               return novogodisnjiPaketicis.remove(np);
            }
        return false;
    }

    @Override
    public String toString() {
        if(novogodisnjiPaketicis.isEmpty()){
            return "Vreca je prazna";
        }
        return "DedaMraz{" + "\n" + novogodisnjiPaketicis + "}" ;
    }
}
