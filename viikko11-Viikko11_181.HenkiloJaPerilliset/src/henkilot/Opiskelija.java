/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilot;

/**
 *
 * @author Saria
 */
public class Opiskelija extends Henkilo {

    private int opintopisteet;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopisteet = 0;
    }

    public void opiskele() {
        opintopisteet++;
    }

    public int opintopisteita() {
        return opintopisteet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( super.toString()).append("\n");
        sb.append("  opintopisteitä ").append(opintopisteet);
        return sb.toString();
    }

}
