package luola;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pelialue {

    private int[][] pelialue;
    private List<Pelinappula> nappulat;
    private int hirvioidenMaara;
    private Random r;

    public int getHirvioidenMaara() {
        return hirvioidenMaara;
    }
    Luola luola;

    public Pelialue(int korkeus, int leveys, int hirvioidenMaara) {
        pelialue = new int[korkeus][leveys];
        this.nappulat = new ArrayList<>();
        this.hirvioidenMaara = hirvioidenMaara;
        r = new Random();
        alustaPeli();
    }

    public void pelitilanne() {
        naytaPelikentta();
        //   return pelialue;
    }

    public void lisaaPelinappula(Pelinappula nappula) {
        nappulat.add(nappula);
    }

    public void siirra(int dx, int dy) {
        for (Pelinappula nappula : nappulat) {
            nappula.siirra(dx, dy);
        }
    }

    private void alustaPeli() {
        Pelinappula pelaaja = new Pelinappula('@', 0, 0);
        lisaaPelinappula(pelaaja);
        luoHirviot();
    }

    @Override
    // return object positions on own lines
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pelinappula nappula : nappulat) {
            sb.append(nappula.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private void luoHirviot() {
        for (int i = 0; i < hirvioidenMaara; i++) {
            int x = r.nextInt(pelialue.length);
            int y = r.nextInt(pelialue[0].length);
            do {
                x = r.nextInt(pelialue.length);
                y = r.nextInt(pelialue[0].length);
            } while (!onkoKenttaTyhja(x, y));
            Pelinappula hirvio = new Pelinappula('h', x, y);
            lisaaPelinappula(hirvio);
        }

    }

    void siirraPelaaja(String liikkuja, boolean hirviotLiikkuu) {
        int montako = liikkuja.length();
        for (int i = 0; i < liikkuja.length(); i++) {
            char c = liikkuja.charAt(i);
            switch (c) {
                case 's':
                    if (onkoSiirtoSallittu(nappulat.get(0).getX(), nappulat.get(0).getY() + 1)) {
                        nappulat.get(0).siirra(0, 1);
                    }
                    break;
                case 'n':
                    if (onkoSiirtoSallittu(nappulat.get(0).getX(), nappulat.get(0).getY() - 1)) {
                        nappulat.get(0).siirra(0, -1);
                    }
                    break;
                case 'w':
                    if (onkoSiirtoSallittu(nappulat.get(0).getX() - 1, nappulat.get(0).getY())) {
                        nappulat.get(0).siirra(-1, 0);
                    }
                    break;
                case 'e':
                    if (onkoSiirtoSallittu(nappulat.get(0).getX() + 1, nappulat.get(0).getY())) {
                        nappulat.get(0).siirra(1, 0);
                    }
                    break;
            }
            if (hirviotLiikkuu) {
                liikutaHirvioita();
            }
            tuhoaHirviot();
        }

    }

    private void naytaPelikentta() {
        for (int y = 0; y < pelialue[0].length; y++) { // sivulle
            for (int x = 0; x < pelialue.length; x++) { // alas
                boolean loytyi = false;
                for (Pelinappula p : nappulat) { // show pieces on the board
                    if (p.getX() == x && p.getY() == y) {
                        System.out.print(p.getTyyppi());
                        loytyi = true;
                        break;
                    }
                }
                if (!loytyi) {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }

    public void liikutaHirvioita() {
        for (Pelinappula p : nappulat) { // get monsters
            int x = (r.nextInt(2) - 1);
            int y = r.nextInt(2) - 1;
            if (p.getTyyppi() == 'h') {
                if (onkoSiirtoSallittu(p.getX() + x, p.getY() + y)) {
                    p.siirra(x, y);
                }
            }
        }
    }

    private boolean onkoSiirtoSallittu(int x, int y) {
        if (y > pelialue[0].length || y < 0) {
            return false;
        } else if (x > pelialue.length || x < 0) {
            return false;
        } else {
            return onkoKenttaTyhja(x, y);
        }
    }

    private boolean onkoKenttaTyhja(int x, int y) {
        if (nappulat.size() > 1) {
        for (Pelinappula nappula : nappulat) {
            if (nappula.getX() == x && nappula.getY() == y) {
                if (nappula.getTyyppi() == 'h') {
                    return false;
                }
            }
        }    
        }
        
        return true;
    }

    private void tuhoaHirviot() {
        Pelinappula pelaaja = nappulat.get(0); // get player
        ArrayList<Pelinappula> poisttettavat = new ArrayList();
        for (Pelinappula pelinappula : nappulat) {
            {
                if (pelinappula.getTyyppi() == 'h') { // is the monster in same position as the player
                    if (pelinappula.getX() == pelaaja.getX() && pelinappula.getY() == pelaaja.getY()) {
                        poisttettavat.add(pelinappula);
                    }
                }
            }
        }
        // remove the monsters
        nappulat.removeAll(poisttettavat);
    }

}
