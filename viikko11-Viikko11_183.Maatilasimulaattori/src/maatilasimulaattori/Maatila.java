/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.LinkedList;

/**
 *
 * @author saria
 */
public class Maatila implements Eleleva {

    private String omistaja;
    private Navetta navetta;
    private LinkedList<Lehma> lehmaLista = new LinkedList();

    @Override
    public void eleleTunti() {
        for (Lehma lehma : lehmaLista) {
            lehma.eleleTunti();
            lehma.eleleTunti();
        }
    }

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
    }

    public void lisaaLehma(Lehma lehma) {
        lehmaLista.add(lehma);
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti){
        navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    
    public void hoidaLehmat(){
        navetta.hoida(lehmaLista);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maatilan omistaja " + this.omistaja).append("\n");
        sb.append("Navetan maitosäiliö: " + navetta).append("\n");
        sb.append("Lehmat: ").append("\n");
        if (!lehmaLista.isEmpty()) {
            for (Lehma lehma : lehmaLista) {
                sb.append("\t").append(lehma).append("\n");
            }
        } else {
            sb.append("Ei lehmiä");
        }
        return sb.toString();
    }

    public String getOmistaja() {
        return omistaja;
    }

    public Navetta getNavetta() {
        return navetta;
    }
    

}
