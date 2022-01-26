package PozorisnaPredstava;

import java.util.concurrent.atomic.AtomicInteger;

public class Pozoriste {
    private int id;
    private String naziv;

    public Pozoriste(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString() {
        return "Pozoriste{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                '}';
    }
}
