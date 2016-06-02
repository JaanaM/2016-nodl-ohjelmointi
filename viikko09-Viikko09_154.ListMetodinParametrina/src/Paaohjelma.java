
import java.util.ArrayList;
import java.util.List;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        List<String> nimet = new ArrayList<>();
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("kolmas");

        System.out.println(palautaKoko(nimet));

    }

    public static int palautaKoko(List<String> nimet) {
        return nimet.size();
    }

    // toteuta tänne staattinen luokkametodi palautaKoko, joka palauttaa parametrina 
    // saamansa lista-olion alkioiden lukumäärän
}
