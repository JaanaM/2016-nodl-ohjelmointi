
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);
        Koordinaatti koordinaatit = new Koordinaatti();
        if (nelio.getLeveys() % 2 != 0) {
            int lisattavaLuku = 1;
            while (lisattavaLuku <= nelio.getKorkeus() * nelio.getKorkeus()) {
                if (nelio.annaArvo(koko / 2, 0) == 0) {
                    // ensimmainen siirto
                    nelio.asetaArvo(koko / 2, 0, lisattavaLuku);
                    koordinaatit.asetaKoordinaatit(koko / 2, 0);
                    lisattavaLuku++;
                } else {
                    //seuraava luku
                    koordinaatit = liikuNeliossa(koordinaatit.getX(), koordinaatit.getY(), nelio);
                    nelio.asetaArvo(koordinaatit.getX(), koordinaatit.getY(), lisattavaLuku);
                    lisattavaLuku++;
                }
            }
        }

        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        return nelio;
    }

    public Koordinaatti liikuNeliossa(int x, int y, Taikanelio nelio) {
        int sarake = x + 1;
        int rivi = y - 1;
        while (true) {
            if (rivi < 0) { // yli korkeuden - palaa alas seuraavaan soluun
                rivi = nelio.getKorkeus() -1;
            } else if (sarake >= nelio.getLeveys()) { // yli leveyden - mene edellisen rivin ensimmäiseen
                sarake = 0;
            } else if (nelio.annaArvo(sarake, rivi) != 0) { // jos solussa on jo arvo
                sarake = x;
                rivi = y + 1;
            } else {
                break;
            }
        }
        Koordinaatti uudetKoordinaatit = new Koordinaatti();
        uudetKoordinaatit.asetaKoordinaatit(sarake, rivi);

        return uudetKoordinaatit;
    }
}
