package Telefonija;

public class Broj {
    private String kodDrzave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksiniBroj;

    public Broj(String kodDrzave, String pozivniBroj, String broj,boolean fiksiniBroj) {
        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksiniBroj = fiksiniBroj;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean isFiksiniBroj() {
        return fiksiniBroj;
    }

    public void setFiksiniBroj(boolean fiksiniBroj) {
        this.fiksiniBroj = fiksiniBroj;
    }

    @Override
    public String toString() {
        return "+" + this.kodDrzave + " " + this.pozivniBroj + " " + this.broj;
    }

    private static boolean proveriDaLiStringSadrziSamoNumerike(String str){
        boolean jesteNumerici = true;

        for(int i = 0; i < str.length() ; i++){
            if(!Character.isDigit(str.charAt(i))){
                jesteNumerici = false;
                break;
            }
        }
        return jesteNumerici;
    }

    private static boolean proveriBroj(String kod,String pozivni,String broj){
        boolean jesteBroj = true;
            if(!(kod != null && kod.length() ==3 && proveriDaLiStringSadrziSamoNumerike(kod))){
                jesteBroj = false;
            }else if(!(pozivni != null && pozivni.length() == 2 && proveriDaLiStringSadrziSamoNumerike(pozivni))){
                jesteBroj = false;
            }else if(!(broj != null && (broj.length() == 7 || broj.length() == 8) && proveriDaLiStringSadrziSamoNumerike(broj))){
                jesteBroj = false;
            }

        return jesteBroj;
    }
}
