/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.Collection;

/**
 *
 * @author saria
 */
public class Navetta {
    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;
    
    public Navetta(Maitosailio maitosailio){
        this.maitosailio = maitosailio;
    }
    public Maitosailio getMaitosailio(){
        return this.maitosailio;
    }
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(maitosailio);
    }
    public void hoida(Lehma lehma){
        lypsyrobotti.lypsa(lehma);
    }
    public void hoida(Collection<Lehma> lehmat){
        for (Lehma lehma : lehmat) {
            lypsyrobotti.lypsa(lehma);
        }
    }
    public String toString(){
        return this.maitosailio.toString();
    }
    
}
