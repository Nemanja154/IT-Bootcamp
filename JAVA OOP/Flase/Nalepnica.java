package Flase;

import java.util.concurrent.atomic.AtomicInteger;

public class Nalepnica {
    private String naziv;
    private int identifikaor;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Nalepnica(String naziv) {
        this.naziv = naziv;
        this.identifikaor = count.incrementAndGet();
    }

    public String getNaziv() {
        return naziv;
    }

    public int getIdentifikaor() {
        return identifikaor;
    }

    @Override
    public String toString() {
        return this.naziv + ":" + this.identifikaor;
    }
}
