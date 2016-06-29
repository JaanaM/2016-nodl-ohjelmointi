package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        if (luvusta >= 0) {
            int kertoma = 1;
            for (int i = 1; i <= luvusta; i++) {
                kertoma *= i;
            }
            return kertoma;
        } else {
            throw new IllegalArgumentException("luvun täytyy olla positiivinen");
        }

    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if ((joukonKoko >= 0 && osaJoukonKoko >= 0) && joukonKoko > osaJoukonKoko) {
            int osoittaja = kertoma(joukonKoko);
            int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

            return osoittaja / nimittaja;
        } else {
            throw new IllegalArgumentException("lukujen pitää olla positiivisia ja joukon koko pitää olla suurempi kuin osajoukko");
        }

    }
}
