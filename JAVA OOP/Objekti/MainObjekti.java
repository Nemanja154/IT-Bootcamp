package objekti;

public class MainObjekti {
    public static void main(String[] args) {
    PoreskaUprava p = new PoreskaUprava("Nis");

    p.dodajObjekat(new Kuca("Kralja Vukasina",45,2,2));
    p.dodajObjekat(new Zgrada("Gavrila Principa 11",100,3,10));
    p.dodajObjekat(new Lokal("Dusan Veliki", 30,1));
    p.dodajObjekat(new Zgrada("Gavrila Principa",200,1,20));

    Objekti najveciPorez = p.objekatSaNajmanjimPorezom();
        System.out.println("Objekat sa najvecim porezom");
        najveciPorez.stampaj();

        Objekti najmanjiPorez = p.objekatSaNajmanjimPorezom();
        System.out.println("Objekat sa najmanjim porezom");
        najmanjiPorez.stampaj();

        System.out.println("Ukupan porez za ceo grad je " + p.ukupanPorez());

    }


}
