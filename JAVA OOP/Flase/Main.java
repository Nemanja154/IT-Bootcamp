package Flase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Nalepnica n = new Nalepnica("as");
        Nalepnica n1 = new Nalepnica("fg");

        ArrayList<Flasa> flasa = new ArrayList<>();


       Flasa f1 = new StaklenaFlasa(n,150,0.5,VrstePica.BEZALKOHOLNO);
       Flasa f2 = new StaklenaFlasa(n1,200,0.5,VrstePica.ALKOHOLNO);
       Flasa f3 = new StaklenaFlasa(n,200,0.5,VrstePica.ALKOHOLNO);

       flasa.add(f1);
       flasa.add(f2);
       flasa.add(f3);







    }
}
