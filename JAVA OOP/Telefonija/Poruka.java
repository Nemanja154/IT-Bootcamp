package Telefonija;

public class Poruka extends Usluga{
    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa,String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    @Override
    public String toString() {
        return this.brojOd + " -> " + this.brojKa + " " + this.tekstPoruke;
    }

    @Override
    public double cenaUsluge() {
        return (this.brojOd != null && this.brojKa != null && brojOd != brojKa && !brojOd.isFiksiniBroj() && !brojKa.isFiksiniBroj()) ? 3 : 0;

    }
}
