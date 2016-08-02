/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Saria
 */
public class OmaUseanKaannoksenSanakirja implements UseanKaannoksenSanakirja {

    private Map<String, Set<String>> kaannokset;

    public OmaUseanKaannoksenSanakirja() {
        this.kaannokset = new HashMap<>();
    }

    // add translation to the vocabulary
    @Override
    public void lisaa(String sana, String kaannos) {
        if (!this.kaannokset.containsKey(sana)) {
            this.kaannokset.put(sana, new HashSet<>());
        }
        this.kaannokset.get(sana).add(kaannos);

    }
    // return translation
    @Override
    public Set<String> kaanna(String sana) {
        if (!this.kaannokset.containsKey(sana)) {
            System.out.println("Sanaa ei löytynyt");
            return null;
        } else {
            return this.kaannokset.get(sana);
        }
    }
    // remove translation
    @Override
    public void poista(String sana) {
        if (!this.kaannokset.containsKey(sana)) {
            System.out.println("Sanaa ei löytynyt");
        } else {
            this.kaannokset.remove(sana);
        }
    }

}
