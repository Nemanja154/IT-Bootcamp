import java.time.LocalDate;

public class Prehrambeni extends Proizvod{
    private LocalDate datumIsteka;

    public Prehrambeni(String barKod,String naziv,int cena,int god,int mesec,int dan){
        super(barKod,naziv,cena);
        this.datumIsteka = LocalDate.of(god,mesec,dan);
    }

    public LocalDate getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(LocalDate datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    @Override
    public void poruci(int kolicina) {
        if(LocalDate.now().compareTo(datumIsteka) > 0){
            System.out.println("Datum je istekao.");
        }else{
            System.out.println("Vas racun je: " + super.getCena() * kolicina);
        }
    }
}
