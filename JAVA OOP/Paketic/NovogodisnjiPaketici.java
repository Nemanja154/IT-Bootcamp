package Paketic;

import java.security.spec.RSAOtherPrimeInfo;

public class NovogodisnjiPaketici implements Pakovanje {

    private String opis;
    private String namenjen;
    private boolean spakovan;
    private int minimalanUzrast;
    private boolean zasluzen;
    private boolean spremanZaIsporuku;

    public NovogodisnjiPaketici(String opis, String namenjen, boolean spakovan, int minimalanUzrast, boolean zasluzen, boolean spremanZaIsporuku) {
        this.opis = opis;
        this.namenjen = namenjen;
        this.spakovan = spakovan;
        this.minimalanUzrast = minimalanUzrast;
        this.zasluzen = zasluzen;
        this.spremanZaIsporuku = spremanZaIsporuku;
    }

    public String getNamenjen() {
        return namenjen;
    }

    public boolean isSpakovan() {
        return spakovan;
    }

    public boolean isSpremanZaIsporuku() {
        return spremanZaIsporuku;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setSpremanZaIsporuku(boolean spremanZaIsporuku) {
        this.spremanZaIsporuku = spremanZaIsporuku;
    }

    @Override
    public boolean spakuj() {
        if (!this.zasluzen || this.spakovan)
            return false;
         if ((this.namenjen.equals("decak") || this.namenjen.equals("devojcica")) && this.minimalanUzrast > 2) {
             this.spakovan = true;
             System.out.println("Novogodisnji paketic je uspesno spakovan");
             return true;
         }
        return false;
    }

    @Override
    public String toString() {
        String s, z, sz;

        if (spakovan) {
            s = "spakovan";
        } else {
            s = "nije spakovan";
        }

        if (zasluzen) {
            z = "zasluzen";
        } else {
            z = "nije zasluzen";
        }

        if (spremanZaIsporuku) {
            sz = "spreman za isporuku";
        } else {
            sz = "nije spreman za isporuku";
        }

        return "NovogodisnjiPaketici{opis = " + opis
                + ",namenjen = " + namenjen
                + ",spakovan = " + s
                + ",minimalni uzrast = " + minimalanUzrast
                + ",zasluzen = " + z
                + ",spreman za isporuku = " + sz + "}" + "\n";

    }
}