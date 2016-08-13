
public class Lintu {

    private String nimi;
    private String latinankielinenNimi;
    private int rengastusvuosi;

    public Lintu(String nimi, String latinankielinenNimi, int rengastusvuosi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.rengastusvuosi = rengastusvuosi;
    }

    @Override
    public String toString() {
        return this.latinankielinenNimi + " (" + this.rengastusvuosi + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Lintu verrattava = (Lintu) o;
        if (this.latinankielinenNimi == null || !this.latinankielinenNimi.equals(verrattava.latinankielinenNimi)) {
            return false;
        }
        if (this.rengastusvuosi != verrattava.rengastusvuosi) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.rengastusvuosi + this.latinankielinenNimi.hashCode();
    }

}
