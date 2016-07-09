package sanatutkimus;

import java.io.File;

public class Paaohjelma {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä

        File tiedosto = new File("src/pienilista.txt");
        // kaikki sanat tiedostossa src/sanalista.txt
        Sanatutkimus sanatutkimus = new Sanatutkimus(tiedosto);
        System.out.println("Sanoja: " + sanatutkimus.sanojenMaara());
        System.out.print("Z-sanat: ");
        System.out.println(sanatutkimus.kirjaimenZSisaltavatSanat());
        System.out.print("L-loppuiset");
        System.out.println(sanatutkimus.kirjaimeenLPaattyvatSanat());
        System.out.print("Palidromit");
        System.out.println(sanatutkimus.palindromit());
        System.out.println("Vokaalisanat");
        System.out.println(sanatutkimus.kaikkiVokaalitSisaltavatSanat());
    }
}
