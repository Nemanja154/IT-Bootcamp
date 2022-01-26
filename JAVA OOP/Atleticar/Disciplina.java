package Atleticar;

import java.util.ArrayList;

public class Disciplina {
    private String ime;
    private String tip;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void dodajAtleticara(Atleticar a){
        this.atleticari.add(a);
    }

    public void diskvalifikujAtleticara(String s){

        for (int i = 0; i < atleticari.size(); i++){
            if(atleticari.get(i).getImeIPrezime().equals(s)){
                atleticari.remove(atleticari.get(i));
            }
        }
    }

    private Atleticar nadjiNajboljeg(){
        Atleticar najbolji = this.atleticari.get(0);
        for(int i = 0 ; i < atleticari.size() ; i++){
            if(atleticari.get(i).daLiJeBolji(najbolji)){
                najbolji = atleticari.get(i);
            }
        }
        return najbolji;
    }

    public void najbolji(){
        nadjiNajboljeg().stampaj();
    }
}
