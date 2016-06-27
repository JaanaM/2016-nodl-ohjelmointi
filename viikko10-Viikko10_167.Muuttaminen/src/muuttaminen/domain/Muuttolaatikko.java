/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.domain;

import java.util.ArrayList;

/**
 * Box for moving, it takes maximum capacity (maksimitilavuus) Adds items to the
 * box so that it won't go over the maximum capacity
 *
 * @author Saria
 */
public class Muuttolaatikko implements Tavara {

    private int maksimitilavuus;
    private ArrayList<Tavara> tavarat;

    public Muuttolaatikko(int maksimitilavuus) {
        this.maksimitilavuus = maksimitilavuus;
        this.tavarat = new ArrayList<>();

    }

    public boolean lisaaTavara(Tavara tavara) {

        if (this.getTilavuus() + tavara.getTilavuus() > maksimitilavuus) { // check if new item fits to the box 
            return false;
        } else {
            tavarat.add(tavara);
            return true;
        }
    }

    @Override
    public int getTilavuus() {
        int tilavuus = 0; // count the current capacity
        for (Tavara tavara1 : tavarat) {
            tilavuus += tavara1.getTilavuus();
        }
        return tilavuus;
    }

    @Override
    public String toString() {
        String tuloste = "Laatikossa olevat tavarat: \n";
        for (Tavara tavara : tavarat) {
            tuloste += tavara.toString() + "\n";
        }
        return tuloste;
    }

}
