package luola;

import java.util.Scanner;

class Luola {
    private int leveys;
    private int korkeus;
    private int hirvioita;
    private int siirtoja;
    private boolean liikkuvatHirviot;

    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean liikkuvatHirviot) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.hirvioita = hirvioita;
        this.siirtoja = siirtoja;
        this.liikkuvatHirviot = liikkuvatHirviot;
        
    }
    
    public void run(Scanner lukija){
        luoLuola();
    }

    private void luoLuola() {
        Pelialue pelikentta = new Pelialue(korkeus, leveys, hirvioita);
        pelikentta.pelitilanne();
        System.out.println(pelikentta.toString());
    }

    public int getHirvioita() {
        return hirvioita;
    }

    public int getSiirtoja() {
        return siirtoja;
    }

    public boolean isLiikkuvatHirviot() {
        return liikkuvatHirviot;
    }
    
}
