/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.List;


public class Keskiarvosensori implements Sensori {

    private ArrayList<Sensori> sensorit;
    private List<Integer> mittaukset;

    public Keskiarvosensori() {
        sensorit = new ArrayList<>();
        mittaukset = new ArrayList<>();
    }
    
    

    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
    }

    @Override
    public boolean onPaalla() { 
        int kaikki = 0; // all sensors
        for (Sensori sensori : sensorit) {
            if (!sensori.onPaalla()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void paalle() {
        for (Sensori sensori : sensorit) {
            if (!sensori.onPaalla()) {
                sensori.paalle();
            }
        }
    }

    @Override
    public void poisPaalta() {
        for (Sensori sensori : sensorit) {
            sensori.poisPaalta();
        }
    }

    @Override
    public int mittaa() {
        if (this.onPaalla() && sensorit.size() > 0) {
            int keskiarvo = 0;
            for (Sensori sensori : sensorit) {
                keskiarvo += sensori.mittaa();
            }
            keskiarvo = keskiarvo / sensorit.size();
            mittaukset.add(keskiarvo);
            return keskiarvo;
        } else {
            throw new IllegalStateException("Keskiarvosensorin tulee olla päällä ja sisältää sensoreita ennen mittaamista");
        }
    }

    public List<Integer> mittaukset() {
        return mittaukset;
    }

}
