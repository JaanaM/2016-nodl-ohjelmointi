
import varastot.MuistavaTuotevarasto;
import varastot.Muutoshistoria;
import varastot.Tuotevarasto;

public class Main {

    public static void main(String[] args) {
//        Tuotevarasto mehu = new Tuotevarasto("Juice", 1000.0);
//        mehu.lisaaVarastoon(1000.0);
//        mehu.otaVarastosta(11.3);
//        System.out.println(mehu.getNimi()); // Juice
//        mehu.lisaaVarastoon(1.0);
//        System.out.println(mehu);           // Juice: saldo = 989.7, tilaa 10.299999999999955

//        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
//        mehu.otaVarastosta(11.3);
//        System.out.println(mehu.getNimi()); // Juice
//        mehu.lisaaVarastoon(1.0);
//        System.out.println(mehu); // Juice: saldo = 989.7, vielä tilaa 10.3
//// mutta vielä historia() ei toimi kunnolla:
//        System.out.println(mehu.historia()); // [1000.0]
//        // saadaan siis vasta konstruktorin asettama historian alkupiste...
        // tuttuun tapaan:
        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
        mehu.otaVarastosta(11.3);
        System.out.println(mehu.getNimi()); // Juice
        mehu.lisaaVarastoon(1.0);
        System.out.println(mehu); // Juice: saldo = 989.7, vielä tilaa 10.3
// mutta nyt on historiaakin:
        System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]
        mehu.tulostaAnalyysi();

        Muutoshistoria mh = new Muutoshistoria();
        mh.lisaa(5.0);
        System.out.println(mh.suurinMuutos());
    }

}
