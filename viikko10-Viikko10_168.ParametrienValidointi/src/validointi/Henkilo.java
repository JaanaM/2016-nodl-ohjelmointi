package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) throws Exception {
        if (nimi == null || nimi.length() == 0 || nimi.length() > 40) {
            throw new IllegalArgumentException("Syötä nimi joka on enintään 40 pitkä");
        } else {
            this.nimi = nimi;
        }
        if (ika < 0 || ika > 120) {
            throw new IllegalArgumentException("Syötä oikea ikä");
        } else {
            this.ika = ika;
        }

    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
