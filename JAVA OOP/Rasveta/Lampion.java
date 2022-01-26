package Rasveta;

public class Lampion implements Popravka {
    private int sifra;
    private String boja;
    private boolean ispravan;
    private double cena;

    public Lampion(int sifra, String boja, boolean ispravan, double cena) {
        this.sifra = sifra;
        this.boja = boja;
        this.ispravan = ispravan;
        this.cena = cena;
    }

    public int getSifra() {
        return sifra;
    }

    public String getBoja() {
        return boja;
    }

    public boolean isIspravan() {
        return ispravan;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public boolean popravi() {
        if(!ispravan){
            this.ispravan = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String i;
        if(ispravan){
            i = "ispravan";
        }else{
            i = "nije ispravan";
        }

        return "Lampion{" +
                "sifra=" + sifra +
                ", boja='" + boja + '\'' +
                ", ispravan=" + i +
                ", cena=" + cena +
                '}' + "\n";
    }
}
