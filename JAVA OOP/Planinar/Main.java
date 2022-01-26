public class Main {
    public static void main(String[] args) {
        PlaninarskiDom pd = new PlaninarskiDom("Dom",2001);
        Planina planina = new Planina("Kopaonik","Srbija",3500);

        RekreativniPlaninar rp1 = new RekreativniPlaninar(1,"Pera Peric",1,5,"Backa",2500);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(2,"Djoka Djokic",1,6,"Banat",3000);
        RekreativniPlaninar rp3 = new RekreativniPlaninar(3,"Mika Mikic",1,5,"Srem",4500);

        Alpinista alpinista1 = new Alpinista(4,"Nikola Nikolic",3);
        Alpinista alpinista2 = new Alpinista(5,"Marko Markovic",4);
        Alpinista alpinista3 = new Alpinista(6,"Nemanja Zdravkovic",10);

        pd.uclaniPlaninara(rp1);
        pd.uclaniPlaninara(rp2);
        pd.uclaniPlaninara(rp3);
        pd.uclaniPlaninara(alpinista1);
        pd.uclaniPlaninara(alpinista2);
        pd.uclaniPlaninara(alpinista3);

        System.out.println(pd);
        System.out.println("Broj uspesnih planinara: " + pd.brojUspesnihPlaninara(planina));
        System.out.println();

        System.out.println("Prihod od clanarine: " + pd.prihodOdClanarina());
        System.out.println();


        pd.sortiraj();
        System.out.println(pd);
        System.out.println();

        pd.izbaciPlaninara(1);
        System.out.println(pd);
    }
}
