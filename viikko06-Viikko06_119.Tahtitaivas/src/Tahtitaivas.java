
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Tahtitaivas {

    private double tiheys;
    private int leveys;
    private int korkeus;
    private int tahtiaViimeTulostuksessa;

    public Tahtitaivas(double tiheys) {
        this.tiheys = tiheys;
        this.leveys = 20;
        this.korkeus = 10;
    }

    public Tahtitaivas(int leveys, int korkeus) {
        this.tiheys = 0.1;
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    public Tahtitaivas(double tiheys, int leveys, int korkeus) {
        this.tiheys = tiheys;
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    public void tulostaRivi() {
        String[] rivi = new String[this.leveys];
        Random arpoja = new Random();

        for (int i = 0; i < rivi.length; i++) {
            double todennakoisyys = arpoja.nextDouble();
            if (todennakoisyys <= this.tiheys) {
                rivi[i] = "*";
                this.tahtiaViimeTulostuksessa++;
            } else {
                rivi[i] = " ";
            }
        }
        for (String tahti : rivi) {
            System.out.print(tahti);
        }
        System.out.println("");

    }

    public void tulosta() {
        // aloitetaan uusi tulostus
        this.tahtiaViimeTulostuksessa = 0;
        for (int i = 0; i < this.korkeus; i++) {
            tulostaRivi();
        }
    }

    public int tahtiaViimeTulostuksessa() {
        return this.tahtiaViimeTulostuksessa;
    }
}
