
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Ostoskori {

    private Map<String, Ostos> ostoskori;

    public Ostoskori() {
        ostoskori = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (ostoskori.containsKey(tuote)) {
            for (String nimi : ostoskori.keySet()) {
                if (nimi.equals(tuote)) {
                    ostoskori.get(nimi).kasvataMaaraa();
                }
            }
        } else {
            ostoskori.put(tuote, new Ostos(tuote, 1, hinta));
        }

    }

    public int hinta() {
        int hinta = 0;
        for (String nimi : ostoskori.keySet()) {
            hinta = hinta + ostoskori.get(nimi).hinta();
        }
        return hinta;
    }

    public void tulosta() {
        for (String nimi : ostoskori.keySet()) {
            System.out.println(ostoskori.get(nimi).toString());
        }
    }
}
