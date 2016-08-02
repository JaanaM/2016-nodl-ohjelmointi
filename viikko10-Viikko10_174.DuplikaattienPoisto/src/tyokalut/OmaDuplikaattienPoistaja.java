/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyokalut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Saria
 */
public class OmaDuplikaattienPoistaja implements DuplikaattienPoistaja {

    private Set<String> uniikit;
    private int duplikaatit;

    public OmaDuplikaattienPoistaja() {
        this.uniikit = new HashSet<>();
        this.duplikaatit = 0;
    }

    @Override
    public void lisaa(String merkkijono) {
        if (!this.uniikit.contains(merkkijono)) {
            this.uniikit.add(merkkijono);
        } else {
            duplikaatit++;
        }
    }

    @Override
    public int getHavaittujenDuplikaattienMaara() {
        return duplikaatit;
    }

    @Override
    public Set<String> getUniikitMerkkijonot() {
        return uniikit;
    }

    @Override
    public void tyhjenna() {
        duplikaatit = 0;
        uniikit.removeAll(uniikit);
    }
}
