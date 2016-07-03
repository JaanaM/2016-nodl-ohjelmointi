/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {

    private boolean paalla = false;

    @Override
    public boolean onPaalla() {
        return paalla;
    }

    @Override
    public void paalle() {
        this.paalla = true;
    }

    @Override
    public void poisPaalta() {
        this.paalla = false;
    }

    @Override
    public int mittaa() {

        Random random = new Random();
        if (onPaalla()) {
            int mittaus = -30 + random.nextInt(61);
            return mittaus;
        } else {
            throw new IllegalStateException("Ei voi mitata koska mittari ei ole päällä");
        }
    }

}
