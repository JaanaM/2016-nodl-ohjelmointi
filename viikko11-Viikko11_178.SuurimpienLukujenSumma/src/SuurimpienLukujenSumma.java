
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

public class SuurimpienLukujenSumma {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä

        List<Integer> luvut1 = new ArrayList<>();
        List<Integer> luvut2 = new ArrayList<>();
        luvut1.add(7);
        luvut1.add(2);
        luvut1.add(9);

        luvut2.add(11);
        luvut2.add(12);
        luvut2.add(5);

        List<List<Integer>> listat = new ArrayList<>();
        listat.add(luvut1);
        listat.add(luvut2);

        System.out.println(suurimpienLukujenSumma(listat)); // tulostaa 21
    }

    public static int suurimpienLukujenSumma(List<List<Integer>> lukulistat) {
        // toteuta metodin toiminnallisuus tänne
        List<Integer> suurimmat = new ArrayList<>(); 
        
        for (List<Integer> lukulista : lukulistat) {
            suurimmat.add(etsiSuurin(lukulista));
        }
        

        return laskeSumma(suurimmat);
    }

    private static int etsiSuurin(List<Integer> lukulista) {
        int suurin = lukulista.get(0);
        for (Integer luku : lukulista) {
            if (luku > suurin) {
                suurin = luku;
            }
        }
        return suurin;
    }

    private static int laskeSumma(List<Integer> suurimmat) {
        int summa = 0;
        for (Integer luku : suurimmat) {
            summa+= luku;
        }
        return summa;
    }
}
