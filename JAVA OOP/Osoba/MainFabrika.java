package Osoba;

public class MainFabrika {
    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika("Bambi");

        Zaposleni z1 = new Zaposleni("12321","Nemanja","Zdravkovic",100000,true);
        Zaposleni z2 = new Zaposleni("43534","Pera","Petrovic",80000,false);
        Zaposleni z3 = new Zaposleni("6765","Djoka","Djokic",50000,true);

        fabrika.zaposli(z1);
        fabrika.zaposli(z2);
        fabrika.zaposli(z3);

        System.out.println(fabrika.prosek());

        fabrika.otpusti("6765",40000);

        System.out.println(fabrika);

        System.out.println(fabrika.ispisiJmbgZaposlenih());


    }
}
