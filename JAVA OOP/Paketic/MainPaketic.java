package Paketic;

public class MainPaketic {
    public static void main(String[] args) {
        NovogodisnjiPaketici np1 = new NovogodisnjiPaketici("", "decak", false, 3, true, false);
        NovogodisnjiPaketici np2 = new NovogodisnjiPaketici("", "devojcica", false, 4, true, false);
        NovogodisnjiPaketici np3 = new NovogodisnjiPaketici("", "decak", false, 2, true, false);
        NovogodisnjiPaketici np4 = new NovogodisnjiPaketici("", "devojcica", false, 3, true, false);
        NovogodisnjiPaketici np5 = new NovogodisnjiPaketici("", "decak", false, 5, true, false);
        NovogodisnjiPaketici np6 = new NovogodisnjiPaketici("", "devojcica", false, 1, true, false);

        DedaMraz dm = new DedaMraz();


        System.out.println(dm);

        dm.pripremiZaIsporuku(np1, "vozic");
        dm.pripremiZaIsporuku(np2, "barbika");
        dm.pripremiZaIsporuku(np3, "lego kockice");
        dm.pripremiZaIsporuku(np4, "bratz lutka");
        dm.pripremiZaIsporuku(np5, "dinosaurus");
        dm.pripremiZaIsporuku(np6, "plisani meda");

        dm.dodaj(np1);
        dm.dodaj(np2);
        dm.dodaj(np3);
        dm.dodaj(np4);
        dm.dodaj(np5);
        dm.dodaj(np6);
        dm.dodaj(np5);

        System.out.println(dm);
        dm.izbaci("devojcica");
        System.out.println(dm);


    }
}
