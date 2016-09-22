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
public class Lypsyrobotti {
    Maitosailio sailio;
    public Lypsyrobotti() {
        
    }
    public Maitosailio getMaitosailio() {
        if (sailio != null) {
            return sailio;
        }
        return null;
    }
    public void setMaitosailio(Maitosailio maitosailio) {
        this.sailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        try {
            sailio.lisaaSailioon(lypsava.lypsa());
        } catch (IllegalStateException e) {
            System.out.println("Maitosäilitö ei ole asennettu");
        }
    }
}
