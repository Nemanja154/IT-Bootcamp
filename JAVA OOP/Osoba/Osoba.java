package Osoba;

public class Osoba {
    private String jmbg;
    private String ime;
    private String prezime;

    public Osoba() {
    }

    public Osoba(String jmbg, String ime, String prezime) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "jmbg='" + jmbg + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
