
import java.util.Calendar;

public class Henkilo {

    private String nimi;
    private Paivays syntymapaiva;

    public Henkilo(String nimi, int pp, int kk, int vv) {
        this.nimi = nimi;
        this.syntymapaiva = new Paivays(pp, kk, vv);
    }

    public Henkilo(String nimi, Paivays syntymapaiva) {
        this.nimi = nimi;
        this.syntymapaiva = syntymapaiva;
    }

    public Henkilo(String nimi) {
        this.nimi = nimi;
        int paivat = Calendar.getInstance().get(Calendar.DATE);
        int kuukausi = Calendar.getInstance().get(Calendar.MONTH) + 1; // tammikuun numero on 0 joten lisätään 1
        int vuosi = Calendar.getInstance().get(Calendar.YEAR);
        Paivays tamaPaiva = new Paivays(paivat, kuukausi, vuosi);
        this.syntymapaiva = tamaPaiva;
    }

    public int ika() {
        // laske henkilön ikä syntymäpäivän ja tämän päivän perusteella
        // tämä päivä saadaan selville seuraavasti
        int paivat = Calendar.getInstance().get(Calendar.DATE);
        int kuukausi = Calendar.getInstance().get(Calendar.MONTH) + 1; // tammikuun numero on 0 joten lisätään 1
        int vuosi = Calendar.getInstance().get(Calendar.YEAR);
        Paivays tamaPaiva = new Paivays(paivat, kuukausi, vuosi);
        int ika = tamaPaiva.erotusVuosissa(this.syntymapaiva);
        return ika;
    }

    public boolean vanhempiKuin(Henkilo verrattava) {
        // vertaa henkilöiden ikiä käyttäen henkilöiden syntymäpäivää
        return this.syntymapaiva.aiemmin(verrattava.syntymapaiva);
    }

    public String getNimi() {
        return this.nimi;
    }

    public String toString() {
        return this.nimi + ", syntynyt " + this.syntymapaiva;
    }
}
