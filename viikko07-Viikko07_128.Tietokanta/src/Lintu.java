/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Lintu {

    private String nimi;
    private String toinenNimi;
    private int havainnot;

    public Lintu() {
    }

    public Lintu(String nimi, String toinenNimi, int havainnot) {
        this.nimi = nimi;
        this.toinenNimi = toinenNimi;
        this.havainnot = havainnot;
    }

    public int getHavainnot() {
        return havainnot;
    }

    public String getNimi() {
        return nimi;
    }

    public String getToinenNimi() {
        return toinenNimi;
    }

    public void setHavainnot(int havainnot) {
        this.havainnot = havainnot;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.toinenNimi + "): " + this.havainnot + " havaintoa";
    }

}
