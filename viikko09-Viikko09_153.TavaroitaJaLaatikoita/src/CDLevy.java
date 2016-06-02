/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class CDLevy implements Talletettava{
    private String artisti;
    private String nimi;
    private int julkaisuvuosi;
    private double paino;

    public CDLevy(String artisti, String nimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.paino = 0.1;
    }

    @Override
    public String toString() {
        return this.artisti + ": " + this.nimi + " (" + this.julkaisuvuosi + ")";
    }

    @Override
    public double paino() {
        return paino;
    }
    
    
}
