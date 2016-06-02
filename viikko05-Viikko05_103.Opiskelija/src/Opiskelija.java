/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Opiskelija {
    private String nimi;
    private String opiskelijanumero;
    
    public Opiskelija (String nimi, String opiskelijanumero){
        this.nimi = nimi;
        this.opiskelijanumero = opiskelijanumero;
    }

    public String haeNimi() {
        return nimi;
    }

    public String haeOpiskelijanumero() {
        return opiskelijanumero;
    }

    @Override
    public String toString() {
        return nimi + " (" + opiskelijanumero + ")";
    }
    
    
}
