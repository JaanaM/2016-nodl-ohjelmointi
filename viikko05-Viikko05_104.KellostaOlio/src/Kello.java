
public class Kello {

    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        // luodaan kello joka asetetaan parametrina annettuun aikaa
        // laskurit tunneille, minuuteille ja sekunneille; 
        this.tunnit = new YlhaaltaRajoitettuLaskuri(23);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59);
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        // laskurien arvot tulee asettaa parametreina saatuun aikaan
        this.tunnit.asetaArvo(tunnitAlussa);
        this.minuutit.asetaArvo(minuutitAlussa);
        this.sekunnit.asetaArvo(sekunnitAlussa);

    }

    public void etene() {
        // kello etenee sekunnilla
        sekunnit.seuraava();
        // minuuttimäärä kasvaa
        if (sekunnit.arvo()== 0) {
            minuutit.seuraava();
            // jos minuuttimäärä menee nollaan, tuntimäärä kasvaa
            if (minuutit.arvo() == 0) {
                tunnit.seuraava();
            }
        }
    }

    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        String merkkijono = "";
        if (tunnit.arvo() < 10) {
            merkkijono = "0" + tunnit.arvo() + ":";
        }else {
            merkkijono = tunnit.arvo() + ":";
        }
        if (minuutit.arvo() < 10) {
            merkkijono += "0" + minuutit.arvo() + ":";
        }else {
            merkkijono += minuutit.arvo() + ":";
        }
        if (sekunnit.arvo() < 10) {
            merkkijono += "0" + sekunnit.arvo();
        }else {
            merkkijono += sekunnit.arvo() + "";
        }
        
        return merkkijono;
    }
}
