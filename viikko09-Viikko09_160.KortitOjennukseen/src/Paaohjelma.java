
import java.util.ArrayList;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

        Kasi kasi1 = new Kasi();
        kasi1.lisaa(new Kortti(12, Kortti.HERTTA));
        Kasi kasi2 = new Kasi();
        kasi2.lisaa(new Kortti(3, Kortti.PATA));
        kasi2.lisaa(new Kortti(9, Kortti.PATA));
        kasi2.compareTo(kasi1);

        int vertailu = kasi1.compareTo(kasi2);

        if (vertailu < 0) {
            System.out.println("arvokkaampi käsi sisältää kortit");
            kasi2.tulosta();
        } else if (vertailu > 0) {
            System.out.println("arvokkaampi käsi sisältää kortit");
            kasi1.tulosta();
        } else {
            System.out.println("kädet yhtä arvokkaat");
        }
        System.out.println("");
        Kasi kasi = new Kasi();

        kasi.lisaa(new Kortti(12, Kortti.HERTTA));
        kasi.lisaa(new Kortti(4, Kortti.PATA));
        kasi.lisaa(new Kortti(2, Kortti.RUUTU));
        kasi.lisaa(new Kortti(14, Kortti.PATA));
        kasi.lisaa(new Kortti(7, Kortti.HERTTA));
        kasi.lisaa(new Kortti(2, Kortti.PATA));

        kasi.jarjestaMaittain();

        kasi.tulosta();
    }
}
