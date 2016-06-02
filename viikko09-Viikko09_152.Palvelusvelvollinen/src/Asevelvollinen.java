/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Asevelvollinen implements Palvelusvelvollinen {

    private int tj;

    public Asevelvollinen(int tj) {
        this.tj = tj;
    }

    @Override
    public int getTJ() {
        return tj;
    }

    @Override
    public void palvele() {
        if (tj > 0) {
            this.tj--;
        }
    }

}
