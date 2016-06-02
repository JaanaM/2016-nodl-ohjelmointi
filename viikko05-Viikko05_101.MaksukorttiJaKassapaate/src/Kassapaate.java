
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa = 1000.0;
        // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {

        // edullinen lounas maksaa 2.50 euroa.
        if (maksu >= 2.50) {
            this.edulliset++;
            // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
            maksu = maksu - 2.50;
            this.rahaa = this.rahaa + 2.50;
        }
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        // edullinen lounas maksaa 4.30 euroa.
        if (maksu >= 4.30) {
            this.maukkaat++;
            // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
            maksu = maksu - 4.30;
            this.rahaa = this.rahaa + 4.30;
        }
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        return maksu;
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        if (kortti.saldo() >= 2.50) {
            this.edulliset++;
            // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
            kortti.otaRahaa(2.50);
            return true;
            //this.rahaa = this.rahaa + 2.50;
        }
        // muuten palautetaan false
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        if (kortti.saldo() >= 4.30) {
            this.maukkaat++;
            // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
            kortti.otaRahaa(4.30);
            return true;
            //this.rahaa = this.rahaa + 4.30;
        }
        // muuten palautetaan false
        return false;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (!(summa < 0)) {
            kortti.lataaRahaa(summa);
            this.rahaa = this.rahaa + summa;
        }
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
