package Atleticar;

public class MainAtleticar {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("Skok u daj","skakaci");
        Disciplina sprint = new Disciplina("100m sa preponama","trkaci");

        skok.dodajAtleticara(new Skakac("Marko Markovic",8.9));
        skok.dodajAtleticara(new Skakac("Darko Darkovic",7.2));
        skok.dodajAtleticara(new Skakac("Zarko Zarkovic",6.8));

        skok.diskvalifikujAtleticara("Marko Markovic");

        skok.najbolji();

        sprint.dodajAtleticara(new Trkac("Nikola Nikolic", 10.1));
        sprint.dodajAtleticara(new Trkac("Usain Bolt",9.1));
        sprint.dodajAtleticara(new Trkac("Dragan Jankovic",9.9));

        sprint.najbolji();
    }
}
