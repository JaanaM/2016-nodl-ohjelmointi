
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YleisimmatSanat1 implements ToistonTunnistin {

    private HashMap<String, Integer> toistuvatSanat;

    YleisimmatSanat1() {
        toistuvatSanat = new HashMap<>();
    }

    @Override
    public List<String> yleisetSanat(List<String> sanat) {
        List<String> yleisetSanat = new ArrayList<>();
        // loop trough words and find equals
        for (int i = 0; i < sanat.size(); i++) {
            String verrattava = sanat.get(i);
            int laskuri = 1; // at least we have one of the word
            for (int j = 0; j < sanat.size(); j++) {
                // if that word is already on the list break from the loop
                if (!toistuvatSanat.isEmpty() && toistuvatSanat.containsKey(verrattava)) {
                    break;
                } else if (j != i) { // if not the same word as we compare
                    // if we found the word increase the amount 
                    if (verrattava.equals(sanat.get(j))) {
                        laskuri++;
                    }
                }
            }
            if (!toistuvatSanat.containsKey(verrattava)) {
                toistuvatSanat.put(verrattava, laskuri); // add the word and the amount to the list  
            }
        }

        return jarjestaSanat();
    }

    private List<String> jarjestaSanat() {
        List<String> yleisimmat = new ArrayList<>();
        List<Integer> maarat = new ArrayList<>(toistuvatSanat.values());
        Collections.sort(maarat);
        Collections.reverse(maarat);
        int isompi = 0;
        while (true) {
            if (yleisimmat.size() < 3) {
                List<String> top = teeTopKolme(maarat.get(isompi));
                for (String t : top) {
                    if (yleisimmat.size() < 3 && !yleisimmat.contains(t)) { // do not add if it already have 3 words or contains it
                        yleisimmat.add(t);
                    }
                }
                isompi++;
            } else if (yleisimmat.size() == 3) {
                break;
            }
        }

        return yleisimmat;

    }

    private List<String> teeTopKolme(Integer isoinMaara) {
        List<String> yleisimmat = new ArrayList<>();
        for (Map.Entry<String, Integer> entrySet : toistuvatSanat.entrySet()) {
            String key = entrySet.getKey();
            Integer value = entrySet.getValue();
            if (value == isoinMaara) {
                yleisimmat.add(key);
            }
        }
        return yleisimmat;
    }

}
