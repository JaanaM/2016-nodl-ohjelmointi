/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.logiikka;

import java.util.ArrayList;
import java.util.List;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;

/**
 * Packing helper, it packs items to the box if they fit to the box
 *
 * @author Saria
 */
public class Pakkaaja {

    private int laatikoidenTilavuus;

    public Pakkaaja(int laatikoidenTilavuus) {
        this.laatikoidenTilavuus = laatikoidenTilavuus;
    }

    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
        ArrayList<Muuttolaatikko> laatikot = new ArrayList<>();
        ArrayList<Tavara> pakattavat = new ArrayList<>();
        pakattavat.addAll(tavarat);
        laatikot.add(new Muuttolaatikko(this.laatikoidenTilavuus));
        int i = 0; // box index
        for (Tavara tavara : pakattavat) {
            if (laatikot.get(i).lisaaTavara(tavara)) {
            } else {
                // make new box
                laatikot.add(new Muuttolaatikko(this.laatikoidenTilavuus));
                // add index
                i++;
                // add stuff to the box if it fits
                if (!laatikot.get(i).lisaaTavara(tavara)) {
                    System.out.println("Tavara ei mahtunut laatikkoon");
                }

            }
        }
        return laatikot;
    }
}
