import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Proizvod p1 = new Prehrambeni("475sdi7", "mleko", 100, 2021, 12, 30);
        Proizvod p2 = new Tehnika("345kh3", "sporet", 35000, 5, 40);
        Proizvod p3 = new AlkoholnaPica("654k33", "pivo", 120, "staklena", 10);
        Proizvod p4 = new Pice("774gg", "sok breskva", 200, "kartonska");

        Proizvod[] niz = {p1, p2, p3, p4};

        for (Proizvod pr : niz) {
            if (pr.getCena() > 200)
                pr.setCena(pr.getCena() - (pr.getCena() * 0.15));

            if (pr instanceof AlkoholnaPica) {
                pr.setCena(pr.getCena() - (pr.getCena() * 0.5));
            }
        }


        System.out.println("Unesite ime i prezime: ");
        String i = scanner.nextLine();


        Korpa korpa = new Korpa(i);


        while (true) {
            System.out.println("Unesite bar kod proizvoda: ");
            String b = scanner.nextLine().toLowerCase();

            //imam neki problem sa skenerom u 37 redu.Prvi put kad prodjem kroz petlju lepo unese vrednosti,drugi put mi ubaci prazan string u b,ne mogu da skontam zasto

            if (b.equals("zavrsi kupovinu")) {
                break;
            }

            System.out.println("Unesite kolicinu: ");
            int kol = scanner.nextInt();

            boolean postoji = false;
            for (Proizvod p : niz) {
                if (p.getBarKod().equals(b)) {
                    korpa.addProizvod(p, kol);
                    postoji = true;
                }

            }

            if (!postoji) {
                System.out.println("Nepostojeci proizvod");
            }

        }


        korpa.ispisiRacun();


    }
}

