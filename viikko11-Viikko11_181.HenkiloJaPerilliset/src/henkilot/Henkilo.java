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
public class Henkilo {

    private String nimi;
    private String osoite;

    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nimi).append("\n");
        sb.append("  ").append(osoite);
        return sb.toString();
    }

}
