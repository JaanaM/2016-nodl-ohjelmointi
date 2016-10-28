package luola;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pelialue implements Siirrettava {

    private int[][] pelialue;
    private List<Siirrettava> nappulat;
    private List<Pelinappula> pelinappulat;
    private int hirvioidenMaara;
    Luola luola;

    public Pelialue(int korkeus, int leveys, int hirvioidenMaara) {
        pelialue = new int[korkeus][leveys];
        this.nappulat = new ArrayList<>();
        this.pelinappulat = new ArrayList<>();
        this.hirvioidenMaara = hirvioidenMaara;
    }

    public void pelitilanne() {
        alustaPeli();
        //   return pelialue;
    }

    public void lisaaPelinappula(Siirrettava siirrettava) {
        nappulat.add(siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava : nappulat) {
            siirrettava.siirra(dx, dy);
        }
    }

    private void alustaPeli() {
        Pelinappula pelaaja = new Pelinappula('@', 0, 0);
        pelinappulat.add(pelaaja);
        lisaaPelinappula(pelaaja);
        luoHirviot();
        for (int y = 0; y < pelialue[0].length; y++) { // sivulle
            for (int x = 0; x < pelialue.length; x++) { // alas
                for (Pelinappula p : pelinappulat) {
                    if (p.getX() == x && p.getY() == y) {
                        System.out.print(p.getTyyppi());
                    } else {
                        System.out.print(".");
                    }
                }

            }
            System.out.println("");
        }
    }

    @Override
    // return object positions on own lines
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Siirrettava siirrettava : nappulat) {
            sb.append(siirrettava.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private void luoHirviot() {
        Random r = new Random();
        for (int i = 0; i < hirvioidenMaara; i++) {
            int x = r.nextInt(pelialue.length);
            int y = r.nextInt(pelialue[0].length);
            Pelinappula hirvio = new Pelinappula('h', x, y);
            pelinappulat.add(hirvio);
            lisaaPelinappula(hirvio);
        }

    }

}
