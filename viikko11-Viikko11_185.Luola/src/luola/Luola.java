package luola;

import java.util.Scanner;

class Luola {

    private int leveys;
    private int korkeus;
    private int hirvioita;
    private int siirtoja;
    private boolean liikkuvatHirviot;
    private Pelialue pelikentta;

    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean liikkuvatHirviot) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.hirvioita = hirvioita;
        this.siirtoja = siirtoja;
        this.liikkuvatHirviot = liikkuvatHirviot;
        this.pelikentta = new Pelialue(korkeus, leveys, hirvioita);

    }

    public void run(Scanner lukija) {
        // alkutilanne
        naytaTilanne();
        while (siirtoja > 0) {
            System.out.print("Siirra: ");
            String liikkuja = lukija.nextLine();
            pelikentta.siirraPelaaja(liikkuja, liikkuvatHirviot);
            siirtoja--;
            if (pelikentta.getHirvioidenMaara() == 0) {
                System.out.println("VOITIT");
                break;
            }
            naytaTilanne();
        }
        if (pelikentta.getHirvioidenMaara() > 0) {
            System.out.println("HÄVISIT!");
        }

    }

    public boolean isLiikkuvatHirviot() {
        return liikkuvatHirviot;
    }

    private void naytaTilanne() {
        System.out.println(siirtoja);
        System.out.println();
        System.out.println(pelikentta);
        pelikentta.pelitilanne();
        System.out.println("");
    }

}
