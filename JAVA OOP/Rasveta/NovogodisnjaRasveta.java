package Rasveta;

import java.util.ArrayList;

public class NovogodisnjaRasveta {
    private int kapacitet = 5;
    private ArrayList<Lampion> lampioni = new ArrayList<>(kapacitet);

    public NovogodisnjaRasveta() {
    }

    public boolean dodaj(Lampion l) {
        if (lampioni.size() >= kapacitet || !l.isIspravan()) {
            return false;
        }
        for (Lampion la : lampioni) {
            if (l.getSifra() == la.getSifra()) {
                return false;
            }
        }
        return lampioni.add(l);
    }

    public Lampion pronadji(Double d, String s) {
        for (Lampion l : lampioni) {
            if (l.getCena() > d && l.getBoja().equals(s))
                return l;
        }
        return null;
    }

    public void akcija(){
        for(Lampion l : lampioni){
            if(l.getCena() > 1999.99)
                l.setCena(l.getCena() * 0.9);
        }
    }

    @Override
    public String toString() {
        if(lampioni.isEmpty())
            return "Lista je prazna";
        return "lampioni=" + lampioni;
    }
}



