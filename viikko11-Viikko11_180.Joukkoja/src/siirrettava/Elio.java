/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siirrettava;

/**
 *
 * @author Saria
 */
public class Elio implements Siirrettava {

    private int x;
    private int y;
    
    public Elio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
    // moves object
    @Override
    public void siirra(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

}
