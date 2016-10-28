/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luola;

public class Pelinappula implements Siirrettava{

    private char tyyppi;
    private int x;
    private int y;
    
    public Pelinappula (char tyyppi, int x, int y) {
        this.tyyppi = tyyppi;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getTyyppi() {
        return tyyppi;
    }

    @Override
    public String toString() {
        return tyyppi + " " + y + " " + x;
    }
    // moves object
    @Override
    public void siirra(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }
}
