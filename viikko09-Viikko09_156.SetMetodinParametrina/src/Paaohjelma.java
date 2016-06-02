
import java.util.HashSet;
import java.util.Set;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Set<String> nimet = new HashSet<>();
        nimet.add("eka");
        nimet.add("Eka");
        nimet.add("toka");
        nimet.add("toka");
        nimet.add("toka");
        
        System.out.println(palautaKoko(nimet));
    }

    // toteuta tänne staattinen luokkametodi palautaKoko, joka palauttaa parametrina 
    // saamansa set-olion alkioiden lukumäärän

    private static int palautaKoko(Set<String> nimet) {
        return nimet.size();
    }
}
