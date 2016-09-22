/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

/**
 *
 * @author Saria
 */
public class Maitosailio {
    private double tilavuus;
    private double saldo;
    public Maitosailio() {
        this.tilavuus = 2000;
    }

    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return tilavuus - saldo;
    }

    public void lisaaSailioon(double maara) {
        if ((saldo + maara) <= tilavuus) {
             saldo +=maara;
        }else {
            saldo = tilavuus;
        }
       
    }
    public double otaSailiosta(double maara) {
        if (saldo > maara) {
            return saldo -= maara;
        }else {
            return saldo = 0; 
        }
       
    }

    @Override
    public String toString() {
        return "sailiossa tilaa: " + Math.ceil(saldo) + "/"+ Math.ceil(tilavuus);
    }
    
}
