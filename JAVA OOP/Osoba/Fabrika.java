package Osoba;

import java.util.HashMap;

public class Fabrika implements RadSaMapom,ProsecnaZarada{
    private String naziv;
    private HashMap<String,Zaposleni> zaposleni = new HashMap<>();

    public Fabrika(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public double prosek() {
        if(zaposleni.isEmpty()){
            System.out.println("Lista je prazna");
            return 0;
        }
        double suma = 0;
        for(Zaposleni z : zaposleni.values() ) {
            suma += z.getMesecnaZarada();
        }
        return suma/zaposleni.size();
    }

    @Override
    public boolean zaposli(Zaposleni z) {
        if(zaposleni.containsKey(z.getJmbg())){
            System.out.println("Neuspesno zaposljavanje");
            return false;
        }
        System.out.println("Uspesno zaposljavanje");
        zaposleni.put(z.getJmbg(), z);
        return true;
    }

    @Override
    public Zaposleni otpusti(String s, double d) {
        Zaposleni otpusteni = null;
        for(Zaposleni z : zaposleni.values()){
            if(z.getJmbg().equals(s) && z.getMesecnaZarada() > d){
                otpusteni = z;
                zaposleni.remove(z.getJmbg());
            }

        }
        return otpusteni;
    }

    @Override
    public String ispisiJmbgZaposlenih() {
        StringBuilder sb = new StringBuilder();
        for(String s : zaposleni.keySet()) {
            sb.append(s + "\n");
        }
        return sb.toString();

    }

    @Override
    public String toString() {
        return "Zaposleni=" + zaposleni +
                '}';
    }
}
