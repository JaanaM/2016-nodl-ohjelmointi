
public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // HUOM: oliomuuttujissa on määre final eli niiden arvoa ei voi muuttaa!
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    public String getMaa() {
        return maa;
    }

    public String getRekNro() {
        return rekNro;
    }
    

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    @Override
    public boolean equals(Object olio) {
        if (olio == null) {
            return false;
        }
        if (getClass() != olio.getClass()) {
            return false;
        }
        Rekisterinumero verrattava = (Rekisterinumero) olio;
        
        if (this.maa == null || !this.maa.equals(verrattava.getMaa())) {
            return false;
        }
        if (this.rekNro == null || !this.rekNro.equals(verrattava.getRekNro())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (this.maa == null) {
            return 5;
        }
        if (this.rekNro == null) {
            return 8;
        }
        
        return this.maa.hashCode() + this.rekNro.hashCode();
    }

}
