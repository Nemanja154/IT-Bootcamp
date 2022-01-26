package Telefonija;

public class MainTelefonija {
    public static void main(String[] args) {
        Broj br1 = new Broj("381","021","1222223",false);
        Broj br2 = new Broj("381","021","2132121",false);

        Korisnik k1 = new Korisnik("Nemanja","Zdravkovic",br1);
        Korisnik k2 = new Korisnik("Ivana","Zinajic",br2);

        k1.posaljiPoruku(br2,"Cao");
        k1.posaljiPoruku(br2,"zdravo");
        k1.posaljiPoruku(br2,"hej");

        k1.pozovi(br2,122);
        k1.pozovi(br2,345);

        System.out.println(k1.toString());
        System.out.println(k2.toString());

        System.out.println(k1.cenaSvihUsluga());

    }
}
