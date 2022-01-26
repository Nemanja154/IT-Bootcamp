import java.util.Comparator;

public abstract class Planinar implements Comparable<Planinar> {
    public int id;
    public String imeIPrezime;
    public int brojPoena;

    public Planinar(int id, String imeIPrezime, int brojPoena) {
        this.id = id;
        this.imeIPrezime = imeIPrezime;
        this.brojPoena = brojPoena;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    @Override
    public String toString() {
        return "Planinar{" +
                "id=" + id +
                ", imeIPrezime='" + imeIPrezime + '\'' +
                ", brojPoena=" + brojPoena +
                '}';
    }

    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina p);


    @Override
    public int compareTo(Planinar p) {
        return (p.getBrojPoena() - getBrojPoena());
    }
}
