
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class YleisimmatSanat2 implements ToistonTunnistin {

    ArrayList<Sana> sanat;

    YleisimmatSanat2() {
        sanat = new ArrayList();
    }

    @Override
    public List<String> yleisetSanat(List<String> sanalista) {
        List<String> yleisetSanat = new ArrayList<>();
        boolean sanaListassa;
        // loop trough words and find equals
        for (int i = 0; i < sanalista.size(); i++) {
            String verrattava = sanalista.get(i);
            sanaListassa = false;
            int laskuri = 1; // at least we have one of the word
            for (int j = 0; j < sanalista.size(); j++) {
                if (j != i) { // if not the same word as we compare
                    // if we found the same word increase the amount 
                    if (verrattava.equals(sanalista.get(j))) {
                        laskuri++;
                    }
                }
            }
            // look if the new object is already on the list
            Sana uusiSana = new Sana(verrattava, laskuri);
            if (!this.sanat.contains(uusiSana)) { // if not on the list add
                this.sanat.add(new Sana(verrattava, laskuri)); // add the word and the amount to the list  
            }
        }
        // sort the words and add only top 3
        Collections.sort(this.sanat);
        int laskuri = 0; // counter
        for (Sana sana : this.sanat) {
            if (laskuri < 3) { // count to three
                yleisetSanat.add(sana.getSisalto());
            }
            laskuri++;
        }
        return yleisetSanat;

    }

}
