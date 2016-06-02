
public class Maksukortti {

    private double saldo;

    public Maksukortti(double saldo) {
        this.saldo = saldo;
    }

    public double saldo() {
        return this.saldo;
    }

    public void lataaRahaa(double lisays) {
        if (lisays >= 0) {
            this.saldo += lisays;
        }
    }

    public boolean otaRahaa(double maara) {
        // toteuta metodi siten että se ottaa kortilta rahaa vain jos saldo on vähintään maara
        if (this.saldo >= maara) {
            this.saldo = this.saldo - maara;
            return true;
        } else { // ei ole tarpeeksi rahaa 
            return false;
        }
    }
}
