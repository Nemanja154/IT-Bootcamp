package PozorisnaPredstava;

public class MainPozoriste {
    public static void main(String[] args) {


        Pozoriste pozoriste = new Pozoriste(1, "SNP");
        Predstava predstava = new Predstava("Java Test", pozoriste);

        Zaposleni z1 = new Reditelj("Pera Peric", pozoriste, "Perica");
        Zaposleni z2 = new Glumac("Nikola Nikolic", pozoriste, "glavna");


        predstava.zaposli(z1);
        predstava.zaposli(z2);

//        System.out.println(z1);

        System.out.println(predstava);
        System.out.println("Broj zaposlenih: " + predstava.brojZaposlenih());
    }
}
