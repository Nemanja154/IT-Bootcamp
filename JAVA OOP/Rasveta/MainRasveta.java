package Rasveta;

public class MainRasveta {
    public static void main(String[] args) {
        Lampion lampion1 = new Lampion(123,"plavi",true,2200.0);
        Lampion lampion2 = new Lampion(234,"crveni",false,1500.0);
        Lampion lampion3 = new Lampion(456,"zuti", true,2500.0);
        Lampion lampion4 = new Lampion(6768,"zeleni",true,1800.0);

        NovogodisnjaRasveta novogodisnjaRasveta = new NovogodisnjaRasveta();

        lampion2.popravi();
        novogodisnjaRasveta.dodaj(lampion1);
        novogodisnjaRasveta.dodaj(lampion2);
        novogodisnjaRasveta.dodaj(lampion3);
        novogodisnjaRasveta.dodaj(lampion4);

        System.out.println(novogodisnjaRasveta.toString());

        System.out.println(novogodisnjaRasveta.pronadji(1500.0,"plavi"));

    }
}
