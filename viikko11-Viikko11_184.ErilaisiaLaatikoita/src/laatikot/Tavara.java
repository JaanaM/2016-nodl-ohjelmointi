package laatikot;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        if (paino < 0) {
            throw new IllegalArgumentException();
        }
        this.nimi = nimi;
        this.paino = paino;

    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public boolean equals(Object obj) {
        Tavara verrattava = (Tavara) obj;
        if (obj != null) {
            return this.nimi.equals(verrattava.nimi);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.nimi.hashCode() + 5;
    }

}
